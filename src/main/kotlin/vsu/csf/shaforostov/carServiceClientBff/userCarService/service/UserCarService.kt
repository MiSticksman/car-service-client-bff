package vsu.csf.shaforostov.carServiceClientBff.userCarService.service

import org.springframework.stereotype.Service
import vsu.csf.shaforostov.carServiceClientBff.carService.client.CarClient
import vsu.csf.shaforostov.carServiceClientBff.userCarService.client.UserCarClient
import vsu.csf.shaforostov.carServiceClientBff.userCarService.dto.response.UserCarDetailResponse
import vsu.csf.shaforostov.carServiceClientBff.userCarService.dto.response.UserCarResponse

@Service
class UserCarService(
    private val carClient: CarClient,
    private val userCarClient: UserCarClient,
) {

    fun getUserCarById(id: Long): UserCarDetailResponse {
        val userCar = userCarClient.getUserCar(id)
        val car =  carClient.getUserCarById(id)
        return UserCarDetailResponse(userCar, car)
    }

    fun getUserCars(): List<UserCarResponse> {
        val userCars = userCarClient.getUserCars()
        val idsList = userCars.map { it.carId }
        val cars =  carClient.getUserCars(idsList)
        return userCars.mapIndexed { index, userCarDto ->
            UserCarResponse(userCarDto, cars[index])
        }
    }
}