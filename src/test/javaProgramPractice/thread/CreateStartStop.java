package thread;

public class CreateStartStop {
    public static class Thread1Example extends Thread{
        @Override
        public void run(){
            System.out.println("Thread1Example");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread1Example t1 = new Thread1Example();
        t1.start();
        Thread.sleep(1000);
        System.out.println("main");
    }
}
