package tech.ark

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringRecipeAppApplication

fun main(args: Array<String>) {
	runApplication<SpringRecipeAppApplication>(*args)
}
