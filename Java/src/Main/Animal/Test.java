package Main.Animal;

interface Animal {
    void speak();
    
}

public class Test {
    public static void main(String[] args) {
        //创建一个匿名类，调用speak函数，输出“miao,miao...”
        Animal m1;
        m1 = new Animal(){
            public void speak(){
                System.out.println("miao,miao...");
            }
        };
        m1.speak();
        Animal m2;
        m2 = new Animal() {
            public void speak(){
                System.out.println("wang,wang...");
            }
        };
        m2.speak();
    }
}
