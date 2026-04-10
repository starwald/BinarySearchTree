package bst;

public class Profiler {
    
    public static void run(BinaryTree<Association<String, String>> tree) {
        long start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            tree.insert(new Association<>("word" + i, "palabra" + i));
        }

        long end = System.nanoTime();
        System.out.println ("Insertion time: " + (end - start) + " nanoseconds");

        start = System.nanoTime();

        tree.search(new Association<>("word9999", ""));

        end = System.nanoTime();
        
        System.out.println ("Search time: " + (end - start) + " nanoseconds");
    }
}
