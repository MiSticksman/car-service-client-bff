package vsu.csf.shaforostov.carServiceClientBff.orderService.client.dto

import java.math.BigDecimal

data class OrderWork (
    val workId: Long,
    val price: BigDecimal,
)