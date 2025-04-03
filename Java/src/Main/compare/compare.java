package Main.compare;
import java.util.Random;
import java.util.Scanner;
//import java.util.random.*;
public class compare {
    public static void main(String[] args) {
        Random random = new Random();
        double randomdouble = random.nextDouble(101);

        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一个数");

        double inputnum = scanner.nextDouble();

        while (inputnum!=randomdouble) {
            if (inputnum<randomdouble) {
                System.out.println("太小了，再猜：");
                
            }
            else    {
                        System.out.println("太大了，再猜：");

                    }
                inputnum = scanner.nextDouble();    
        }    
        System.out.println("猜对了");
        scanner.close();
    }
}
