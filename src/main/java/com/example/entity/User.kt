package com.example.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * DDL:
 * <pre>
 * CREATE TABLE `user` (
 * `id` int(11) NOT NULL AUTO_INCREMENT,
 * `name` varchar(255) DEFAULT NULL,
 * `sex` char(1) DEFAULT NULL,
 * PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1
 * </pre>
 *
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
