package CollectionFrameWork;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList sampleList = new ArrayList();


        //data를 넣어보자
        sampleList.add(1);
        sampleList.add("한국");
        sampleList.add(true);

//        System.out.println(sampleList.toString());

        int sampleSize = sampleList.size();
        System.out.println(sampleSize);
        // size() --> ArrayList의 size(크기)를 구하는 method
        // length()와 유사한 method 인 듯

        for (int i = 0; i < sampleSize; i++) {
            Object o = sampleList.get(i);
            // Object get(int index) --> 지정된 위치(index)에 있는 객체를 반환한다.
            System.out.println("Object : " + o);
        }

        // Generic을 통해 ArratList의 data 형태를 강제했다
        // Generic으로 인해 intArrayList에는 int형 숫자만 들어갈 수 있다.
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);

        for (int i = 0; i < intArrayList.size(); i++) {
            Integer getint = intArrayList.get(i);
            System.out.println("i번째 getint : " + getint);
        }

        // Generic을 통해 ArratList의 datatype이 String으로 강제됐다.
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("한국");
        strArrayList.add("미국");
        strArrayList.add("중국");
        strArrayList.add("일본");
        strArrayList.add("러시아");

        for (int i = 0; i < strArrayList.size(); i++) {
            String getStr = strArrayList.get(i);
            System.out.println("나라 이름들 : " + getStr);
        }
    }
}