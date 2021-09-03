package CollectionFrameWork.samplecode08.repository.impl;

// 가상의 DataBase 역할을 수행하는 class이다.

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DataRepository {
    private static DataRepository instance = new DataRepository();

    public static DataRepository getInstance() {
        return instance;
    }
    // 싱글톤 패턴
    // 동일한 객체를 여러 곳에서 공통으로 사용하기 때문에 일종의 DB 역할을 하는 것이다.

    public LinkedHashMap<String, Object> savedDataLkMap = null;
    public ArrayList<String> saveDataArrList = null;

    private DataRepository() {
        System.out.println("DataRepository 생성자");

        savedDataLkMap = new LinkedHashMap<String, Object>();
        saveDataArrList = new ArrayList<String>();
        // 기본 생성자에서 데이터들을 셋팅하였다.
        // 즉, Map과 List에서 데이터들을 셋팅함으로써 가상의 DB 역할을 수행할 수 있게 됐다.

        // DB 역할을 수행할 수 있도록 실제 데이터를 넣어보았다.
        savedDataLkMap.put("국가1", "한국");
        savedDataLkMap.put("국가2", "미국");
        savedDataLkMap.put("국가3", "중국");
        savedDataLkMap.put("국가4", "일본");
        savedDataLkMap.put("국가5", "러시아");

        saveDataArrList.add("전자");
        saveDataArrList.add("자동차");
        saveDataArrList.add("조선");
        saveDataArrList.add("IT");
        saveDataArrList.add("디스플레이");
        saveDataArrList.add("건설");
        saveDataArrList.add("에너지");
    }

}
