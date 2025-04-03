package Main.ComplexNumber;

public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(){
        this.real=0;
        this.imaginary=0;
    }
    public ComplexNumber(double real,double imaginary){
        this.real =real;
        this.imaginary =imaginary;
    }
    public void Add(ComplexNumber c1){
        this.real +=c1.real;
        this.imaginary +=c1.imaginary;
    }
    
    public void Subtract(ComplexNumber c1){
        this.real -=c1.real;
        this.imaginary -=c1.imaginary;
    }

    public double getreal(){
        return this.real;
    }

    public double getimaginary(){
        return this.imaginary;
    }

    public void outcomplex(){
        if (imaginary>=0) {
            System.out.printf("%.2f+%.2fi\n", getreal(),getimaginary());            
        }
        else    
            System.out.printf("%.2f%.2fi\n", getreal(),getimaginary());            
        
    }
    public static void main(String[] args) {
        ComplexNumber c1=new ComplexNumber(1,1);
        ComplexNumber c2=new ComplexNumber(3,6);
        ComplexNumber c3=new ComplexNumber();
        ComplexNumber c4=new ComplexNumber();
        c3.Add(c1);
        c3.Add(c2);
        c3.outcomplex();
        c4.Add(c1);
        c4.Subtract(c2);
        c4.outcomplex();
    }
}
