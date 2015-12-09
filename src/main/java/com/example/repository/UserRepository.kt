package com.example.repository

import com.example.entity.User
import org.springframework.data.repository.CrudRepository

/**
 * @Anther yubaken
 */
interface UserRepository : CrudRepository<User, Long> {

  fun findByName(name: String): List<User>
}
