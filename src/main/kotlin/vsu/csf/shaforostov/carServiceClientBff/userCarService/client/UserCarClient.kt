package vsu.csf.shaforostov.carServiceClientBff.userCarService.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import vsu.csf.shaforostov.carServiceClientBff.common.commonProcessClientResponse
import vsu.csf.shaforostov.carServiceClientBff.userCarService.client.dto.UserCarDto

@Component
class UserCarClient(
    @Value("\${client.user-car-service.url}")
    private val userCarServiceUrl: String
) {

    private val restClient = RestClient.builder()
        .baseUrl(userCarServiceUrl)
        .build()


    fun getUserCars(): Array<UserCarDto> {
        return restClient.get()
            .uri("")
            .retrieve()
            .toEntity(Array<UserCarDto>::class.java)
            .commonProcessClientResponse()
    }
    fun getUserCar(id: Long): UserCarDto {
        return restClient.get()
            .uri("")
            .retrieve()
            .toEntity(UserCarDto::class.java)
            .commonProcessClientResponse()
    }
}