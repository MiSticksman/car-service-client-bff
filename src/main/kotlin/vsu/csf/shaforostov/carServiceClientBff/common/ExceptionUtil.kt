package vsu.csf.shaforostov.carServiceClientBff.common

import org.springframework.http.ResponseEntity

fun <T> ResponseEntity<T>.commonProcessClientResponse() =
    runCatching {
        this.body!!
    }.getOrElse {
        throw it
    }