package kiwi;

public class AbstractClass {

    //인터페이스 --> 모두 추상메소드만 가지고 있다.
    interface human {
        abstract public void eat(int food);

        abstract public void love(String who);

        abstract public String coding();

        // 미쳤습니까 Human???
    }


    //추상클래스 --> 추상메소드도 있지만 일반메소드도 있다.
    abstract class cat {

        //추상클래스의 일반메소드
        public void eat(int food) {
            // 함수의 기능을 구현해야 한다.
        }

        //추상클래스의 추상메소드
        abstract public void love(String who);
        abstract public void coding();
    }


    //추상클래스를 상속받았다.
    class robot extends cat {


        //cat class 중에 추상메소드만 override 했다.
        @Override
        public void love(String who) {
            // 함수의 기능을 구현해야 한다.
        }

        @Override
        public void coding() {
            // 함수의 기능을 구현해야 한다.
        }
    }

    public void main(String[] args) {
//        cat a = new cat();
        robot r = new robot();
    }
}