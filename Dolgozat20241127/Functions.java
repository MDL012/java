 package Dolgozat20241127;

public class Functions {

    //kapott szám osztóinak a számát adja meg.
    public int dividersNumber(int A){
        int B = 2;
        for(int i = 3; i < A/2; i++){
            if(A/i == 0){
                B++;
            }
        }
        return B;
    }

    //A három paraméter közül a legnagyobb szám.
    public int maxOfThree(int A, int B, int C){
        int lns = 0;
        if(A < B){
            if (B < C) {
                lns = C;
            }
            else{
                lns = B;
            }
        }
        else{
            if(A < C){
                lns = C;
            }
            else{
                lns = A;
            }
        }
        return lns;
    }

    //fizzBuzz
    public String fizzBuzz(Integer A){
        String üres = "";
        if(A/3 == 0){
            üres+="Fizz";
        }
        if (A/5 == 0) {
            üres+="Buzz";
        }
        if (A/5 != 0 && A/3 != 0) {
            üres = A.toString();
        }
        return üres;
    }

    public boolean isVowel(Character A){
        boolean i_n = false;
        String szo = "euioöüóőúaéáűí";
        for(int i = 0; i < szo.length(); i++){
            if(szo.charAt(i) == A){
                i_n = true;
            }
        }
        return i_n;
    }
}