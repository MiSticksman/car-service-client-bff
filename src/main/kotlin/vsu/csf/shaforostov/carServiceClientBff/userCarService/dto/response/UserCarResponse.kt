package vsu.csf.shaforostov.carServiceClientBff.userCarService.dto.response

import vsu.csf.shaforostov.carServiceClientBff.carService.client.dto.CarDto
import vsu.csf.shaforostov.carServiceClientBff.userCarService.client.dto.UserCarDto

data class UserCarResponse(
    val id: Long,
    val carId: Long,
    val picture: String,
    val brandName: String,
    val modelName: String,
    val releaseYear: Int,
) {
    constructor(
        userCar: UserCarDto,
        car: CarDto,
    ) : this(
        id = userCar.id,
        carId = car.id,
        picture = car.picture,
        brandName = car.brandName,
        modelName = car.modelName,
        releaseYear = car.releaseYear,
    )
}