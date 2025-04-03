package Main.Rect;

public class PlainRect extends Rect{
    private double x;
    private double y;
    PlainRect(){
        super(0,0);
        this.x=0;
        this.y=0;
    }
    PlainRect(double x,double y,double length,double width){
        super(length,width);
        this.x=x;
        this.y=y;
    }
    boolean isInside(double a,double b){
        if ((x<=a&&getwidth()+x>=a)&&(y>=b&&y-getlength()<=b)) {
            
            return true;
        }
        else return false;
    }
}
