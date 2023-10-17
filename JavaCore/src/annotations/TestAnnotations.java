package annotations;

@interface anakar {

    int kayaDeted();

//    void kaya();
}

public class TestAnnotations {


    public static void main(String[] args) {
        Exampole exampole = new Exampole();
        exampole.testDep();
        System.err.println("but still working");
    }

    public void asdasdasd() {


    }

    @SuppressWarnings("deprecation")
    public void asdas() {
        Exampole exampole = new Exampole();
        exampole.testDep();
    }
}

class Exampole {


    @Deprecated(since = "2.09", forRemoval = true)
    public void testDep() {


        System.err.println("this method is deprecated");
    }

}