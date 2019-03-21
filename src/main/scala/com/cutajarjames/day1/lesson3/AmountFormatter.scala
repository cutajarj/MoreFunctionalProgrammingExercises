package com.cutajarjames.day1.lesson3

trait AmountFormatter {
  def formatAmount(d: Double): String
}

trait DotFormatter extends AmountFormatter {
  override def formatAmount(d: Double): String = f"$d%1.2f"
}

trait CommaFormatter extends AmountFormatter {
  override def formatAmount(d: Double): String = f"$d%1.2f".replace(".", ",")
}

