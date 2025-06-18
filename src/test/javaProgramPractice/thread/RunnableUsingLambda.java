package thread;

public class RunnableUsingLambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            while(true) {
                System.out.println("lambda used for thread example ");
            }
        };
        Thread t1 = new Thread(runnable, "myThread1");
        t1.setDaemon(true);// terminates all the thread including main if only this thread is present
        t1.start();
        System.out.println("Inside main "+Thread.currentThread());

    }
}
