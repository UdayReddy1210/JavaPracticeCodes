package javaTraining;
import java.util.ListIterator;

public class LinkedList {
	
	
		public static void main(String[] args)
		{
			LinkedList l = new LinkedList();
			l.add("A");
			l.add("B");
			l.add("C");
			l.add("java");
			System.out.println(l);
			ListIterator listIterator = l.listIterator();
			listIterator.add("PROG"); // ---> added first
			while (listIterator.hasNext()) 
			{
				if (listIterator.next().equals("C"))
				{
					listIterator.set(100); // replaced
				}
				System.out.println(listIterator.next());
			}
			System.out.println(l);
		}
		
	}


