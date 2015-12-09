package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * @Anther yubaken
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
open class Application {
  companion object {
    @JvmStatic public fun main(args: Array<String>) {
      SpringApplication.run(Application::class.java, *args)
    }
  }
}
