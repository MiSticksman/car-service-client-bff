package vsu.csf.shaforostov.carServiceClientBff.userCarService.dto.response

import vsu.csf.shaforostov.carServiceClientBff.carService.client.dto.CarDetailDto
import vsu.csf.shaforostov.carServiceClientBff.userCarService.client.dto.UserCarDto

data class UserCarDetailResponse(
    val id: Long,
    val carId: Long,
    val picture: String,
    val brandName: String,
    val modelName: String,
    val releaseYear: Int,
    val engineName: String,
    val transmissionName: String,
    val mileage: Int,
    val carDescription: String,
) {
    constructor(
        userCar: UserCarDto,
        car: CarDetailDto,
    ) : this(
        id = userCar.id,
        carId = car.id,
        picture = car.picture,
        brandName = car.brandName,
        modelName = car.modelName,
        releaseYear = car.releaseYear,
        engineName = car.engineName,
        transmissionName = car.transmissionName,
        mileage = userCar.mileage,
        carDescription = userCar.carDescription,
    )
}