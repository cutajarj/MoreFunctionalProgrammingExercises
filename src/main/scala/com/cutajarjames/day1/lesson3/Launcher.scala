package com.cutajarjames.day1.lesson3

object Launcher {

  def main(args: Array[String]): Unit = {
    val balances = Map("James" -> 10.0, "Paul" -> 200.0)
    //val ukWallet: WalletService = new UKWallet(balances)
    //val pWallet: WalletService = new PortugalWallet(balances)

    val ukWallet: WalletService = new GenericWallet(balances, 1000.0) with DotFormatter
    val pWallet: WalletService = new GenericWallet(balances, 1000.0) with CommaFormatter

    println(ukWallet.readBalanceForUser("James"))
    println(pWallet.readBalanceForUser("Paul"))

  }

}
