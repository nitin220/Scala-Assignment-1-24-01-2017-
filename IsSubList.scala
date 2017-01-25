//Ques2 Implement a method hasSubsequence for checking whether a List contains another List as a subsequence.
class Check
{
	def hasSubSequence[A](source:List[A],toCheckList:List[A]):Boolean=
	{
		val listOfSequence=for{
			check<- 0 to source.size-toCheckList.size
		}yield source.slice(0+check,toCheckList.size+check)
		val resultToVerify=listOfSequence.toList.map(_.equals(toCheckList))
		val resultToReturn=resultToVerify.find{_==true}
		if(resultToReturn==None) false else true
	}
 
}

object IsSubList
{
	def main(args:Array[String])=
	{
		val obj=new Check
		val source=List(1,2,3,4,5)
		val toCheckList=List(4,5)
		val result=obj.hasSubSequence(source,toCheckList)
		if(result==true) println("Subsequence found") else println("No subsequence found")
	}

}