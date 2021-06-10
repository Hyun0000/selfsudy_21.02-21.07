package lec07.jth.world.main;

import lec07.jth.world.vo.chemical.Hcc;
import lec07.jth.world.vo.chemical.LGChem;
import lec07.jth.world.vo.chemical.LotteChemical;
import lec07.jth.world.vo.electronics.LGElectronics;
import lec07.jth.world.vo.electronics.SKHynix;
import lec07.jth.world.vo.electronics.SamsungElectronics;

public class MainMethod {
    public static void main(String[] args){

        // 기업정보 세팅
        // 한화솔루션케미컬
        Hcc hcc = Hcc.getInstance();

        String hccName = String.valueOf("한화솔루션케미컬");
        String hccCompanyProperty = String.valueOf("화학");
        String hccOfficeAddress = String.valueOf("서울특별시 중구 청계천로 86 한화빌딩");
        int hccTotalEmployee = 5788;
        int hccSalesAmount = 34493;
        int hccPropertyAmount = 82446;
        int hccDebtAmount = 32289;

        hcc.setCompanyName(hccName);
        hcc.setCompanyProperty(hccCompanyProperty);
        hcc.setHeadOfficeAddress(hccOfficeAddress);
        hcc.setTotalEmployee(hccTotalEmployee);
        hcc.setSalesAmount(hccSalesAmount);
        hcc.setPropertyAmount(hccPropertyAmount);
        hcc.setDebtAmount(hccDebtAmount);
        hcc.setCapitalAmount(hccPropertyAmount, hccDebtAmount);

        // 엘지화학
        LGChem lgChem = LGChem.getInstance();

        String lgChemName = String.valueOf("엘지화학");
        String lgChemCompanyProperty = String.valueOf("화학");
        String lgChemOfficeAddress = String.valueOf("서울 영등포구 이의대로 128");
        int lgChemTotalEmployee = 20073;
        int lgChemSalesAmount = 286250;
        int lgChemPropertyAmount = 340244;
        int lgChemDebtAmount = 166406;

        lgChem.setCompanyName(lgChemName);
        lgChem.setCompanyProperty(lgChemCompanyProperty);
        lgChem.setHeadOfficeAddress(lgChemOfficeAddress);
        lgChem.setTotalEmployee(lgChemTotalEmployee);
        lgChem.setSalesAmount(lgChemSalesAmount);
        lgChem.setPropertyAmount(lgChemPropertyAmount);
        lgChem.setDebtAmount(lgChemDebtAmount);
        lgChem.setCapitalAmount(lgChemPropertyAmount, lgChemDebtAmount);

        // 롯데케미컬
        LotteChemical lotteChemical = LotteChemical.getInstance();

        String lotteChemicalName = String.valueOf("롯데케미컬");
        String lotteChemicalCompanyProperty = String.valueOf("화학");
        String lotteChemicalOfficeAddress = String.valueOf("서울특별시 송파구 올림픽로 300, 롯데월드타워 14F-16F");
        int lotteChemicalTotalEmployee = 4540;
        int lotteChemicalSalesAmount = 151234;
        int lotteChemicalPropertyAmount = 200431;
        int lotteChemicalDebtAmount = 59899;

        lotteChemical.setCompanyName(lotteChemicalName);
        lotteChemical.setCompanyProperty(lotteChemicalCompanyProperty);
        lotteChemical.setHeadOfficeAddress(lotteChemicalOfficeAddress);
        lotteChemical.setTotalEmployee(lotteChemicalTotalEmployee);
        lotteChemical.setSalesAmount(lotteChemicalSalesAmount);
        lotteChemical.setPropertyAmount(lotteChemicalPropertyAmount);
        lotteChemical.setDebtAmount(lotteChemicalDebtAmount);
        lotteChemical.setCapitalAmount(lotteChemicalPropertyAmount, lotteChemicalDebtAmount);

        // 엘지전자
        LGElectronics lgElectronics = LGElectronics.getInstance();

        String lgElectronicsName = String.valueOf("LG전자");
        String lgElectronicsCompanyProperty = String.valueOf("전자");
        String lgElectronicsOfficeAddress = String.valueOf("서울시 영등포구 여의대로 128 LG트윈타워");
        int lgElectronicsTotalEmployee = 39765;
        int lgElectronicsSalesAmount = 286544;
        int lgElectronicsPropertyAmount = 448598;
        int lgElectronicsDebtAmount = 284347;

        lgElectronics.setCompanyName(lgElectronicsName);
        lgElectronics.setCompanyProperty(lgElectronicsCompanyProperty);
        lgElectronics.setHeadOfficeAddress(lgElectronicsOfficeAddress);
        lgElectronics.setTotalEmployee(lgElectronicsTotalEmployee);
        lgElectronics.setSalesAmount(lgElectronicsSalesAmount);
        lgElectronics.setPropertyAmount(lgElectronicsPropertyAmount);
        lgElectronics.setDebtAmount(lgElectronicsDebtAmount);
        lgElectronics.setCapitalAmount(lgElectronicsPropertyAmount, lgElectronicsDebtAmount);

        // 삼성전자
        SamsungElectronics samsungElectronics = SamsungElectronics.getInstance();

        String samsungElectronicsName = String.valueOf("삼성전자");
        String samsungElectronicsCompanyProperty = String.valueOf("전자");
        String samsungElectronicsOfficeAddress = String.valueOf("경기도 수원시 영통구 삼성로 129");
        int samsungElectronicsTotalEmployee = 106461;
        int samsungElectronicsSalesAmount = 1547000;
        int samsungElectronicsPropertyAmount = 3017521;
        int samsungElectronicsDebtAmount = 872607;

        samsungElectronics.setCompanyName(samsungElectronicsName);
        samsungElectronics.setCompanyProperty(samsungElectronicsCompanyProperty);
        samsungElectronics.setHeadOfficeAddress(samsungElectronicsOfficeAddress);
        samsungElectronics.setTotalEmployee(samsungElectronicsTotalEmployee);
        samsungElectronics.setSalesAmount(samsungElectronicsSalesAmount);
        samsungElectronics.setPropertyAmount(samsungElectronicsPropertyAmount);
        samsungElectronics.setDebtAmount(samsungElectronicsDebtAmount);
        samsungElectronics.setCapitalAmount(samsungElectronicsPropertyAmount, samsungElectronicsDebtAmount);

        // SK하이닉스
        SKHynix skHynix = SKHynix.getInstance();

        String skHynixName = String.valueOf("SK하이닉스");
        String skHynixCompanyProperty = String.valueOf("전자");
        String skHynixOfficeAddress = String.valueOf("경기도 이천시 부달읍 경텅대로 2091");
        int skHynixTotalEmployee = 28482;
        int skHynixSalesAmount = 253000;
        int skHynixPropertyAmount = 322160;
        int skHynixDebtAmount = 168462;

        skHynix.setCompanyName(skHynixName);
        skHynix.setCompanyProperty(skHynixCompanyProperty);
        skHynix.setHeadOfficeAddress(skHynixOfficeAddress);
        skHynix.setTotalEmployee(skHynixTotalEmployee);
        skHynix.setSalesAmount(skHynixSalesAmount);
        skHynix.setPropertyAmount(skHynixPropertyAmount);
        skHynix.setDebtAmount(skHynixDebtAmount);
        skHynix.setCapitalAmount(skHynixPropertyAmount, skHynixDebtAmount);

        System.out.println(hcc.toString());
        System.out.println(lgChem.toString());
        System.out.println(lotteChemical.toString());
        System.out.println(lgElectronics.toString());
        System.out.println(samsungElectronics.toString());
        System.out.println(skHynix.toString());
    }
}
