public class KronometreThread implements Runnable {
    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Runing" + threadName);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("Thread crashed: " + threadName);
        }
        System.out.println("Thread over: " + threadName);
    }
    
    public void start(){
        System.out.println("Thread object creating");
        if(thread==null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
