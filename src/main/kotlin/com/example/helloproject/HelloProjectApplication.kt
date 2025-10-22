package com.example.helloproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloProjectApplication

fun main(args: Array<String>) {
    runApplication<HelloProjectApplication>(*args)
}
