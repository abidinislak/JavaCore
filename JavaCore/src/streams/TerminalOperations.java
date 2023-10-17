package streams;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalOperations {


    public static void main(String[] args) {


        Optional<String> dogs = Stream.of("asdas", "asdasd", "ankara", "yozzzgaaaat", "q").min((s1, s2) -> s1.length() - s2.length());
        Optional<String> dogs2 = Stream.of("asdas", "asdasd", "ankara", "yozzzgaaaat", "q").findAny();
        dogs2.ifPresent(n -> System.err.println(n));
        dogs.ifPresent(System.err::println);

        Predicate<String> pred=s->s.length()>2;

Boolean dogs3 = Stream.of("asdas", "asdasd", "ankara", "yozzzgaaaat", "q").allMatch(pred);
//Optional<> dogs4 = Stream.of("asdas", "asdasd", "ankara", "yozzzgaaaat", "q").allMatch(pred);


    }
}
