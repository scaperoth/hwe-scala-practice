package com.farrellw.hwe.exercises

import org.scalatest.FunSpec

class WordCountTests extends FunSpec {
  describe("word count") {
    it("should be able to split a single sentence into words") {
      // given
      val sentence = "one two three"
      val expected = List[String]("one", "two", "three")
      // when
      val actual = WordCount.splitSentenceIntoWords(sentence)
      // then
      assert(actual === expected)
    }

    it("Given a sentence, should return a map showing how often a word occurred in that sentence "){
      val sentence = "to seek out new life and new civilizations"
      val expected: Map[String, Int] = Map[String, Int](
        "to" -> 1,
        "seek" -> 1,
        "out" -> 1,
        "new" -> 2,
        "life" -> 1,
        "and" -> 1,
        "civilizations" -> 1
      )

      val actual = WordCount.sentenceWordCount(sentence)
      assert(actual === expected)
    }

    it("Given a list of sentences, should return a map showing count of each word"){
      val sentences = Seq(
        "Space.",
        "The final frontier.",
        "These are the voyages of the starship Enterprise.",
        "Its continuing mission:",
        "to explore strange new worlds,",
        "to seek out new life and new civilizations",
        "to boldly go where no one has gone before!"
      )
    }
  }
}
