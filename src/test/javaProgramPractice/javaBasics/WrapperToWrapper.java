package javaBasics;

public class WrapperToWrapper {
    public static void main(String[] args) {
        //Integer --> Double : use i.doubleValue()
        //Integer --> Float : use i.floatValue()
        //Double --> Integer : use d.intValue()
        //Float --> Long : use i.longValue()
        //Boolean --> NA : Not interconvertible

        Integer i = 100;
        Double d = i.doubleValue();
        System.out.println("Integer --> Double : "+d);

        Double dd = 100.456;
        Long l = dd.longValue();
        Integer ii = dd.intValue();
        System.out.println("Double --> Long : "+l);
        System.out.println("Double --> Integer : "+ii);

    }
}
