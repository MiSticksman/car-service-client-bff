package vsu.csf.shaforostov.carServiceClientBff.userCarService.client.dto

data class UserCarDto(
    val id: Long,
    val carId: Long,
    val mileage: Int,
    val carDescription: String,
)