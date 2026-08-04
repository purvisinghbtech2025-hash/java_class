import java.util.ArrayList;
import java.util.Vector;

public class assignment5 {

    public static void main(String[] args) {

        // ArrayList - dynamic array, not synchronized, faster
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(1, "Orange");   // insert at specific index

        System.out.println("ArrayList: " + fruits);
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        System.out.println("Element at index 0: " + fruits.get(0));
        System.out.println("Size of ArrayList: " + fruits.size());
        System.out.println();

        // Vector - dynamic array, synchronized, thread-safe
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(0, 5);   // insert at specific index

        System.out.println("Vector: " + numbers);
        numbers.remove(Integer.valueOf(20));
        System.out.println("After removing 20: " + numbers);
        System.out.println("Element at index 1: " + numbers.get(1));
        System.out.println("Size of Vector: " + numbers.size());
        System.out.println();

        // StringBuffer - mutable string, used for string manipulation
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");              // add at the end
        System.out.println("After append: " + sb);

        sb.insert(5, ",");                // insert at a specific position
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Hii");          // replace part of the string
        System.out.println("After replace: " + sb);

        sb.delete(3, 4);                  // delete characters between indices
        System.out.println("After delete: " + sb);

        sb.reverse();                     // reverse the entire string
        System.out.println("After reverse: " + sb);
    }
}
