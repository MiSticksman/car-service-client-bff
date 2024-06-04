package vsu.csf.shaforostov.carServiceClientBff.orderService.dto.request

data class OrderUpdateRequest(
    val orderId: Long,
    val windowId: Long,
    val serviceId: Long?,
)