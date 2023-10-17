package streams;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class IntermatedOperations
{
    public static void main(String[] args) {

        System.err.println();
        Stream.of("ankara","aksatarya","ankara","aksaray","konya","yozgat","istanbul").filter(x->x.length()>4).forEach(System.err::println);


        Stream.of(11,22,33,44,55,66,77,88,99).peek(x-> System.err.println("A - "+x)).filter(x->x>40).peek(x-> System.err.println("B - "+x)).limit(2).forEach(x-> System.err.println("c - "+x));




        Stream.of("ankara","aksaray","konya","yozgat","istanbul").map(x->x.length()).forEach(System.err::println);
        Stream.of("ankara","aksaray","konya","yozgat","istanbul").map(x->new Object()).forEach(System.err::println);


        List<String> list1= Arrays.asList("ankara","yozgat");
        List<String> list2= Arrays.asList("konya","aksaray");


        Stream<List<String>>  streamoofList=Stream.of(list1,list2);
        streamoofList.flatMap(list->list.stream()).forEach(System.out::println);
        streamoofList.flatMap(list->list.stream()).forEach(System.out::println);


    }
}
