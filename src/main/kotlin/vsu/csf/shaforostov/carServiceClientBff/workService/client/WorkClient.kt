package vsu.csf.shaforostov.carServiceClientBff.workService.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import org.springframework.web.client.toEntity
import vsu.csf.shaforostov.carServiceClientBff.common.commonProcessClientResponse

@Component
class WorkClient(
    @Value("\${client.work-service.url}")
    private val workServiceUrl: String
) {

    private val restClient = RestClient.builder()
        .baseUrl(workServiceUrl)
        .build()

//    fun getWorksForCar(): Array<> {
//        restClient.post()
//            .uri("")
//            .retrieve()
//            .toEntity(Array<>::class.java)
//            .commonProcessClientResponse()
//    }




}