package com.farrellw.hwe.exercises

object WordCount {
  /*
    Given a single sentence, return a list of words
   */
  def splitSentenceIntoWords(sentence: String): List[String] = {
    sentence.split("""\s""").toList
  }

  /*
    Given a single sentence, return a Map of words to their counts
   */
  def sentenceWordCount(sentence: String): Map[String, Int] = {
    splitSentenceIntoWords(sentence).groupBy(w => w).map(word => (word._1 -> word._2.length))
  }

  /*
    Given a list of sentences, return a map of words to their counts
   */
  def wordCount(sentences: List[String]): Map[String, Int] = {
    sentences.foldLeft(Map.empty[String,Int])((acc, s) => acc ++ sentenceWordCount(s))
  }
}
