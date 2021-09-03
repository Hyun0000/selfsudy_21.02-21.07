package Thread.one;

public class DoRunnable implements Runnable {

    private String message;
    private int interruptInterval;

    public DoRunnable(String message, int interruptInterval) {
        this.message = message;
        this.interruptInterval = interruptInterval;
    }
    // 생성자

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(interruptInterval);

            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);
            // Thread.sleep() --> Thread를 잠시 멈춘다는 의미
            // Thread를 잠시 멈춰놨다가 메세지를 찍는다는 뜻
        }
    }
}
