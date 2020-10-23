fun main()
{
var graf = Point(X = 5, Y = 7)


var graf2 = Point(X = 5, Y = 7)

   println(graf)
   println(graf == graf2)
   graf.moveX(4)
   println(graf)

}

class Point(X: Int, Y: Int) {
   private var X: Int = X
   private var Y: Int = Y

   fun moveX(n: Int){
      var v: Int = X+n
      this.X = v
      println("X is mimart gadayvanisas mivigebt: $v $Y")
   }

   fun moveY(Y: Int){
      var v: Int = this.Y+Y
      this.Y = v
      println("Y is mimart gadayvanisas mivigebt: $X $v")
   }

   override fun toString(): String {
      return "$X $Y"
   }

   override fun equals(other: Any?): Boolean {
      if(other is Point) {
         if(X == other.X && Y == other.Y){
            return true
         }
      }
      return false
   }

}