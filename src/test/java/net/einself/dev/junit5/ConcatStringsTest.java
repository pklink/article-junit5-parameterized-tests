package net.einself.dev.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcatStringsTest {

    private final ConcatStrings underTest = new ConcatStrings();

    @ParameterizedTest
    @MethodSource("provideStrings")
    void apply(List<String> input, String expected) {
        assertEquals(expected, underTest.apply(input));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
            Arguments.of(List.of("foo", "bar"), "foobar"),
            Arguments.of(List.of(), ""),
            Arguments.of(null, "")
        );
    }

}