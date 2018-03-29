public class ThreadsNumbers implements Runnable {

    private int startTime;

    public ThreadsNumbers (){
//        this.startTime = startTime;
    }

    public void run(){
        int number = 1;

        try {
            while (number < 50) {
                System.out.println(number);
                number++;
                Thread.sleep(500);
//                Thread.sleep(startTime * 1000);
            }
        }


//            catch(InterruptedException e)
        catch(Exception e)
        {}
        System.out.println("Number printed.");
    }


}
