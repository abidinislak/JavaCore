package streams;

import java.util.Arrays;

public class PAralelStream {

    public static void main(String[] args) {


        Arrays.asList("ankara","aksaray","konya","yozgat","istanbul").stream().forEach(System.err::print);
        System.err.println("/////////////////");
        Arrays.asList("ankara","aksaray","konya","yozgat","istanbul").stream().parallel().forEach(System.err::print);

    }
}
