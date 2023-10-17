package annotations;

// While java.lang is automatically imported, java.lang.annotation is not.

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target({ElementType.FIELD, ElementType.PARAMETER}) // 1.
//@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.CONSTRUCTOR}) // 2.
//@Target(ElementType.TYPE_USE) // 3.
@interface DataItem {
}

@DataItem
interface Y {
} // annotation type not applicable to this type of declaration

/////////////////////////////////////////////////////////////////////////////////
@Target(ElementType.TYPE_USE)
@interface Wildcard {
}

@DataItem
class X {
} // annotation type not applicable to this type of declaration

class Z {
    @DataItem
    static int b;     // ok
    @DataItem
    int a;            // ok

    @DataItem
    Z() {
    }

    void m1(@DataItem int a) {
    }  // ok
}

class X1 {
    @Wildcard
    static int y; // class variable
    @Wildcard int x;        // instance variable

    void m1(@Wildcard int a) {// method parameter
        @Wildcard int z = 0;   // local variable
        var x1 = new @Wildcard X1();    // new instance

        int n = (@Wildcard int) 23.9;    // on a cast
    }
}

/////////////////////////////////////////////////////////////////////////////////
public class TargetExample {
    public static void main(String[] args) {

    }

}
