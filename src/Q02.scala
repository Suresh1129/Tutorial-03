

object Q02 {
  def main(args:Array[String])
  {
    println(temp(35))
  }
  def temp(cel:Double):Double=
  {
    var temp=cel*1.8 +32
    return temp
  }
}