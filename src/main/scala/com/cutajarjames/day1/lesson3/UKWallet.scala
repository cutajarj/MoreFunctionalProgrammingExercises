package com.cutajarjames.day1.lesson3

class UKWallet(override val userList:Map[String, Double]) extends WalletService with DotFormatter {
  self =>


  override def readBalanceForUser(username: String): String =
    self.userList.get(username).map(formatAmount).getOrElse("NA")

  override val maxBalance: Double = 1000.0
}

