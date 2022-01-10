package Jan10.collections;

import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> intList = new java.util.ArrayList<>();

        //Storing elements into an ArrayList

        // 1. Instantiate and add
        Integer myInt = 10;
        intList.add(myInt);

        // 2. Instantiate and add
        intList.add(5);

        // 3. Instantiate with auto-boxing and add
        Integer anotherInt = 7;
        intList.add(anotherInt);

        // 4. Autboxing + add
        intList.add(9);
        intList.add(1);
        intList.add(10);
        intList.add(15);

        //Retrieve elements of an ArrayList

        //1. Generic - application for all collection - Just printing not accesssing each of the elements
        System.out.println("Using toString()");
        System.out.println(intList.toString()+"\n");

        //2. Positional Access - Only Applicable for List implementations
        for (int i = 0; i < intList.size(); i++){
            System.out.println("Element at the position "+i+ " is "+intList.get(i));
        }

        //3. Using Iterator - applicable for all Collection implementations
        System.out.println("Using Iterator");
        Iterator<Integer> intIterator = intList.iterator();
        while (intIterator.hasNext()){
            int element = intIterator.next(); // Auto-boxing;
            System.out.println(element);
        }


    }
}