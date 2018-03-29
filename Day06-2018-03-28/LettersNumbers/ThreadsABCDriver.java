public class ThreadsABCDriver {

    public static void main (String[] args) {

        Runnable letterThread = new ThreadsLetters();

        Runnable numberThread = new ThreadsNumbers();



//        getTime.start();

        new Thread(letterThread).start();
        new Thread(numberThread).start();


    }
}
