package java8features;

import java.util.function.Predicate;

public class Filter {
	public static Predicate<String> nameStartingWithPrefix(String nextLine) {
        return new Predicate<String>() {

            @Override
            public boolean test(String t) {
                // System.out.println(t);
                return t.startsWith(nextLine);
            }
        };
    }
}
