package vsu.csf.shaforostov.carServiceClientBff.orderService.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import vsu.csf.shaforostov.carServiceClientBff.common.commonProcessClientResponse
import vsu.csf.shaforostov.carServiceClientBff.config.HeadersProvider
import vsu.csf.shaforostov.carServiceClientBff.orderService.client.dto.OrderDetailDto
import vsu.csf.shaforostov.carServiceClientBff.orderService.client.dto.OrderDto
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request.OrderCancelRequest
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request.OrderCheckoutRequest
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request.OrderUpdateRequest

@Component
class OrderClient(
    @Value("\${client.order-service.url}")
    private val orderServiceUrl: String,
    private val headers: HeadersProvider,
) {

    private val restClient = RestClient.builder()
        .baseUrl(orderServiceUrl)
        .build()


    fun getOrders(): Array<OrderDto> {
        return restClient.get()
            .uri("")
            .headers { it.setBearerAuth(headers.getAuthorizationHeader()) }
            .retrieve()
            .toEntity(Array<OrderDto>::class.java)
            .commonProcessClientResponse()
    }

    fun getOrderById(id: Long): OrderDetailDto {
        return restClient.get()
            .uri("path/$id")
            .headers { it.setBearerAuth(headers.getAuthorizationHeader()) }
            .retrieve()
            .toEntity(OrderDetailDto::class.java)
            .commonProcessClientResponse()
    }

    // order create endpoint
    fun checkout(request: OrderCheckoutRequest): OrderDetailDto {
        return restClient.post()
            .uri("")
            .body(request)
            .headers { it.setBearerAuth(headers.getAuthorizationHeader()) }
            .retrieve()
            .toEntity(OrderDetailDto::class.java)
            .commonProcessClientResponse()
    }

    fun updateOrder(request: OrderUpdateRequest): OrderDetailDto {
        return restClient.patch()
            .uri("")
            .body(request)
            .headers { it.setBearerAuth(headers.getAuthorizationHeader()) }
            .retrieve()
            .toEntity(OrderDetailDto::class.java)
            .commonProcessClientResponse()
    }

    fun cancelOrder(request: OrderCancelRequest) {
        restClient.patch()
            .uri("")
            .body(request)
            .headers { it.setBearerAuth(headers.getAuthorizationHeader()) }
            .retrieve()
            .toBodilessEntity()
            .commonProcessClientResponse()
    }

}