package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

import mim.Mim;

/**
 *
 * @author anuj
 */
public class Col {
    public static void main(String[] args)
    {
        //First
    	
                        /// new Col().lab778n779();
        //Second
        new Col().lab780s();
        //new Col().lab778n779();
    }
    
    void lab780s()
    {
        System.out.println(" \n\n The LAB 780");
        Collection col= new ArrayList();        
        System.out.println("Initailly ");
        System.out.println("***Collection col= new ArrayList();***");
        System.out.println("The col is  *sout(col);-->  "+col);
        
        
        System.out.println(" The Size  *col.size();->"+col.size());
        System.out.println("The Empty  *col.isEmpty();->"+col.isEmpty());
        System.out.println("\t\t ---Adding Data----(in col)--eg col.add(\"Sri\")");
        col.add("Sri");
        col.add("Raj");
        col.add("Singh");
        col.add("chuahan");
        Mim m=new Mim();
        col.add(m);
        System.out.println("The Col is  *sout(col)-->"+col);
        System.out.println("The Size  *col.size()->"+col.size());
        System.out.println("The Empty  *col.isEmpty()->"+col.isEmpty());
        
        System.out.println("\n\n---Included Lab 781");
        System.out.println("Does col contains Sri *col.contains(Sri)->"+col.contains("Sri"));
        System.out.println("Does col contains Jug *col.contains(\"Jug\")->"+col.contains("Jug"));
        System.out.println("The Col is  *sout(col);-->"+col);
        
        System.out.println("executing col.remove(\"Sri\")  ->"+col.remove("Sri")+"\n Now Removed Sri from col.remove(Sri)"+" \n The Col is  *sout(col);-->"+col);
        
        
        col.remove("raj");
        System.out.println("\n*col.remove(raj) This would not work as Raj is diff from RAj");
        System.out.println(col);
        col.remove("Raj");
        System.out.println("*col.remove(Raj) \nRemoved raj which is not present in col"+"\n The Col is  *sout(col);-->"+col);
        
        System.out.println("\n\n ---Included LAb 782");
        col.clear();
        col.add("Sri");
        col.add("Raj");
        col.add("Singh");
        col.add("chuahan");
        Object arr[]=col.toArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            arr[i]="Anuj";
        }
        System.out.println(col);
        
        
        System.out.println("\n\n ---Included LAb 783");
        System.out.println(" \n Used Iterator class");
        Iterator it=col.iterator();
        System.out.println("Passed iterator object in if(it.hasNext())");
        System.out.println("Made an object of Object passed it.next and printed it->");
        while(it.hasNext())
        {
            Object obj1=it.next(); 
            System.out.println(obj1);
            
            if(obj1.equals("Sri"))
            {
                System.out.println(" \n\n This was the if block inside the while to get rid");           
                System.out.println("of Sri by-->>if(obj1.equals('Sri') and it.remove();");
                it.remove();
            }
        }
        
        System.out.println("\n\n ---Included LAb 784");
        col.clear();
        col.add("Anuj");
        col.add("Kuamr");
        col.add("Garg");
        System.out.print("\n The Arraylist object(Collection reffence) has s.o.p(col):->");
        System.out.println(col);
        System.out.println(col+"\t"+col.size());
        Collection col2=new ArrayList();
        col2.add("Ram");
        col2.add("Vilas");
        col2.add("paswan");
        System.out.println("The new Arraylist col2");
        System.out.println(col2+"\t"+col2.size());
        System.out.println("The col.add(col2) shows :"+adde(col, col2));
        System.out.println(col);
        System.out.println("The col.addAll(col2) shows :"+addeAll(col,col2));
        System.out.println(col);
    }
    Collection adde(Collection k,Collection j)
    {
        k.add(j);
        return k;
    }
    
    Collection addeAll(Collection s,Collection g)
    {
        s.addAll(g);
        return s;
    }
    
    void lab778n779 ()
    {
        new Col().lab778();
        new Col().lab779();
    }
    void lab778()
    {
        
        Vector v=new Vector();
        v.addElement("sri");
        v.addElement("Veer");
        v.addElement("Dass");
        System.out.println("\n\n\n\t Lab 778");
        System.out.println("sout(v) "+v);
        Enumeration e= v.elements();
        System.out.println("By");
        System.out.println("Object o=(Object) e.nextElement();");
        while(e.hasMoreElements())
        {           
            Object o=(Object) e.nextElement();
            System.out.println("o.hashcode->"+o.hashCode());
            System.out.println("o.toString() "+o.toString());
            
        }
    }
    
    void lab779()
    {
        Properties p=new Properties();
        p.put("am-1","Sri");
        p.put("am-3","Veer");
        p.put("am-2","Dass");
        System.out.println("\n Lab 779");
        System.out.println(p);
        Enumeration e= p.elements();
        System.out.println("Same-- **p.elements** and **object.nextelement**  code");
        System.out.println("But it didn't show the key");
        while(e.hasMoreElements())
        {           
            Object o=(Object) e.nextElement();
            System.out.println(o);                 
        }
        System.out.println("\n The diff way now \n\n");
        
        System.out.println("Old trick---p.elements");
        e= p.elements();
        while(e.hasMoreElements())
        {           
            String pnm=(String) e.nextElement();
            String val=p.getProperty(pnm);
            System.out.println(pnm+"\t\t"+val );
        }
        
        System.out.println(" \n The right way-- p.propertyNames();");
        e= p.propertyNames();
        while(e.hasMoreElements())
        {           
            String pnm=(String) e.nextElement();
            String val=p.getProperty(pnm);
            System.out.println(pnm+"\t\t"+val );
        }
        
        System.out.println("\n\n  New Twist--Using Keys\t p.keys()");
        e= p.keys();
        while(e.hasMoreElements())
        {           
            String pnm=(String) e.nextElement();
            String val=p.getProperty(pnm);
            System.out.println(pnm+"\t\t"+val );
        } 
    }
}

