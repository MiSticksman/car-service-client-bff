package vsu.csf.shaforostov.carServiceClientBff.carService.client.dto.request

data class GetCarsByIdsRequestDto(
    val ids: List<Long>
)