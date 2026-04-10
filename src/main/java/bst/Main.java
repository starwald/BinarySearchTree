package bst;

public class Main {
    public static void main(String[] args) {
        try{
            BinaryTree<Association<String, String>> tree = DictionaryLoader.loadDictionary("diccionario.txt");

            System.out.println(new java.io.File("diccionario.txt").getAbsolutePath());
            System.out.println("=== Diccionario ordenado ===");
            tree.inOrder();

            System.out.println("\n=== Traducción ===");
            Translator.translateText("texto.txt", tree);

            Profiler.run(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
