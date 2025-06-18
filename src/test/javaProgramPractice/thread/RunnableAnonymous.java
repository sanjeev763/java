package thread;

public class RunnableAnonymous {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous runnable");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
        System.out.println("main");
    }
}
