object quection2{

case class Point(x:Int,y:Int){
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
}

def main(args: Array[String]){
  val p =Point(1,2);
  val r=p.move(1,2);

  
  println("move", r);
}


}