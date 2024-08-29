package com.example.Trainning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TrainningApplication

fun main(args: Array<String>) {
	runApplication<TrainningApplication>(*args)
}

