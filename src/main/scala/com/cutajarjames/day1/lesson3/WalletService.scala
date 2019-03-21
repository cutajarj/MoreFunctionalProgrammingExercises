package com.cutajarjames.day1.lesson3

trait WalletService {
  val userList: Map[String, Double]
  val maxBalance: Double

  def readBalanceForUser(username:String): String

  def isAllowedDeposit(user:String, amount:Double): Boolean =
    userList.get(user).map(b => b + amount <= maxBalance).getOrElse(false)
}

