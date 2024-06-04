package vsu.csf.shaforostov.carServiceClientBff.orderService.service

import org.springframework.stereotype.Service
import vsu.csf.shaforostov.carServiceClientBff.orderService.client.OrderClient
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.response.OrderDetailResponse
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.response.OrderResponse
import vsu.csf.shaforostov.carServiceClientBff.userCarService.service.UserCarService

@Service
class OrderService(
    private val orderClient: OrderClient,
    private val userCarService: UserCarService,
) {

    fun getAllOrders(): List<OrderResponse> {
        val orders = orderClient.getAllOrders()
        return orders.map { order ->
            val userCar = userCarService.getUserCarById(order.userId)
            // TODO
            OrderResponse()
        }


    }

    fun getOrderById(id: Long): OrderDetailResponse {
        val order = orderClient.getOrderById(id)
        // TODO
        return OrderDetailResponse()

    }
}