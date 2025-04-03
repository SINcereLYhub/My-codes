package Main.People;

public class People {
    protected double weight;
    protected double hight;

    People(){

    }
    public void speakHello(){
        System.out.println("yayayaya");
    }

    public void averageHeight(){
        hight=173;
        System.out.println("average height:"+hight);
    }

    public void averageWeight(){
        weight=70;
        System.out.println("average weight:"+weight);  
    }
}
