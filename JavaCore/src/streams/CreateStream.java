package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.stream.Stream;

public class CreateStream {


    public static void main(String[] args) throws IOException {
        Integer     [] numbers={1,234,23423,2342344,3};
        Stream<Integer> intStream= Arrays.stream(numbers);
        long     asd=intStream.count();
//        int     [] numbers={1,234,23423,2342344,3};
//        Stream<int> intStream= Arrays.stream(numbers);


        List<String> asdasd=Arrays.asList("qweqw","asdasd");
        Stream<String> asdasdasd=asdasd.stream();


       Stream <String>asdas= Files.lines(Path.of(""));


       Stream<Integer> asdaasdasdassd=Stream.generate(()->{

           return (int) Math.random()*10;

       });



       Stream<Integer>  eqwe=Stream.iterate(5,n->n+5).limit(8);

eqwe.forEach(n-> System.err.println(n));    }
}
