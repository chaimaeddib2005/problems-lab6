package problem4;

import java.util.*;

public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            //code here
            Random random = new Random();
            int randomNumber = random.nextInt(OPERATIONS + 1);
            arrayList.add(randomNumber);
            //code here
            randomNumber = random.nextInt(OPERATIONS + 1);
            linkedList.add(randomNumber);

        }

        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");   //ArrayList - Random insert/delete: 0.136 ms
        testRandomInsertDelete(linkedList, "LinkedList"); //LinkedList - Random insert/delete: 3.683 ms

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");  //ArrayList - Sequential insert/delete (start/end): 0.408 ms
        testSequentialInsertDelete(linkedList, "LinkedList");  //LinkedList - Sequential insert/delete (start/end): 0.066 ms

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");  //ArrayList - Random access (get): 41.309 ms
        testRandomAccess(linkedList, "LinkedList"); //LinkedList - Random access (get): 26914.112 ms
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        int randomNUmber = random.nextInt(OPERATIONS + 1);
        list.add(list.size()/2,randomNUmber);

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();
        Random random = new Random();
        // Insertions at beginning and end

        list.add(0,random.nextInt(OPERATIONS));
        list.add(list.size()-1, random.nextInt(OPERATIONS));

        // Deletions at beginning and end

        list.remove(0);
        list.remove(list.size() - 1);

        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        long sum = 0;
        // sum of the all elements in the list
       for(int i = 0; i < list.size(); i++) {
           sum += list.get(i);
       }

        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

