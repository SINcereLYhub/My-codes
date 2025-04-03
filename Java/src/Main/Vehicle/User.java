package Main.Vehicle;
import java.util.Scanner;

public class User {

    Vehicle vehicle = new Vehicle();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user1 =new User();
        User user2 = new User();
        user1.vehicle.setPower(scanner.nextInt());
        user2.vehicle.setPower(scanner.nextInt());
        System.out.printf("car1的功率是：%d\n",user1.vehicle.getPower());
        System.out.printf("car2的功率是：%d\n",user2.vehicle.getPower());
        user1.vehicle.speedUp(10);
        user2.vehicle.speedUp(20);
        System.out.printf("car1目前的速度是：%.2f\n",user1.vehicle.getSpeed());
        System.out.printf("car2目前的速度是：%.2f\n",user2.vehicle.getSpeed());
        user1.vehicle.speedDown(20);
        user2.vehicle.speedDown(10);
        System.out.printf("car1目前的速度是：%.2f\n",user1.vehicle.getSpeed());
        System.out.printf("car2目前的速度是：%.2f\n",user2.vehicle.getSpeed());
        System.out.println("car1进行制动,car2无操作\n");
        user1.vehicle.brake();
        System.out.printf("car1目前的速度是：%.2f\n",user1.vehicle.getSpeed());
        System.out.printf("car2目前的速度是：%.2f\n",user2.vehicle.getSpeed());
        scanner.close();
    }
}
