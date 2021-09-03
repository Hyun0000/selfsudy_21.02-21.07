import java.util.Scanner;

public class eight_nine {
    public static void main(String[] args) {
        System.out.println("값을 입력하세요 : ");
        Scanner s1 = new Scanner(System.in);
        int number = s1.nextInt();

        if (number == 8 || number == 9) {
            for(int i = 1; i < 10; i++){
                System.out.println(i * number);
            }
        }   else if (number < 2 || number > 9) {
                System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
            }
        }
    }
