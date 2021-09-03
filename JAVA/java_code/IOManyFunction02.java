package FileIO.training.training02;

import java.nio.charset.StandardCharsets;

public class IOManyFunction02 {
    public static void main(String[] args) throws Exception{
        System.out.println("---현재 시스템의 기본 encoding---");

        // 현재 시스템의 기본 encoding을 확인
        // 범용적으로 많이 쓰는 encoding 방식은 UTF-8
        String strProperty = System.getProperty("file.encoding");
        System.out.println("strProperty : " + strProperty);

        // 인코딩&디코딩을 실습해 볼 데이터
        String msg1 = String.valueOf("한글");

        // 인코딩 과정을 거쳐 "한글"이라는 문자를 byte로 변환해보자
        System.out.println("-----인코딩-----");

        // 각각의 byte를 뽑아보자
        byte[] bytes = msg1.getBytes();
        byte[] ms949 = msg1.getBytes("MS949");
        byte[] eucKrs = msg1.getBytes("EUC-KR");
        byte[] utf8s = msg1.getBytes("utf-8");

        System.out.println("bytes : " + bytes);
        System.out.println("ms949 : " + ms949);
        System.out.println("eucKrs : " + eucKrs);
        System.out.println("utf8s : " + utf8s);

        //디코딩
        System.out.println("-----디코딩-----");

        String strBytes = new String(bytes);
        String strMs949 = new String(ms949, "MS949");
        String strEuckr = new String(eucKrs, "EUC-KR");
        String strUtf8 = new String(utf8s, "UTF-8");

        System.out.println("strBytes : " + strBytes);
        System.out.println("strMs949 : " + strMs949);
        System.out.println("strEuckr : " + strEuckr);
        System.out.println("strUtf8 : " + strUtf8);
    }
}
