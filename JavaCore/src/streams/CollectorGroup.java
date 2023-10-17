package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorGroup {

    public static void main(String[] args) {
        Stream<String> names=Stream.of("anka","ist","kon","tr","anka","ist");

        Map<Integer, List<String>> map=names.collect(Collectors.groupingBy(String::length)) ;


        System.err.println(map);
        Stream<String> names2=Stream.of("anka","ist","kon","tr","anka","ist");

        Map<Integer, Set<String>> map2=names2.collect(Collectors.groupingBy(String::length,Collectors.toSet())) ;


        System.err.println(map2);
    }
}
