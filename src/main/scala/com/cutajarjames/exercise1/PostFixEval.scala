package com.cutajarjames.exercise1

class PostFixEval {

  /**
    * A postfix expression is one where the operands come before the operators
    * For example instead of 1 + 2 we write 2 1 +
    * Instead of (2 - 3) * 5 we write 5 2 3 - *
    *
    * The idea behind the postfix notation is that you don't need to worry about
    * operator precedence.
    *
    * In this exercise you need to implement an evaluator for postfix expression
    *
    * Assume that the input is always correct, no need to validate the input
    *
    * Examples:
    *   evaluate(List("2", "3", "+")) should return 5
    *   evaluate(List("5", "2", "3", "+", "*")) should return -5
    */

  def evaluate(postFix:List[String]): Double = {
    -1.0
  }

}
