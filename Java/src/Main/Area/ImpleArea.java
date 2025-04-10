package Main.Area;
import java.util.Scanner;
public class ImpleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l,w;
        System.out.println("请分别输入内容分别为长方形的边和圆的半径");
        System.out.println("长方形的长：");
        l=scanner.nextDouble();
        System.out.println("长方形的宽：");
        w=scanner.nextDouble();
        RectArea rect = new RectArea(l,w);
        System.out.println("长方形的面积："+rect.area());
        System.out.println("圆形的半径：");
        RoundArea round =new RoundArea(scanner.nextDouble());
        System.out.println("圆形的面积："+round.area());
        scanner.close();
    }
}
