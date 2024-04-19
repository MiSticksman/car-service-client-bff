package vsu.csf.shaforostov.carServiceClientBff.userService.service

import org.springframework.stereotype.Service
import vsu.csf.shaforostov.carServiceClientBff.userService.client.UserClient

@Service
class UserService(
    private val userClient: UserClient,
) {
}