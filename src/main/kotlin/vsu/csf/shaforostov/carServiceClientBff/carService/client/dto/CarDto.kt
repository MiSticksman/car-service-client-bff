package vsu.csf.shaforostov.carServiceClientBff.carService.client.dto

data class CarDto(
    val id: Long,
    val picture: String,
    val brandName: String,
    val modelName: String,
    val releaseYear: Int,
) {
}