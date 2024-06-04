package vsu.csf.shaforostov.carServiceClientBff.userCarService.controller

import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vsu.csf.shaforostov.carServiceClientBff.userCarService.dto.response.UserCarDetailResponse
import vsu.csf.shaforostov.carServiceClientBff.userCarService.dto.response.UserCarResponse
import vsu.csf.shaforostov.carServiceClientBff.userCarService.service.UserCarService

@RequestMapping("cars")
@RestController
class UserCarController(
    private val userCarService: UserCarService
) {

    @GetMapping("/{id}")
    fun getUserCarById(
        @PathVariable id: Long,
    ): ResponseEntity<UserCarDetailResponse> {
        return ResponseEntity.ok(userCarService.getUserCarById(id))
    }

    @GetMapping("/")
    fun getUserCars(
    ): ResponseEntity<List<UserCarResponse>> {
        return ResponseEntity.ok(userCarService.getUserCars())

    }
}