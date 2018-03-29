public class ThreadsLetters implements Runnable {

        private int startTime;

        public ThreadsLetters (){
//            this.startTime = startTime;
        }

        public void run(){
            char letter = 'A';

            try
            {
                while (letter < 120) {
                System.out.println(letter);
                Thread.sleep(1000);
                letter++;
//                Thread.sleep(startTime * 1000);
                }
            }

//            catch(InterruptedException e)
            catch(Exception e)
            {}
            System.out.println("Letter printed.");
        }

    }

