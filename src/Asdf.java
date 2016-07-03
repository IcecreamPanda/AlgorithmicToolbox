import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Date;

/**
 * Created by Punda on 5/15/2016.
 */
public class Asdf {

    public static void main(String[] args) {


        Thread thread = new Huinya();

        thread.start();

        try {
            thread.join(5000);

            if (thread.isAlive()) {
                thread.interrupt();
            }


        } catch (InterruptedException e) {
            System.out.println("out interrupt");
        }

        System.out.println("Continuing");

    }

    public static class Huinya extends Thread {

        @Override
        public void run() {
            try {


                Date date = new Date();

                System.out.println("Starting logics");
                Thread.sleep(20000);
                System.out.println("Finished waiting");
            } catch (InterruptedException e) {
                System.out.println("Interrupted, closing stream");
            } finally {
                //close stream
            }
        }
    }

}
