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
class User() {
  @Id
  @GeneratedValue
  var id: Long = 0

  var name: String = ""

  var sex: String = ""
}
