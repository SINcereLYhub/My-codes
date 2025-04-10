package Main.Area;

public class RoundArea extends Area{
    double r;
    RoundArea(double r){
        this.r=r;
    }
    @Override
    double area() {
        return r*r*3.14;
    }
}
