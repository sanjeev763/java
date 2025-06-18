package thread;

public class RunnableUsingLambdaAndJoin {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for(int i = 0; i < 5; i++) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Runnable, lambda, Join example "+Thread.currentThread());
            }
        };
        Thread t1 = new Thread(runnable, "myThread1");
        t1.setDaemon(true);// terminates all the thread including main
        t1.start();

//        Thread t2 = new Thread(runnable, "myThread2");
//        t2.start();
        System.out.println("Inside main "+Thread.currentThread());
        try{
            t1.join();//it blocks main thread and let t1 finish first even if this thread has been set deamon
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void sleep(long milli) throws InterruptedException {
        Thread.sleep(milli);
    }
}

