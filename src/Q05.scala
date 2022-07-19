

object Q05 {
  def main(args:Array[String])
  {
    print("Total runnig time=")
    print(easy(2) + tempo(3) + easy(2))
    
  }
  def easy(Distance:Int):Int=Distance*8
  def tempo(Distance:Int):Int=Distance*7
}