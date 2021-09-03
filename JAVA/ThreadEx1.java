package Thread;

class ThreadEx1 {
    public static void main(String args[]) {
//        ThreadEx1_1 t1 = new ThreadEx1_1();
//
//        Runnable r  = new ThreadEx1_2();
//        Thread   t2 = new Thread(r);	  // 생성자 Thread(Runnable target)
//
//        t1.start();
//        t2.start();

        for(int i=0; i < 500; i++) {  //Thread가 수행항 작업을 작성
            System.out.println(0); // 조상인 Thread의 getName()을 호출
        }

        for(int i=0; i < 500; i++) {  //Thread가 수행항 작업을 작성
            // Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
            System.out.println(1);
        }
    }
}

class ThreadEx1_1 extends Thread { // 1. Thread class를 상속해서 Thread를 구현
    public void run() {
        for(int i=0; i < 500; i++) {  //Thread가 수행항 작업을 작성
            System.out.println(0); // 조상인 Thread의 getName()을 호출
        }
    }
}

class ThreadEx1_2 implements Runnable { // 2. Runnable interface를 구현해서 Thread를 구현
    public void run() {
        for(int i=0; i < 500; i++) {  //Thread가 수행항 작업을 작성
            // Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
            System.out.println(1);
        }
    }
}