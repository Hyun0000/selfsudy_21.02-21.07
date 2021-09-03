package CollectionFrameWork;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map {
public static void main(String[] args){
    HashMap hashMap = new HashMap();
    hashMap.put("국가1","한국");
    hashMap.put("국가2","미국");
    hashMap.put("국가3","중국");
    hashMap.put("국가4","러시아");
    hashMap.put("국가5","일본");
    // Object put(Object key, Object value)
    // Map에 value객체를 key객체에 연결(mapping)하여 저장한다.
    System.out.println("HashMap : " + hashMap.toString());

    // LinkedHashMap class는 순서가 있는 class이다.
    LinkedHashMap lkMap = new LinkedHashMap();
    lkMap.put("국가1","한국");
    lkMap.put("국가2","미국");
    lkMap.put("국가3","중국");
    lkMap.put("국가4","러시아");
    lkMap.put("국가5","일본");

    System.out.println("LinkedHashMap : " + lkMap.toString());
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    String testA1 = "a";
    String testA2 = "a";

    int hc1 = testA1.hashCode();
    int hc2 = testA2.hashCode();

    System.out.println("hc1 : " + hc1);
    System.out.println("hc2 : " + hc2);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    String nationName1 = String.valueOf("한국");
    String nationName2 = String.valueOf("한국");

    int nnhc1 = nationName1.hashCode();
    int nnhc2 = nationName2.hashCode();

    System.out.println("nnhc1 : " + nnhc1);
    System.out.println("nnhc2 : " + nnhc2);
    }
}