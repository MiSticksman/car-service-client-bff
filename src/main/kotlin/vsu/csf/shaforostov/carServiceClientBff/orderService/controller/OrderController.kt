package vsu.csf.shaforostov.carServiceClientBff.orderService.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vsu.csf.shaforostov.carServiceClientBff.orderService.client.dto.OrderDetailDto
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request.OrderCancelRequest
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request.OrderCheckoutRequest
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request.OrderUpdateRequest
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.response.OrderDetailResponse
import vsu.csf.shaforostov.carServiceClientBff.orderService.dto.response.OrderResponse
import vsu.csf.shaforostov.carServiceClientBff.orderService.service.OrderService

@RequestMapping("order")
@RestController
class OrderController(
    private val orderService: OrderService,
) {
    @GetMapping("/orders")
    fun getAllOrders():
            ResponseEntity<List<OrderResponse>> {
        return ResponseEntity.ok(orderService.getAllOrders())
    }

    @GetMapping("/{id}")
    fun getOrderById(
        @PathVariable id: Long,
    ): ResponseEntity<OrderDetailResponse> {
        return ResponseEntity.ok(orderService.getOrderById(id))
    }

    @PostMapping("/checkout")
    fun orderCheckout(request: OrderCheckoutRequest): ResponseEntity<OrderDetailDto> {
        return ResponseEntity.ok(orderService.orderCheckout(request))
    }

    @PatchMapping("/update")
    fun orderUpdate(request: OrderUpdateRequest): ResponseEntity<OrderDetailDto> {
        return ResponseEntity.ok(orderService.orderUpdate(request))
    }

    @PatchMapping("/cancel")
    fun orderCancel(request: OrderCancelRequest) = ResponseEntity.ok(orderService.orderCancel(request))


}