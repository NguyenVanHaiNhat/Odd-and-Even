public class Main {
    public static void main(String[] args) {
        OddThread countOdd = new OddThread();
        EvenThread countEven = new EvenThread();
        try {
            while (countOdd.getMyThread().isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
            while (countEven.getMyThread().isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}