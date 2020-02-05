public class MemoryConsistencyErrorExample {
    private static boolean sayHello = false;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
           while(!sayHello) {

           }

           System.out.println("Good Bye!");
        });

        thread.start();

        Thread.sleep(1000);
        System.out.println("SasASasy Hello..");
        sayHello = true;

   );
        sayHello = false;
    }
}
