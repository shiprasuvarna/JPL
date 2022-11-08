import java.util.*;
class vector_demo {
public static void main(String[] arg)
{


ArrayList arr = new ArrayList();
arr.add(3);
arr.add("Java");
arr.add("for beginers");
arr.add(4);

Vector v = new Vector();

v.add(2);

v.addAll(1, arr);

System.out.println("Vector v: " + v);
}
}