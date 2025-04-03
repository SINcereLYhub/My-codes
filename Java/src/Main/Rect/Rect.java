package Main.Rect;

public class Rect {
    
    private double length;
    private double width;
    Rect(double l,double w){
        this.length=l;
        this.width =w;
    }
    void setlength(double l){
        this.length=l;
    }
    void setwidth(double w){
        this.width =w;
    }

    double getlength(){
        return this.length;
    }
    double getwidth(){
        return this.width;
    }

    double area(){
        return length*width;
    }
    double perimeter(){
        return 2*(length+width);
    }
}
