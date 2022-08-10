package com.bdio.seminars

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SeminarsRestApplication

fun main(args: Array<String>) {
	runApplication<SeminarsRestApplication>(*args)
}
