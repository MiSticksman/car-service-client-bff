package vsu.csf.shaforostov.carServiceClientBff.orderService.client.dto

import java.math.BigDecimal

data class OrderDetailDto (
    val id: Long,
    val userId: Long,
    val carId: Long,
    val cost: BigDecimal,
    val carServiceId: Long,
    val reserveWindowId: Long,
    val orderDetails: List<OrderDetail>,
    val orderWork: List<OrderWork>,
    val orderEmployee: OrderEmployee,
    val carMileage: Int,
    val status: String,
)