package bst;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testInsertAndSearch() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("chien", "perro"));
        tree.insert(new Association<>("maison", "casa"));
        tree.insert(new Association<>("femme", "mujer"));

        Association<String, String> result = tree.search(new Association<>("maison", ""));

        assertNotNull(result);
        assertEquals("casa", result.getValue());
    }

    @Test
    public void testSearchNotFound() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("chien", "perro"));

        Association<String, String> result = tree.search(new Association<>("gato", ""));

        assertNull(result);
    }
}
