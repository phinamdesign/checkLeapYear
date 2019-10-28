import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year ;
        System.out.println("Nhập năm muốn kiểm tra '");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf(year+" là năm nhuận");
        } else {
            System.out.printf(year+" không phải năm nhuận");
        }
    }
}
