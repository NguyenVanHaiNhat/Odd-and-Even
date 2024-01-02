public class EvenThread implements Runnable{
    private Thread myThread;

    public EvenThread(){
        myThread = new Thread(this, "My runnable thread");
        System.out.println("My thread create" + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Printing the count" + i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("My thread run is over");
    }
}
