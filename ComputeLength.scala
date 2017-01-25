//Ques-1.	Compute the length of a list using method foldRight

class Compute
{
	def length[T](listSource: List[T]):Int=
	{
		val result=listSource.foldRight(0){(first,second)=>second+1}
		result
	}

}

object ComputeLength
{
	def main(args:Array[String])=
	{
		val obj=new Compute
		val sourceList=List(1,2,3,4,5)
		val result=obj.length(sourceList)
		println("List is")
		sourceList map(println)
		println(s"Length is $result")
		
	}
}