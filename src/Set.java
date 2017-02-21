/**
 * Created by Joel on 2/20/2017.
 */
import java.util.HashSet;
import java.util.TreeSet;


public class Set {
    public static void main(String args[]) {
        // HashSet declaration
        HashSet<String> setExample = new HashSet<>();

        // Adding elements to the HashSet
        setExample.add("elves");
        setExample.add("dwarves");
        setExample.add("men");
        setExample.add("eagles");
        setExample.add("orcs");


        //Addition of duplicate elements
        setExample.add("elves");
        setExample.add("dwarves");

        //Addition of null values
        setExample.add(null);
        setExample.add(null);

        //Displaying HashSet elements
        System.out.println(setExample);



        // TreeSet of String Type
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to TreeSet<String>
        treeSet.add("Sting");
        treeSet.add("Anduril");
        treeSet.add("Orcrist");
        treeSet.add("Morgul-Blade");
        treeSet.add("Glamdring");


        //Displaying TreeSet
        System.out.println(treeSet);

        // TreeSet of Integer Type
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();

        // Adding elements to TreeSet<Integer>
        treeSet2.add(43);
        treeSet2.add(1);
        treeSet2.add(12);
        treeSet2.add(35);
        treeSet2.add(3);
        treeSet2.add(222);
        System.out.println(treeSet2);
    }
}



