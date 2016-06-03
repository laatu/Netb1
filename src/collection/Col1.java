package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Col1 {
	public static void main(String[] args) {
		
		System.out.println("hello");
		Lab786s();	
		
	}
	
	static void Lab786s ()
	{
		Collection c=new ArrayList();
		c.add("JDBC");c.add("JSP");c.add("Srinivas");
		c.add("Java");c.add("Dande");
		Collection c2=new ArrayList();
		c2.add("Java");c2.add("JDBC");c2.add("JSP");
		Collection c3=new ArrayList();
		c3.add("Java");c3.add("JDBC");c3.add("EJB");
		System.out.println(" c "+c+"\n c2 "+c2+"\n c3 "+c3);
		
		System.out.println("***c.contains(c2)*** \n I checks weather the c contains the elment of c2 or not");
		System.out.println(c.contains(c2)+"\t\t");
		
		
		System.out.println("***c.containsAll(c2)**** \n It checks weather the c contains all elments of c2 or not");
		System.out.println(c.containsAll(c2)+"\t\t");
		
		System.out.println("***c.containsAll(c3)**** \n It checks weather the c contains all elments of c3 or not");
		System.out.print(c.containsAll(c3));
		
	}
}
