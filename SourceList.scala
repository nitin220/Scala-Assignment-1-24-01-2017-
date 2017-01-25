//Ques3-Write a function that concatenates a list of lists into a single list. Its runtime should be linear in the total length of all lists. 

class Concatenate
{
	def concateList[A](list_1:List[A],list_2:List[A]):List[A]=
	{
		def innerConcat(list_1:List[A],list_2:List[A],list_3:List[A]):List[A]=
		{
			(list_1,list_2)match {
       					case (Nil,Nil)=>list_3
        				case(list_1,Nil)=> list_1
        				case (Nil,x::tail)=>innerConcat(Nil,tail,list_3:+x)
        				case (x::tail,list_2)=>innerConcat(tail,list_2,list_3:+x)
				}
		}
		innerConcat(list_1,list_2,Nil)		
	}

}

object SourceList
{
	def main(args:Array[String])=
	{
		val obj=new Concatenate
		val source_1=List(1,2,3,4)
		val source_2=List(11,22,33,44)
		val result=obj.concateList(source_1,source_2)
		println(result)
		
	}

}