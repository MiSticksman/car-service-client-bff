package vsu.csf.shaforostov.carServiceClientBff.carService.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import vsu.csf.shaforostov.carServiceClientBff.carService.client.dto.CarDetailDto
import vsu.csf.shaforostov.carServiceClientBff.carService.client.dto.CarDto
import vsu.csf.shaforostov.carServiceClientBff.carService.client.dto.request.GetCarsByIdsRequestDto
import vsu.csf.shaforostov.carServiceClientBff.common.commonProcessClientResponse

@Component
class CarClient(
    @Value("\${client.car-service.url}")
    private val carServiceUrl: String
) {

    private val restClient = RestClient.builder()
        .baseUrl(carServiceUrl)
        .build()

    fun getUserCarById(id: Long): CarDetailDto {
        return restClient.get()
            .uri("")
            .retrieve()
            .toEntity(CarDetailDto::class.java)
            .commonProcessClientResponse()
    }

    fun getUserCars(ids: List<Long>): Array<CarDto> {
        return restClient.post()
            .uri("")
            .body(GetCarsByIdsRequestDto(ids))
            .retrieve()
            .toEntity(Array<CarDto>::class.java)
            .commonProcessClientResponse()

    }

}