package streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStream {

    public static void main(String[] args) {


        StringBuilder asdas = Stream.of("dasd", "asdasd").collect(() -> new StringBuilder(), (sb, str) -> sb.append(str), (sb1, sb2) -> sb1.append(sb2));

        System.err.println(asdas);


        Map<String, Integer> map = Stream.of("ankara", "aksaray", "konya").collect(Collectors.toMap(s -> s, s -> s.length()));


        System.err.println(map);


        Map<Integer, String> mapReverse = Stream.of("ankara", "aksaray", "konya").collect(Collectors.toMap(s -> s.length()    // key
                , s -> s,   // value

                (s1, s2) -> s1 + "," + s2)   //duplicateion, exceptions
        );

        System.err.println(mapReverse);
    }
}
