package Main.Rect;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PlainRect rect1 = new PlainRect(10, 10, 20, 10);     //声明左上角坐标为（10，10），长为20，宽为10的矩形对象
    System.out.printf("面积："+rect1.area()+"\n"+rect1.perimeter()+"\n");
    if (rect1.isInside(25.5, 13)) {
        System.out.print("点（25.5，13）在矩形内。");
    }
    else    System.out.print("点（25.5，13）不在矩形内。");
    System.out.print("现在可以键入另一个测试点");
    if (rect1.isInside(scanner.nextDouble(), scanner.nextDouble())) {
        System.out.print("测试点在矩形内。");
    }
    else    System.out.print("测试点不在矩形内。"); 
    scanner.close();
    }
}
