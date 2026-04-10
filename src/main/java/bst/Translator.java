package bst;

import java.io.*;

public class Translator {
    
    public static void translateText(String filename, BinaryTree<Association<String, String>> tree) throws IOException {
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            
            String line;
            
            while ((line = br.readLine()) != null) {
                
                String[] words = line.split(" ");
                
                for (String word : words) {
                    String original = word;
                    
                    String clean = word.toLowerCase().replaceAll("[^a-záéíóú]", "");
                    
                    Association<String, String> result = tree.search(new Association<>(clean, ""));

                    if (result != null) {
                        System.out.print(result.getValue() + " ");
                    } else {
                        System.out.print("*" + original + "* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
