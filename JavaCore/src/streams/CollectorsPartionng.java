package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsPartionng {

    public static void main(String[] args) {
        Stream<String>  names=Stream.of("ankara","ist","ankara","Kont","konaya","konya","akasarau","test","test","ankara","asd","asd");

        Map<Boolean, List<String>> map=names.collect(Collectors.partitioningBy(x->x.startsWith("a")));

    }
}
