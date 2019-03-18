package com.cutajarjames.exercise1

import org.scalatest.{FlatSpec, Matchers}

class PostFixEvalSpec extends FlatSpec with Matchers {

  it should "output the result of 2" in {
    (new PostFixEval).evaluate(List("2", "3", "+")) shouldEqual 5.0
  }

  it should "output the result of -5" in {
    (new PostFixEval).evaluate(List("5", "2", "3", "-", "*")) shouldEqual -5.0
  }

  it should "output the result of 10" in {
    (new PostFixEval).evaluate(List("5", "2", "*")) shouldEqual 10.0
  }

  it should "output the result of 5" in {
    (new PostFixEval).evaluate(List("10", "2", "/")) shouldEqual 5.0
  }

  it should "output the result of 0" in {
    (new PostFixEval).evaluate(List("5", "10", "5", "-", "-")) shouldEqual 0.0
  }
}
