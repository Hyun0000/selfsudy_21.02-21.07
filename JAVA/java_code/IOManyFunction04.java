package FileIO.training.training02;

import java.io.FileInputStream;

public class IOManyFunction04 {
    public static void main(String[] args){

        FileInputStream fis= null;

        try {
            fis = new FileInputStream("C:\\radder\\FileIOTextFile.txt");

            while (true) {
                int read = fis.read();
                if (read == -1) {
                    break;
                }
                System.out.print((char) read);
            }

        } catch (Exception e) {
            e.printStackTrace();
    } finally {
            try {
                if (fis != null){
                    fis.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
