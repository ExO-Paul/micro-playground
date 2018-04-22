package com.exo.microplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<MicroPlaygroundApplication>(*args)
}
