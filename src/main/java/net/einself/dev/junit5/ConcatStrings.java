package net.einself.dev.junit5;

import java.util.List;
import java.util.function.Function;

public class ConcatStrings implements Function<List<String>, String> {

    @Override
    public String apply(List<String> strings) {
        if (strings == null) {
            return "";
        }

        return String.join("", strings);
    }

}
