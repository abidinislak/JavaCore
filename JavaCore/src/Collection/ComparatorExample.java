package Collection;

import util.Cat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {


        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("1", 2));
        cats.add(new Cat("2", 34));
        cats.add(new Cat("3", 234));
        cats.add(new Cat("24", 11111));

        Comparator<Cat> compCat = Comparator.comparing(Cat::getAge).thenComparingInt(Cat::getAge);

        System.err.println(cats);


    }
}
