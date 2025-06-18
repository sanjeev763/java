package javaBasics;
// primitives are not mutable in the object-oriented sense because they are not objects.
// However, we can mutate a primitive variable by reassigning a new value. This is replacement
// of the stored value not true mutation.

public class PrimitiveTypeClass {
    public static void checkPrimitiveType(int a, int b){
        a++;
        System.out.println("value of a after :: "+a);
        b++;
        System.out.println("value of b after :: "+b);


    }
    public static void main(String[] args) {
        int a=3,b=5;
        System.out.println("value of a before :: "+a);
        System.out.println("value of b before :: "+b);
        checkPrimitiveType(a,b);
        // Here we can see that only copy of value is passed to a method and original
        // variable value is consistent
        System.out.println("value for check :: "+a);
        System.out.println("value for check :: "+b);
    }
}
