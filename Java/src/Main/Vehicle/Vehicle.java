package Main.Vehicle;
public class Vehicle {

    double speed=190;// 声明 double 型变量 speed,刻画速度
    int power;// 声明 int 型变量 power,刻画功率

    void speedUp(int s) {
        this.speed += s; // 将参数 s 的值与成员变量 speed 的和赋值给成员变量 speed
        if (this.speed>200) {
            this.speed=200;
            System.out.println("速度超出200，限制为200");
        }
    }

    void speedDown(int d) {
        this.speed -= d; // 将成员变量 speed 与参数 d 的差赋值给成员变量 speed
        if (this.speed<0) {
            this.speed=0;
            System.out.println("速度低于0，限制为0");
            }
        }

    void setPower(int p) {
        this.power = p; // 将参数 p 的值赋值给成员变量 power
    }

    int getPower() {
        return this.power; // 返回成员变量 power 的值
    }

    double getSpeed() {
        return speed;
    }

    void brake(){
        this.speed=0;
    }
}
