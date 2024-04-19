package vsu.csf.shaforostov.carServiceClientBff.carService.controller

import org.springframework.web.bind.annotation.RestController
import vsu.csf.shaforostov.carServiceClientBff.carService.service.CarService

@RestController
class CarController(
    private val carService: CarService
) {

}