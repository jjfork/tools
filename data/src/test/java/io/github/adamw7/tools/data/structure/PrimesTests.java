package io.github.adamw7.tools.data.structure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesTests {

    @Test
    void testIsPrime() {
        assertTrue(Primes.isPrime(2));
        assertFalse(Primes.isPrime(4));
        assertTrue(Primes.isPrime(7));
        assertFalse(Primes.isPrime(10));
    }

    @Test
    void testFindMaxSmallerThan() {
        assertEquals(5, Primes.findMaxSmallerThan(7));
        assertEquals(13, Primes.findMaxSmallerThan(15));
        assertEquals(19, Primes.findMaxSmallerThan(20));
    }
}
