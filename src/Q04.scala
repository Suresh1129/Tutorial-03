

object Q04 {
  def main(args:Array[String])
  {
    print("Total cost=")
    print(bookprice(50) - discountprice(bookprice(50)) +shipcost(50))
  }
  def bookprice(notebook:Int):Double=
  {
    notebook*24.95
    
  }
  def discountprice(amount:Double):Double=
  {
    amount*0.4
  }
  def shipcost(notebook:Double):Double=
  {
    var shipcost=50*3 + (notebook-50)*0.75
    
    return shipcost
  }
}