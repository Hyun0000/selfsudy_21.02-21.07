package CollectionFrameWork.samplecode08.repository;

public interface CallDataRepository {
    public Object getNationData(String nationName);
    // 국가 데이터를 가져오는 method
    // object는 모든 class의 부모이므로 뭐든지 objcet 옆에 들어 올 수 있다.

    public String getIndustryData(int paramindex);
    // 산업 데이터를 가져오는 method
}
