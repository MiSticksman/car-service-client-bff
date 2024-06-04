package vsu.csf.shaforostov.carServiceClientBff.orderService.client.dto

import java.math.BigDecimal

data class OrderDto (
    val id: Long,
    val userId: Long,
    val carId: Long,
    val cost: BigDecimal,
    val carServiceId: Long,
    val reserveWindowId: Long,
    val carMileage: Int,
    val status: String,
)