//Ques4-  Write a function that splits a list elements into a pair of lists on the basis of given boolean function.

class Filter
{
	def splitList[A](sourceList:List[A],function:A=>Boolean):(List[A],List[A])=
	{
		val trueList=for{ check<-sourceList if(function(check))}yield check
		val falseList=for{ check<-sourceList if(!function(check))}yield check
		(trueList,falseList)		
	}

}

object ListToManipulate
{
	def main(args:Array[String])=
	{
		val obj=new Filter
		val sourceList=List(3,4,5,6,7,8)
		val (resultTrue,resultFalse)=obj.splitList(sourceList,(x:Int)=>(x%2==0))
		println(s"Condition satisfying list= $resultTrue")
		println(s"Condition defying list= $resultFalse")
	}

}