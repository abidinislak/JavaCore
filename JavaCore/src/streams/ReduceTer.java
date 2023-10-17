package streams;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceTer {

    public static void main(String[] args) {


        String asd= Stream.of("asd","qweqw","aswdasdsa","asdasd").reduce("",(x1,x2)->x1+x2);
//        Optional<String> asd2= Stream.of("asd","qweqw","aswdasdsa","asdasd").reduce("",(x1, x2)->x1+x2);
        Optional<String> asd2= Optional.of(Stream.of("qweqw", "aswdasdsa", "asdasd").reduce("", (x1, x2) -> x1 + x2));
        Optional.of(Stream.of("qweqw", "aswdasdsa", "asdasd").reduce("", (x1, x2) -> x1 + x2)).ifPresent(x-> System.err.println(x));

        System.err.println(asd);



        Stream<String>  words=Stream.of("ankara","yozgat","konya");

        Integer range=words.reduce(0,(n,str)->n+str.length(),(x,x2)->x+x2);
//        Integer rangeqwe=words.reduce((n,str)->n+str.length(),(x,x2)->x+x2);
    }
}
