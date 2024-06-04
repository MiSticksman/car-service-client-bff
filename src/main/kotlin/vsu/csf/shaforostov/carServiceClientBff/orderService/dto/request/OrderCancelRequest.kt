package vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request

data class OrderCancelRequest(
    val id: Long,
    val cancelReason: String?,
)