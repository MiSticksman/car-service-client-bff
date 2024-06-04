package vsu.csf.shaforostov.carServiceClientBff.orderService.client.dto

import java.math.BigDecimal

data class OrderDetail (
    val detailId: Long,
    val price: BigDecimal,
)