package vsu.csf.shaforostov.carServiceClientBff.config

import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Component
import org.springframework.web.context.annotation.RequestScope

@Component
@RequestScope
class HeadersProvider(
    private val request: HttpServletRequest,
) {
    fun getAuthorizationHeader(): String = request.getHeader(HttpHeaders.AUTHORIZATION)
        ?.replace("Bearer ", "") ?: ""
}