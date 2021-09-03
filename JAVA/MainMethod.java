package CollectionFrameWork.samplecode08.main;

import CollectionFrameWork.samplecode08.service.Impl.CallDataServiceImpl;

public class MainMethod {

    public static CallDataServiceImpl callDataService = new CallDataServiceImpl();
    // service 객체를 끌고와 사용하기 위해 코드를 작성했다.

    public static void main(String[] args){

        String industryData = callDataService.getIndustryData(1);
        System.out.println("industryData : " + industryData);

        Object getNationName = callDataService.getNationData("국가1");
        System.out.println("getNationName : " + getNationName);

    }
}
