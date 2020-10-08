package net.einself.dev.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UpperCaseStringTest {

    private final UpperCaseString underTest = new UpperCaseString();

    @ParameterizedTest
    @CsvSource({"foo,FOO", "bAr,BAR", "f00 b4r,F00 B4R"})
    void apply(String input, String expected) {
        assertEquals(expected, underTest.apply(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/upper-case-string-data.csv", numLinesToSkip = 1)
    void apply_fromFileSource(String input, String expected) {
        assertEquals(expected, underTest.apply(input));
    }

}