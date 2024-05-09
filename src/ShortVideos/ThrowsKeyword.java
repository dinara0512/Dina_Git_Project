package ShortVideos;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Loop");

            Thread.sleep(3000);

            System.out.println("Academy");
    }
    public static void waitFiveSeconds () throws InterruptedException {
        Thread.sleep(1000);
    }
}
