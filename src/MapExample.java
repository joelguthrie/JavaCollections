/**
 * Created by Joel on 2/20/2017.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;


public class MapExample {
    public static void main(String args[]) {

      //declaring a hashmap
        HashMap<Integer, String> hashmapExample = new HashMap<Integer, String>();

      /*Adding elements to HashMap*/
        hashmapExample.put(78, "Gandalf");
        hashmapExample.put(4, "Boromir");
        hashmapExample.put(65, "Aragorn");
        hashmapExample.put(12, "Leogolas");
        hashmapExample.put(1, "Gimli");

      // Displaying the hashmap contents
        Set set = hashmapExample.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

      // shows how to retrieve specific element based on index key
        String var= hashmapExample.get(4);
        System.out.println("Value at index 4 is: "+var);

        // shows what happens when we remove a key
        hashmapExample.remove(4);
        System.out.println("Map key and values after removal:");
        Set set2 = hashmapExample.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

    }
}
