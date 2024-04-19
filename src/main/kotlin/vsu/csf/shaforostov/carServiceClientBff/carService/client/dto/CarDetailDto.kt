package vsu.csf.shaforostov.carServiceClientBff.carService.client.dto

data class CarDetailDto(
    val id: Long,
    val picture: String,
    val brandName: String,
    val modelName: String,
    val releaseYear: Int,
    val engineName: String,
    val transmissionName: String,
    val mileage: Int,
    val carDescription: String,
)