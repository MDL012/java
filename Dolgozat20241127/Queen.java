package Dolgozat20241127;

public class Queen {

    public boolean queens(String black, String white){
        boolean sakk = false;

        int black1 = 0;
        int black2 = 0;
        int white1 = 0;
        int white2 = 0;
        if(black.contains("1")){black1 = 1;}if(black.contains("2")){black1 = 2;}
        if(black.contains("3")){black1 = 3;}if(black.contains("4")){black1 = 4;}
        if(black.contains("5")){black1 = 5;}if(black.contains("6")){black1 = 6;}
        if(black.contains("7")){black1 = 7;}if(black.contains("8")){black1 = 8;}

        if(black.contains("A")){black2 = 1;}if(black.contains("B")){black2 = 2;}
        if(black.contains("C")){black2 = 3;}if(black.contains("D")){black2 = 4;}
        if(black.contains("E")){black2 = 5;}if(black.contains("F")){black2 = 6;}
        if(black.contains("G")){black2 = 7;}if(black.contains("H")){black2 = 8;}

        if(black.contains("1")){white1 = 1;}if(black.contains("2")){white1 = 2;}
        if(black.contains("3")){white1 = 3;}if(black.contains("4")){white1 = 4;}
        if(black.contains("5")){white1 = 5;}if(black.contains("6")){white1 = 6;}
        if(black.contains("7")){white1 = 7;}if(black.contains("8")){white1 = 8;}

        if(black.contains("A")){white2 = 1;}if(black.contains("B")){white2 = 2;}
        if(black.contains("C")){white2 = 3;}if(black.contains("D")){white2 = 4;}
        if(black.contains("E")){white2 = 5;}if(black.contains("F")){white2 = 6;}
        if(black.contains("G")){white2 = 7;}if(black.contains("H")){white2 = 8;}

        if(black1 == white1){
            sakk = true;
        }
        if(black2 == white2){
            sakk = true;
        }
        //bal fel
        for(int i = black1; i >= 1; i--){
            for(int j = black2; j >= 1; j--){
                if (black1 == white1 || black2 == white2) {
                    sakk = true;
                    break;
                }
                black1--; black2--;
            }
        }

        //job fel
        for(int i = black1; i >= 1; i--){
            for(int j = black2; j <= 8; j++){
                if (black1 == white1 || black2 == white2) {
                    sakk = true;
                    break;
                }
                black1--; black2++;
            }
        }
        //bal le
        for(int i = black1; i <= 8; i++){
            for(int j = black2; j >= 1; j--){
                if (black1 == white1 || black2 == white2) {
                    sakk = true;
                    break;
                }
                black1++; black2--;
            }
        }

        //job le
        for(int i = black1; i <= 8; i++){
            for(int j = black2; j <= 8; j++){
                if (black1 == white1 || black2 == white2) {
                    sakk = true;
                    break;
                }
                black1++; black2++;
            }
        }
        return sakk;
    }
}