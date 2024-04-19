package vsu.csf.shaforostov.carServiceClientBff.userService.controller

import org.springframework.web.bind.annotation.RestController
import vsu.csf.shaforostov.carServiceClientBff.userService.service.UserService

@RestController
class UserController(
    private val userService: UserService
) {

}