package lambda;
//lambda expression is an anonymous function(no name, no return type, no access modifier)
//For using lambda expression implemented interface must have only 1 method.
// (Functional interface - single abstract method)
public class LambdaConversion {
    public static void main(String[] args) {
        GreetingServices hiServices = new GreetingServices() {
            @Override
            public void greet(String name) {
                System.out.println("hi ..."+name);
            }
        };
        hiServices.greet("Neha");
        //Same above expression is converted to lambda expression for hello services
        //Single line example
        GreetingServices helloServices = (String name) -> System.out.println("hello ..."+name);
        //Multiline example
        GreetingServices hello2 = (String name) -> {
            System.out.println("hello ..."+ name.toUpperCase());
            System.out.println("hello length " + name.length());
        };
        hello2.greet("Sanju");
        // We can remove even data type of parameter
        //GreetingServices helloServices = (name) -> System.out.println("hello ..."+name);
    }

}
