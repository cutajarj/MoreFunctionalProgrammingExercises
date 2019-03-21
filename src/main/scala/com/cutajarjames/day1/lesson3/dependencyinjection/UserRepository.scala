package com.cutajarjames.day1.lesson3.dependencyinjection

import java.util.UUID

class UserRepository {

  def loginUser(username:String, password:String): Option[String] = Some(UUID.randomUUID().toString)

  def registerUser(username:String, password:String): Option[String] = Some(UUID.randomUUID().toString)

}
