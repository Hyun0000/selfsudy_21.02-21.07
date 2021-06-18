package FileIO.training;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileManyFuntion {
    // throws --> 예외가 발생하면 Exception class로 던져버리겠다는 의미
    // FileManyFuntion class에서 Exception이 발생해도 Exception class에서 해결하겠다는 의미
    public static void main(String[] args) throws Exception{

        File txtFolder = new File("C:\\FileIOFolder");
        File txtFile = new File("C:\\FileIOTextFile.txt");
//--------------------------------------------------------------------------------------------------------------
        // 파일명&폴더명 반환 method
        // 1. 파일명 반환 method
        String fileName = txtFile.getName();
        System.out.println("fileName : " + fileName);

        // 2. 폴더명 반환 method
        String folderName = txtFolder.getName();
        System.out.println("folderName : " + folderName);
//--------------------------------------------------------------------------------------------------------------
        // 해당 파일 객체의 마지막 수정일자 반환 method
        long longLastModified = txtFile.lastModified();
        System.out.println("longLastModified : " + longLastModified);
        Date dateLastModified = new Date(longLastModified);
        // long타입 data인 longLastModified를 Date method에 넣어서 날짜를 생성했다.
        // long타입 data인 longLastModified만으로는 날짜를 알 수 없다.(값이 숫자로만 return 되니까)
        // [import java.util.Date;]를 import해야 한다. sql import하면 안된다.
        System.out.println("dateLastModified : " + dateLastModified);
//--------------------------------------------------------------------------------------------------------------
        // 파일경로를 확인하는 method
        String filepath = txtFile.getPath(); // 객체 생성시 입력된 파일 경로
        System.out.println("filepath : " + filepath);
        String fileAbsolutePath = txtFile.getAbsolutePath();  // 파일의 절대 경로 반환
        System.out.println("fileAbsolutePath : " + fileAbsolutePath);
        String fileCanonicalPath = txtFile.getCanonicalPath(); // 파일시스템의 절대 경로 반환
        System.out.println("fileCanonicalPath : " + fileCanonicalPath);
//--------------------------------------------------------------------------------------------------------------
        // 존재여부 확인
        boolean txtFileExists = txtFile.exists();
        System.out.println("txtFileExists : " + txtFileExists);
        // 해당 파일의 존재여부 확인

        // 폴더인지 파일인지 체크
        boolean txtFileFile = txtFile.isFile();
        System.out.println("txtFileFile : " + txtFileFile);
        // 파일 여부를 따진다.
        // txtFile은 텍스트 파일이므로 true가 뜬다.
        boolean txtFolderFile = txtFolder.isFile();
        System.out.println("txtFolderFile : " + txtFolderFile);
        // 파일 여부를 따진다.
        // txtFolder는 폴더이므로 false가 뜬다.

        boolean txtFileDirectory = txtFile.isDirectory();
        System.out.println("txtFileDirectory : " + txtFileDirectory);
        // 폴더 여부를 따진다.
        // txtFile은 텍스트 파일이므로 false가 뜬다.
        boolean txtDirectoty = txtFolder.isDirectory();
        System.out.println("txtDirectoty : " + txtDirectoty);
        // 폴더 여부를 따진다.
        // txtFolder는 폴더이므로 true가 뜬다.
//--------------------------------------------------------------------------------------------------------------
        // List method --> 파일 일때는 Null, 폴더일때는 해당 폴더에 있는 파일&하위 폴더 정보를 출력
        String[] txtFileList = txtFile.list();
        System.out.println("txtFileList : " + txtFileList);
        String[] txtFolderList = txtFolder.list();
        for (int i = 0; i < txtFolderList.length; i++) {
            System.out.println(txtFolderList[i]);
        }
//--------------------------------------------------------------------------------------------------------------
        // mkdir() --> 새로운 디렉토리를 생성
        boolean mkdir = txtFolder.mkdir();
        System.out.println("mkdir : " + mkdir);
        // mkdirs() --> 경로상에 없는 모든 디렉토리를 생성
        boolean mkdirs = txtFolder.mkdirs();
        System.out.println("mkdirs : " + mkdirs);





    }
}
