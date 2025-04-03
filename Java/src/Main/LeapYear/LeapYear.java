package Main.LeapYear;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        boolean isLeapYear;
        if ((year%4==0&&year%100!=0)||year%400==0) {
            isLeapYear = true;
        }
        else    isLeapYear = false;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("该月有31天");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                System.out.println("该月有30天");
                break;
                case 2:
                if (isLeapYear) {
                    System.out.println("该月有29天");
                }
                else System.out.println("该月有28天");
                break;
                default:
                    break;
            }
            scanner.close();
        }

    }

