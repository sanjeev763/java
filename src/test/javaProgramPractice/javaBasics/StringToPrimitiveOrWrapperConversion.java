package javaBasics;

public class StringToPrimitiveOrWrapperConversion {
    public static void main(String[] args) {
        //Behind the scene boxing and unboxing is done automatically
        //String --> int
        int x = Integer.parseInt("123");
        System.out.println("String --> int : "+x);

        //String --> Integer
        Integer x1 = Integer.valueOf("123");
        System.out.println("String --> Integer : "+x1);

        //Similarly, String --> float, String --> long, String --> byte, String --> short, String --> char
        float f = Float.parseFloat("123.32");
        System.out.println("String --> float :"+f);

        // String --> boolean
        boolean b = Boolean.parseBoolean("true");
        System.out.println("String --> boolean :"+b);

        //String --> Boolean
        Boolean b1 = Boolean.valueOf("false");
        System.out.println("String --> Boolean :"+b1);

    }
}
