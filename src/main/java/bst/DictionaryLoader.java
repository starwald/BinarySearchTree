package bst;

import java.io.*;

public class DictionaryLoader {
    public static BinaryTree<Association<String, String>> loadDictionary(String filename) throws IOException {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replace("(", "").replace(")", "");
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String french = parts[0].trim().toLowerCase();
                    String spanish = parts[1].trim().toLowerCase();

                    Association<String, String> pair = new Association<>(french, spanish);
                    tree.insert(pair);
                }
            }
        }
        return tree;
    }    
}
