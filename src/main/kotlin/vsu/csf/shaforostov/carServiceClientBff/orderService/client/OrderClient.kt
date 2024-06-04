package vsu.csf.shaforostov.carServiceClientBff.orderService.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import vsu.csf.shaforostov.carServiceClientBff.common.commonProcessClientResponse
import vsu.csf.shaforostov.carServiceClientBff.config.HeadersProvider
import vsu.csf.shaforostov.carServiceClientBff.orderService.client.dto.OrderDetailDto
import vsu.csf.shaforostov.carServiceClientBff.orderService.client.dto.OrderDto

@Component
class OrderClient(
    @Value("\${client.order-service.url}")
    private val orderServiceUrl: String,
    private val headers: HeadersProvider,
) {

    private val restClient = RestClient.builder()
        .baseUrl(orderServiceUrl)
        .build()


    fun getAllOrders(): Array<OrderDto> {
        return restClient.get()
            .uri("")
            .headers { it.setBearerAuth(headers.getAuthorizationHeader()) }
            .retrieve()
            .toEntity(Array<OrderDto>::class.java)
            .commonProcessClientResponse()
    }

    fun getOrderById(id: Long): OrderDetailDto {
        return restClient.get()
            .uri("")
            .headers { it.setBearerAuth(headers.getAuthorizationHeader()) }
            .retrieve()
            .toEntity(OrderDetailDto::class.java)
            .commonProcessClientResponse()
    }

    fun checkout() {

    }


}