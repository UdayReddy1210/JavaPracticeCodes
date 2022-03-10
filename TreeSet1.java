package javaTraining;


	import java.util.*;
	public class TreeSet1 
	{
		public static void main(String[] args)
		{
			TreeSet<String> ts=new TreeSet<String>();  
			ts.add("Uday");  
			ts.add("Kumar");  
			ts.add("Reddy");  
			ts.add("P");  
			//Traversing elements  
			Iterator<String> itr=ts.iterator();  
			while(itr.hasNext())
			{  
				System.out.println(itr.next());  
			}
		}
	}

