/**
 * Created by Joel on 2/20/2017.
 */
import java.util.*;

public class List {
    public static void main(String args[]) {
      //Create the array list
    ArrayList<String> array1 = new ArrayList<String>();

	  // adding elements into the arraylist
        array1.add("Frodo");
        array1.add("Sam");
        array1.add("Merry");
        array1.add("Pipin");
        array1.add("Gandalf");
        array1.add("Boromir");
        array1.add("Aaragorn");
        array1.add("Legolas");
        array1.add("Gimli");

	  // Displaying array list elements
    System.out.println("Currently the Fellowship consists of:"+array1);

	//Remove elements from array list like this
        array1.remove("Boromir");
        array1.remove("Gandalf");

    System.out.println("After the mines of morria we only have:"+array1);


        //Add element at the given index
        array1.add(0, "Gandalf");
        array1.add(2, "eagles");

    System.out.println("But Guess that Gandalf will always come back:"+array1);
    }
}
