package io.github.adamw7.tools.data.uniqueness;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeyTests {

    @Test
    void testToString() {
        Key key = new Key(new String[]{"A", "B", "C"});
        assertEquals("[A, B, C]", key.toString());
    }

    @Test
    void testHashCode() {
        Key key1 = new Key(new String[]{"X", "Y", "Z"});
        Key key2 = new Key(new String[]{"X", "Y", "Z"});
        assertEquals(key1.hashCode(), key2.hashCode());
    }

    @Test
    void testEquals() {
        Key key1 = new Key(new String[]{"M", "N"});
        Key key2 = new Key(new String[]{"M", "N"});
        assertTrue(key1.equals(key2));
    }
}
