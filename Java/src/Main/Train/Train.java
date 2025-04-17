package Main.Train;

public class Train {
    SetAndGetweight[] things;
    double totalWeight=0;
    Train(SetAndGetweight[] things){
        this.things=things;
    }
    double Gettotalweight(){
        for(int i=0;i<things.length;i++){
            totalWeight+=things[i].getWeight();
        }
        return totalWeight;
    }
}
