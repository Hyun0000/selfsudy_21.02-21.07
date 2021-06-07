package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSpeedTest {
    public static void main(String[] args){

        //Arraylist
        long startMillis = System.currentTimeMillis(); // ArrayList 시작할 때의 현재시간
                                                       // long은 정수를 표현하기 위한 자료형 중 하나
        ArrayList arList = new ArrayList();

        for (int i = 0; i < 10000000; i++) {
            arList.add(i);
        }

        long endMillis = System.currentTimeMillis(); // ArrayList 끝날 때의 현재시간
        long diffMillis = endMillis - startMillis; // 걸리는 시간

        System.out.println("ArrayList 차이 : " + diffMillis);


        //Linkedlist
        startMillis = System.currentTimeMillis(); // LinkedList 시작할 때의 현재시간
        LinkedList lkList = new LinkedList();

        for (int i = 0; i < 10000000; i++) {
            lkList.add(i);
        }

        endMillis = System.currentTimeMillis(); // LinkedList 끝날 때의 현재시간
        diffMillis = endMillis - startMillis; // 걸리는 시간

        System.out.println("LinkedList 차이 : " + diffMillis);
    }
}
