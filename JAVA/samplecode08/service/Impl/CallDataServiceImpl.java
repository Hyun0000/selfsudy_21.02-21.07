package CollectionFrameWork.samplecode08.service.Impl;

import CollectionFrameWork.samplecode08.repository.impl.CallDataRepositoryImpl;
import CollectionFrameWork.samplecode08.service.CallDataService;

public class CallDataServiceImpl implements CallDataService {

    CallDataRepositoryImpl callDataRepositoryImpl = null;

    public CallDataServiceImpl() {
        System.out.println("CallDataServiceImpl 기본 생성자");
        callDataRepositoryImpl = CallDataRepositoryImpl.getInstance();
 // 생성자가 생성이 될 때 싱글톤 패턴을 이용하여 CallDataRepositoryImpl의 객체를 가져온다.

    }

    @Override
    public Object getNationData(String nationName) {
        return callDataRepositoryImpl.getNationData(nationName);
    }

    @Override
    public String getIndustryData(int paramindex) {
        return callDataRepositoryImpl.getIndustryData(paramindex);
    }
}
