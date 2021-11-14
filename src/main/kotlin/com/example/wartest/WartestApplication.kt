package com.example.wartest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WartestApplication

fun main(args: Array<String>) {
    runApplication<WartestApplication>(*args)
}
