package bst;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssociationTest {
    
    @Test
    public void testCompareTo() {
        Association<String, String> a = new Association<>("chien", "perro");
        Association<String, String> b = new Association<>("maison", "casa");

        assertTrue(a.compareTo(b) < 0);
    }

    @Test
    public void testGetters() {
        Association<String, String> a = new Association<>("chien", "perro");

        assertEquals("chien", a.getKey());
        assertEquals("perro", a.getValue());
    }
}
