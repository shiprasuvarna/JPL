import java.util.*;
  
public class descending {
    public static void main(String args[])
    {
  
        // Get the ArrayList
        ArrayList<String>
            list = new ArrayList<String>();
  
        // Populate the ArrayList
        list.add("DSA");
        list.add("DMS");
        list.add("JPL");
        list.add("PCPF");
        list.add("POC");
  
        // Print the unsorted ArrayList
        System.out.println("Unsorted ArrayList: "
                           + list);
  
        // Sorting ArrayList in descending Order
        // using Collection.sort() method
        // by passing Collections.reverseOrder() as comparator
        Collections.sort(list, Collections.reverseOrder());
  
        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList "
                           + "in Descending order : "
                           + list);
    }
}