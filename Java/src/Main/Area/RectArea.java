package Main.Area;

public class RectArea extends Area{
    double w,l;
    RectArea(double l,double w){
        this.l=l;
        this.w=w;
    }
    @Override
    double area() {
        return w*l;
    }
}
