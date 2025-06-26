package javaBasics;

public class PrimitiveOrWrapperToString {
    public static void main(String[] args) {
        //Use String.valueOf() or Wrapper.toString()
        //int --> String
        String s = String.valueOf(123);
        System.out.println("int --> String : "+s);

        //Integer --> String
        String s2 = Integer.toString(1234);
        System.out.println("Integer --> String : "+s2);

        //double --> String
        String s1 = String.valueOf(3.14);
        System.out.println("double --> String : "+s1);

        //Double --> String
        String s3 = Double.toString(1234.12);
        System.out.println("Double --> String : "+s3);

        //boolean --> String
        String s4 = String.valueOf(true);
        System.out.println("boolean --> String : "+s4);

        //Boolean --> String
        String s5 = Boolean.toString(true);
        System.out.println("Boolean --> String : "+s5);

        //char --> String
        String s6 = String.valueOf('A');
        System.out.println("char --> String : "+s6);

        //Character --> String
        String s7 = Character.toString('A');
        System.out.println("Character --> String : "+s7);
    }
}
