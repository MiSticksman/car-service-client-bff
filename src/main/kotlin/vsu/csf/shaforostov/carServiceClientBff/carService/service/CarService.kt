package vsu.csf.shaforostov.carServiceClientBff.carService.service

import org.springframework.stereotype.Service
import vsu.csf.shaforostov.carServiceClientBff.carService.client.CarClient
import vsu.csf.shaforostov.carServiceClientBff.carService.client.dto.CarDetailDto
import vsu.csf.shaforostov.carServiceClientBff.carService.client.dto.CarDto

@Service
class CarService(
    private val carClient: CarClient,
) {
}