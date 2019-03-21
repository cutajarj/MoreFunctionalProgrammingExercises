package com.cutajarjames.day1.lesson3

class PortugalWallet (override val userList:Map[String, Double]) extends WalletService with CommaFormatter {

  override def readBalanceForUser(username: String): String =
    userList.get(username).map(formatAmount).getOrElse("NA")

  override val maxBalance: Double = 2000.0
}

