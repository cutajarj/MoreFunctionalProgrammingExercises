package com.cutajarjames.day1.lesson3.dependencyinjection

import java.util.Date

class ExpiryCheck {
  def readExpiryDate(itemId:Long): Date = new Date()
}
