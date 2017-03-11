
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Tree {
       public static void main(String args[]) {
      // Create a tree set
      TreeSet ts = new TreeSet();
     
      // Add elements to the tree set
      ts.add("C");
      ts.add("A");
      ts.add("B");
      ts.add("E");
      ts.add("F");
      ts.add("D");
      System.out.println(ts);
      
      TreeSet ts2 = new TreeSet();
     
      // Add numbers to the treeset
      ts2.add(2);
      ts2.add(5);
      ts2.add(14);
      ts2.add(45);
      ts2.add(-4);
      ts2.add(7);
      System.out.println(ts2);
      
      TreeSet ts3 = new TreeSet();
     
      // Add null, can't do it!
      try{
          ts2.add(null);
          System.out.println(ts3);
      }
      catch (Exception e){
      System.out.println("null, can't do it.");
      }
      
      //remove the value 5 from tree
      ts2.remove(5);
      System.out.println(ts2);
   }
}
