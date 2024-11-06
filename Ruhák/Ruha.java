package Ruhák;

public class Ruha {
    String kategori;
    String tipus;
    String szin;
    int allapot;
    int DaysWorn;

    public boolean needsToBeWashed(){
        boolean mosnikell = false;
        if(this.kategori == "Felsőruházat"){
            if (this.DaysWorn > 5) {
                mosnikell = true;
            }
        }else{
            if (this.DaysWorn > 1) {
                mosnikell = true;
            }
        }
        return mosnikell;
    }

    public boolean needsToBeRepaired(){
        boolean javitanikell = false;
        if(this.kategori == "Felsőruházat"){
            if (this.allapot < 5 && this.allapot > 1) {
                javitanikell = true;
            }
        }else{
            if (this.allapot < 1) {
                javitanikell = true;
            }
        }
        return javitanikell;
    }
    public String wear(){
        this.DaysWorn++;
        String hiba = "Mosni kell!";
        if(this.kategori == "Felsőruházat"){
            if (this.DaysWorn > 5) {
                return hiba;
            }
        }else{
            if (this.allapot > 1) {
                return hiba;
            }
        }
        return "";
    }
    public void wash(){
        this.DaysWorn = 0;
        this.allapot--;
        if(this.allapot < 0){
            this.allapot = 0;
        }
    }
    public void repair(){
        if(this.kategori == "Felsőruházat"){
            this.allapot = 50;
        }
    }
    public String getInfo(){
        return 
        this.szin + this.tipus + "viselt" + this.DaysWorn + "napok óta, még" + this.allapot + "mosási ciklusok vannak hátra.";
    }
}