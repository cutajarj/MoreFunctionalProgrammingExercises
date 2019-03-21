package com.cutajarjames.day1.lesson3.dependencyinjection

trait StockService {

  def isQuantityAvialable(itemId:Long, quantity:Int): Boolean

  def isItemSafe(itemId:Long): Boolean
}

class StockServiceImpl {

}
