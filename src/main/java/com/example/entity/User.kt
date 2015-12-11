package com.example.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * @Anther yubaken
 */
@Entity
@Table(name = "user")
data class User(
  @Id
  @GeneratedValue
  val id: Long = 0,
  val name: String = "",
  val sex: String = "")
