package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitivStream {
    public static void main(String[] args) {

        int [] ia={2,32,23,12123,23};

        IntStream asd= Arrays.stream(ia);

        IntStream asd2=IntStream.of(213,123123,2);

        System.err.println(asd.count()+", "+asd2.count());


        OptionalInt max=IntStream.of(123,32423,4234,123,12).max();
        OptionalDouble avrea= DoubleStream.of(123.123,123.234,123.3423,123.567).average();
        OptionalLong min= LongStream.of(1232312l,12312l,123l).min();

max.ifPresent(System.err::println);
        System.err.println(avrea.orElseThrow());
        System.err.println(min.orElseGet(()->345));



        DoubleStream doubelmap=Stream.of("ankara","aksaray","konya","yozgat","istanbul").mapToDouble(x->x.length());

doubelmap.forEach(System.err::println);

    }
}
