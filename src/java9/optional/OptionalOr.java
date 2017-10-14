package java9.optional;

import java.util.Optional;

/**
 * This example shows how to chain optionals in Java 9 with the or() method. It is used in my
 * answer the following StackOverflow question https://stackoverflow.com/q/28514704/2928051.
 */
public class OptionalOr {

    public static void main(String[] args) {
        Optional<String> result = find1()
                .or(OptionalOr::find2)
                .or(OptionalOr::find3);
        System.out.println(result);
    }

    private static Optional<String> find1() {
        System.out.println("find1 called");
        return Optional.empty();
    }

    private static Optional<String> find2() {
        System.out.println("find2 called");
        return Optional.of("Hello World");
    }

    private static Optional<String> find3() {
        System.out.println("find3 called");
        return Optional.empty();
    }
}
