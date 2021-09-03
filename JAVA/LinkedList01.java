package CollectionFrameWork;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add("alpha");
        linkedList.add("bravo");
        linkedList.add("charlie");
        linkedList.add("delta");
        linkedList.add("echo");
        System.out.println(linkedList.toString());


        // List 중간에 다른 data를 끼워 넣는것이다.
        linkedList.add(1, "good");
        System.out.println(linkedList.toString());
    }
}