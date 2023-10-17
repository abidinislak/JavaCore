package Collection;

import java.util.*;

public class ColList {

    public static void main(String[] args) {
        String[] array = new String[]{"ankara", "aksaray", "konya", "yozgat", "istanbul"};

        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);
//        List<String> copy2=List.copyOf(array);


        array[0] = "Washington";

        System.err.println(Arrays.toString(array));
        System.err.println(asList);

        asList.set(1, "Stutgart");
        System.err.println(Arrays.toString(array));
        System.err.println(asList);

        List<String> ofTest = new ArrayList<>();

//        of.add("aasd"); // unsupprted exception
//        ofTest.add("asdasd");
//        ofTest = of;
//        ofTest.add("wdaswd");


//        ArrayList

        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("sss");
        list.add("ddd");
        list.add("ccc");
        list.add("bbb   ");
        System.err.println(list);
        System.err.println(list.get(1));
        list.remove(1);
        list.remove("ddd");

        System.err.println(list);

        list.set(0, "first added");
        list.replaceAll(x -> x + "....");
        System.err.println(list);


// Stack


        Stack<String> stack = new Stack<>();
        stack.add("adana");
        stack.add("afyon");
        stack.add("ankara");
        stack.add("istanbul");
        System.err.println(stack);

        System.err.println("/////////");
        System.err.println(stack.peek());
        System.err.println(stack.pop());
        System.err.println(stack);
        stack.push("..........");
        System.err.println(stack);


//        LinkledList


        LinkedList<String> names = new LinkedList<>();

        names.add("ankara");
        names.add("istanbul");
        names.addFirst("1111");
        names.addLast("99999");
        System.err.println(names);
        names.remove("ankara");
        names.removeFirst();
        names.removeLast();
        System.err.println(names);

    }
}
