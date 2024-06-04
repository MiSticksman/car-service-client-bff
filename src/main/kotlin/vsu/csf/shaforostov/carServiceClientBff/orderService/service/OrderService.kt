package vsu.csf.shaforostov.carServiceClientBff.orderService.service

import org.springframework.stereotype.Service
import vsu.csf.shaforostov.carServiceClientBff.orderService.client.OrderClient
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request.OrderCancelRequest
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request.OrderCheckoutRequest
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request.OrderUpdateRequest
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.response.OrderDetailResponse
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.response.OrderResponse
import vsu.csf.shaforostov.carServiceClientBff.userCarService.service.UserCarService

@Service
class OrderService(
    private val orderClient: OrderClient,
    private val userCarService: UserCarService,
) {

    fun getAllOrders(): List<OrderResponse> {
        val orders = orderClient.getOrders()
        return orders.map { order ->
            val userCar = userCarService.getUserCarById(order.userId)
            // TODO
            OrderResponse(1)
        }

    }

    fun getOrderById(id: Long): OrderDetailResponse {
        val order = orderClient.getOrderById(id)
        // TODO
        return OrderDetailResponse(1)
    }

    fun orderCheckout(request: OrderCheckoutRequest) = orderClient.checkout(request)

    fun orderUpdate(request: OrderUpdateRequest) = orderClient.updateOrder(request)

    fun orderCancel(request: OrderCancelRequest) = orderClient.cancelOrder(request)


}