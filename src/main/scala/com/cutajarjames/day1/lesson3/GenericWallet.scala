package com.cutajarjames.day1.lesson3

class GenericWallet(override val userList:Map[String, Double],
                    override val maxBalance:Double)  extends WalletService {
  this: AmountFormatter =>

  override def readBalanceForUser(username: String): String =
    this.userList.get(username).map(formatAmount).getOrElse("NA")

}
