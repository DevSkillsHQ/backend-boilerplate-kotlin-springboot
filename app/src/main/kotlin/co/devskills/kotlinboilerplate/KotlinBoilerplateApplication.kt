package co.devskills.kotlinboilerplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBoilerplateApplication

fun main(args: Array<String>) {
	runApplication<KotlinBoilerplateApplication>(*args)
}
