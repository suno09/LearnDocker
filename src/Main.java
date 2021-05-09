public class Main {
    public static void main(String[] args) {
        System.out.println("Hello sun !");
        int count = 1;
        try {
            while (true) {
                Thread.sleep(2 * 1000);
                System.out.println("I'm in " + count++);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
