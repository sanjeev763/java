package thread;

public class RunnableImplemented {
    public static class MyRunnable implements Runnable{
        public void run(){
            System.out.println("Runnable implementation");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("main");
    }
}
