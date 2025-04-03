package Main.Rectangle;
import java.util.Scanner;
public class Rectangle {
    
    double  length =1;
    double  width = 1;
    public Rectangle(){

    }
    public Rectangle(double len,double wid){
        this.length = len;
        this.width = wid;
    }

    public double getArea(){
        return length*width;
    }
    public double getperimeter(){
        return (length+width)*2;
    }

    public void setWidth(double width){
        this.width=width;
        
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getWidth(){
        return width;
    }  

    public double getLength(){
        return length;
    }
    public static void main(String[] args) {
        Rectangle rectangle;
        Scanner scanner = new Scanner(System.in);
        rectangle = new Rectangle();
        System.out.println("默认矩形的参数如下：");
        System.out.printf("长：%f\n",rectangle.getLength());
        System.out.printf("宽：%f\n",rectangle.getWidth());
        System.out.printf("面积：%f\n",rectangle.getArea());
        System.out.printf("周长：%f\n",rectangle.getperimeter());
        System.out.println("请输入要调整矩形的长和宽");
        rectangle.setLength(scanner.nextDouble());
        rectangle.setWidth(scanner.nextDouble());
        System.out.println("调整后矩形参数如下：\n");
        System.out.printf("长：%f\n",rectangle.getLength());
        System.out.printf("宽：%f\n",rectangle.getWidth());
        System.out.printf("面积：%f\n",rectangle.getArea());
        System.out.printf("周长：%f\n",rectangle.getperimeter());
        scanner.close();
    }
}
