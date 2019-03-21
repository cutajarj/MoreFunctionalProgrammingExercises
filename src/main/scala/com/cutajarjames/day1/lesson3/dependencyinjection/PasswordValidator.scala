package com.cutajarjames.day1.lesson3.dependencyinjection

class PasswordValidator {

  def isPasswordValid(pass:String):Boolean = pass.length > 6

}
