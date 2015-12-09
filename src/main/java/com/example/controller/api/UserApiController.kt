package com.example.controller.api

import com.example.entity.User
import com.example.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @Auther yubaken
 */
@RestController
@RequestMapping("/user")
class UserApiController {

  @Autowired lateinit var userRepository: UserRepository

  @RequestMapping(value = "/all")
  fun findAll(): MutableIterable<User>? {
    return userRepository.findAll()
  }

  @RequestMapping(method = arrayOf(RequestMethod.GET))
  fun selectByName(@RequestParam(value = "name", defaultValue = "") user: String): List<User> {
    return userRepository.findByName(user)
  }
}
