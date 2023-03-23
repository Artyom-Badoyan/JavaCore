package chepter15.multithreading.synchronizedExample;

public class MobileConnectionTest {
    public static void main(String[] args) {
        Thread threadMobile = new Thread(new RunnableImplMobile());
        Thread threadSkype = new Thread(new RunnableImplSkype());
        Thread threadWhatsapp = new Thread(new RunnableImplWhatsapp());
        threadMobile.start();
        threadSkype.start();
        threadWhatsapp.start();
    }
}
