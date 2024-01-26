object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
  }

  def add(input: Int): Int =
    input + 1
  add(3)

  def impureAdd(input: Int): Int = {
    println("adding one to " + input)
    input + 1
  }
  impureAdd(3)
}
