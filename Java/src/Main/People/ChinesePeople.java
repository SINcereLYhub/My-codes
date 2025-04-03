package Main.People;

public class ChinesePeople extends People{
    ChinesePeople(){

    }
    public void speakHello() {   
        System.out.println("您好");
     }    
     public void averageHeight() { 
        hight = 168.78;  
        System.out.println("中国人的平均身高:"+hight+" 厘米");   
     }
    //【代码1】 //重写public void averageWeight()方法，输出:"中国人的平均体重：65公斤"
    public void averageWeight(){
        weight = 65;
        System.out.println("中国人的平均体重："+weight+"公斤");
    }
    public void chinaGongfu() {
        System.out.println("坐如钟,站如松,睡如弓");
     }

}
