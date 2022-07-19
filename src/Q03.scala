

object Q03 {
  def main(args:Array[String])
  {
    println(volume(5))
  }
  def volume(rad:Double):Double=
  {
    var volume=4/3*math.Pi*rad*rad*rad 
    return volume
  }
}