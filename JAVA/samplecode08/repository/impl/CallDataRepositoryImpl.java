package CollectionFrameWork.samplecode08.repository.impl;

import CollectionFrameWork.samplecode08.repository.CallDataRepository;

public class CallDataRepositoryImpl implements CallDataRepository {

    DataRepository dataRepository = DataRepository.getInstance();
    // 싱글톤 패턴을 이용하여 DataRepository의 객체를 가져왔다.

    private static CallDataRepositoryImpl instance = new CallDataRepositoryImpl();

    public static CallDataRepositoryImpl getInstance(){
        return instance;
    }

    private CallDataRepositoryImpl() {
        System.out.println("CallDataRepositoryImpl 생성자");
    }
    // 싱글톤 패턴

    // CallDataRepository inferface method 구현
    @Override
    public Object getNationData(String nationName) {
        return dataRepository.savedDataLkMap.get(nationName);
    }

    @Override
    public String getIndustryData(int paramindex) {
        return dataRepository.saveDataArrList.get(paramindex);
    }
}
