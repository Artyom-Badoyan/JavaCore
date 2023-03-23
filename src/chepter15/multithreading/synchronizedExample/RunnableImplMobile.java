package chepter15.multithreading.synchronizedExample;

public class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new MobileConnection().mobileCall();
    }
}
