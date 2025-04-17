package Main.Train;
import java.util.Scanner;
public class TrainLoad {
    public static void main(String[] args) {
        int Peoplenum=0,TVnum=0,Washnum=0,Comnum=0,Total=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入乘客的人数：");
        Peoplenum=scanner.nextInt();
        System.out.println("输入电视的个数：");
        TVnum=scanner.nextInt();
        System.out.println("输入电脑的个数：");
        Comnum=scanner.nextInt();
        System.out.println("输入洗衣机的个数：");
        Washnum=scanner.nextInt();
        Total=Peoplenum+TVnum+Washnum+Comnum;
        SetAndGetweight things[]=new SetAndGetweight[Total];
        Train train = new Train(things);
        for(int i=0;i<Peoplenum;i++){
            things[i]=new People();
            System.out.print("输入第"+(i+1)+"位乘客的体重：");
            things[i].setWeight(scanner.nextDouble());  
        }
        for(int i=Peoplenum;i<Peoplenum+TVnum;i++){
            things[i]=new Television();
            System.out.print("输入第"+(i-Peoplenum+1)+"台电视的重量：");
            things[i].setWeight(scanner.nextDouble());        
        }
        for(int i=Peoplenum+TVnum;i<Peoplenum+TVnum+Comnum;i++){
            things[i]=new Computer();
            System.out.print("输入第"+(i-Peoplenum-TVnum+1)+"台电脑的重量：");
            things[i].setWeight(scanner.nextDouble());        
        }
        for(int i=Peoplenum+TVnum+Comnum;i<Total;i++){
            things[i]=new WashMachine();
            System.out.print("输入第"+(i-Peoplenum-TVnum-Comnum+1)+"台洗衣机的重量：");
            things[i].setWeight(scanner.nextDouble());        
        }
        System.out.println("火车装载的总重量："+train.Gettotalweight());  
        scanner.close();      
    }
}
