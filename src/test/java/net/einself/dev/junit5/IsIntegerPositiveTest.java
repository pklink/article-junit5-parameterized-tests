package net.einself.dev.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsIntegerPositiveTest {

    private final IsIntegerPositive underTest = new IsIntegerPositive();

    @ParameterizedTest
    @ValueSource(ints = {1, 100, 10_000})
    void testPositives(Integer integer) {
        assertTrue(underTest.test(integer));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -100, -10_000})
    void testNegatives(Integer integer) {
        assertFalse(underTest.test(integer));
    }

    @ParameterizedTest
    @ValueSource(ints = 0)
    @NullSource
    void testNullAndZero(Integer integer) {
        assertFalse(underTest.test(integer));
    }

}