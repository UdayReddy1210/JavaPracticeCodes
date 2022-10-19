package javaTraining;

public class ArrayList {
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.*;
	//Hi there
		public static void main(String[] args)
		{
			ArrayList l = new ArrayList();
			l.add("1");
			l.add("2");
			l.add("45");
			Iterator itr = l.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());//this is for printin op
				itr.remove();//this
			}
		}
	}
}
