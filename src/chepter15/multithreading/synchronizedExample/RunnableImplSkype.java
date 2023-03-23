package chepter15.multithreading.synchronizedExample;

public class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new MobileConnection().skypeCall();
    }
}
