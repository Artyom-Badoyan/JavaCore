package chepter15.multithreading.synchronizedExample;

public class RunnableImplWhatsapp implements Runnable {
    @Override
    public void run() {
        new MobileConnection().whatsappCall();
    }
}
