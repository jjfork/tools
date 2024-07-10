package io.github.adamw7.tools.data.structure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WrapperTests {

    @Test
    void testGetKey() {
        Wrapper<String, Integer> wrapper = new Wrapper<>("key", 123);
        assertEquals("key", wrapper.getKey());
    }

    @Test
    void testGetValue() {
        Wrapper<String, Integer> wrapper = new Wrapper<>("key", 123);
        assertEquals(123, wrapper.getValue());
    }

    @Test
    void testSetValue() {
        Wrapper<String, Integer> wrapper = new Wrapper<>("key", 123);
        wrapper.setValue(456);
        assertEquals(456, wrapper.getValue());
    }
}
