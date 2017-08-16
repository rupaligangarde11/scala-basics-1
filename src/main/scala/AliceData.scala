import scala.io.Source

object AliceData {
  val bookText: String = Source.fromFile("/Users/rupaligangarde/scala_workshop/day1/scala-basics-12/src/main/resources/aliceInWonderland.txt").mkString.toLowerCase
  val stopWordText: String = Source.fromFile("/Users/rupaligangarde/scala_workshop/day1/scala-basics-12/src/main/resources/stopWords.txt").mkString.toLowerCase

  val bookRegex = """[\s|:|.|,|\d|"]+"""
  val stopWordRegex = "\\s+"

  def main(args: Array[String]): Unit = {
    var bookTextWords: List[String] = bookText.split(bookRegex).toList
    var stopWords: List[String] = stopWordText.split(stopWordRegex).toList

    var text: Unit = bookTextWords.filter(bt => !stopWords.contains(bt)).groupBy(identity).mapValues(_.length).toList.sortBy(-_._2).take(3).foreach(println);
    println(text)
  }
}
