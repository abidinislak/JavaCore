package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CommonCollectionMethods {


    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();

        col.add("Ankara");
        col.add("Aksaray");
        col.add("Yozgat");
        col.add("konya");

        System.err.println(col);
        System.err.println(col.remove("Ankara"));
        System.err.println(col);
        System.err.println(col.isEmpty());
        System.err.println(col.size());
        System.err.println(col.contains("konya"));
        System.err.println(col.contains("aksarayy"));
        System.err.println(col.removeIf(x->x.startsWith("A")));
        col.forEach(x-> System.err.println(x));
        col.clear();
        col.forEach(System.out::println);

    }
}
