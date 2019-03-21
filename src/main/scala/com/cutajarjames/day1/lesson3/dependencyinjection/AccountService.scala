package com.cutajarjames.day1.lesson3.dependencyinjection

trait AccountService {
  def login(username: String, password: String): Boolean

  def createUser(username:String, password: String): Boolean
}

class AccountServiceImpl{

}