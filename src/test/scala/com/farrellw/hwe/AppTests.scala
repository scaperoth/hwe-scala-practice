package com.farrellw.hwe

import org.scalatest.FunSpec

class AppTests extends FunSpec {
  describe("greeting") {
    it("should return the name prepended with the greeting") {
      // given
      val name = "Tim"
      val expected = "Hello Tim"
      // when
      val actual = App.greeting(name)
      // then
      assert(actual === expected)
    }
  }
}