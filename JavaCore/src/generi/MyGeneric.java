package generi;

public class MyGeneric<T> {


    T instance;

    public MyGeneric(T instance) {
        this.instance = instance;

    }

    public static void main(String[] args) {


        MyGeneric<String> deneme = new MyGeneric<>("sadsad");
        System.err.println(deneme);
        MyGeneric<Integer> deneme2 = new MyGeneric<>(234);
        System.err.println(deneme2);
    }

    T getT() {
        return instance;

    }
}
