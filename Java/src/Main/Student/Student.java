package Main.Student;
import java.util.Scanner;
public class Student {
    int number;
    String name;
    String sex="x";
    String brith="xxxxxxx";
    int id=114514;
    public void setname(String n){
        this.name= n;
    }

    public void setnumber(int num){
        this.number=num;
    }

    void printlnfo(){
        System.out.printf("Name:"+this.name+"\n"+"Sex:"+this.sex+"\n"+"Number:"+this.number+"\n"+"Brithday:"+this.brith+"\n"+"ID"+this.id);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student stu = new Student();
        stu.setname(scanner.nextLine());
        stu.setnumber(scanner.nextInt());
        stu.printlnfo();
        scanner.close();
    }
}
