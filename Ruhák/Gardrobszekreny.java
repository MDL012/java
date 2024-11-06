package Ruhák;
import java.util.ArrayList;
import java.util.List;

public class Gardrobszekreny {
    List<Ruha> ruhakList;
    public Gardrobszekreny(int allapot,int DaysWorn){
        this.ruhakList = new ArrayList<>();
    }

    public void addCloth(Ruha ruha){
        this.ruhakList.add(ruha);
    }

    public String printInfo(){
        String X = "";
        for (Ruha ruha: this.ruhakList){
            X+=ruha.getInfo()+"\n";
        }
        return X;
    }
    public void washAllClothes(){
        for (Ruha ruha: this.ruhakList){
            ruha.wash();
        }
    }
    public void repairAllClothes(){
        for (Ruha ruha: this.ruhakList){
            ruha.wear();
        }
    }
    public String purge(){

        String X = "";
        for (Ruha ruha: this.ruhakList){
            if(ruha.allapot < 1){
                X+=ruha.getInfo()+"\n";
                this.ruhakList.remove(ruha);
            }
        }
        return X;
    }
}
