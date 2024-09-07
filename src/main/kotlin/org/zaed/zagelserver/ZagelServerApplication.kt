package org.zaed.zagelserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZagelServerApplication

fun main(args: Array<String>) {
    runApplication<ZagelServerApplication>(*args)
}
