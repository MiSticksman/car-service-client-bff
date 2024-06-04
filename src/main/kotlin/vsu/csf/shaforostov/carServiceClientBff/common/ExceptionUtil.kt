package vsu.csf.shaforostov.carServiceClientBff.common

import org.springframework.http.ResponseEntity

// Pasha ne nado
fun <T> ResponseEntity<T>.commonProcessClientResponse() =
    runCatching {
        this.body!!
    }.getOrElse {
        throw it
    }