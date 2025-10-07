public class VirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() -> {
            System.out.println("Running in virtual thread: " + Thread.currentThread());
        }).join();
    }
}
