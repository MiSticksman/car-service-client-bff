package vsu.csf.shaforostov.carServiceClientBff.userService.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import vsu.csf.shaforostov.carServiceClientBff.common.commonProcessClientResponse

@Component
class UserClient(
    @Value("\${client.user-service.url}")
    private val userServiceUrl: String
) {

    private val restClient = RestClient.builder()
        .baseUrl(userServiceUrl)
        .build()

    fun register() {
        restClient.post().uri("")
    }

    fun authorization() {
        restClient.post().uri("")
    }

    fun logout() {
        restClient.post().uri("")
    }

    fun getUserData() {

    }

    fun editProfile() {
        restClient.put().uri("")
    }
}
