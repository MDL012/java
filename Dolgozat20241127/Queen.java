package Dolgozat20241127;

public class Queen {

    public static boolean queens(String black, String white){
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

        if(white.contains("1")){white1 = 1;}if(white.contains("2")){white1 = 2;}
        if(white.contains("3")){white1 = 3;}if(white.contains("4")){white1 = 4;}
        if(white.contains("5")){white1 = 5;}if(white.contains("6")){white1 = 6;}
        if(white.contains("7")){white1 = 7;}if(white.contains("8")){white1 = 8;}

        if(white.contains("A")){white2 = 1;}if(white.contains("B")){white2 = 2;}
        if(white.contains("C")){white2 = 3;}if(white.contains("D")){white2 = 4;}
        if(white.contains("E")){white2 = 5;}if(white.contains("F")){white2 = 6;}
        if(white.contains("G")){white2 = 7;}if(white.contains("H")){white2 = 8;}

        System.out.println(black1 + "/" + white1);
        if(black1 == white1){
            sakk = true;
        }
        if(black2 == white2){
            sakk = true;
        }
        int blacky = black1;
        int blackx = black2;
        //bal fel
        for(int i = blacky; i >= 1; i--){
            for(int j = blackx; j >= 1; j--){
                if (blacky == white1 && blackx == white2) {
                    sakk = true;
                    break;
                }
                blacky--; blackx--;
            }
        }
        blacky = black1;
        blackx = black2;
        //job fel
        for(int i = blacky; i >= 1; i--){
            for(int j = blackx; j <= 8; j++){
                if (blacky == white1 && blackx == white2) {
                    sakk = true;
                    break;
                }
                blacky--; blackx++;
            }
        }
        blacky = black1;
        blackx = black2;
        //bal le
        for(int i = blacky; i <= 8; i++){
            for(int j = blackx; j >= 1; j--){
                if (blacky == white1 && blackx == white2) {
                    sakk = true;
                    break;
                }
                blacky++; blackx--;
            }
        }
        blacky = black1;
        blackx = black2;
        //job le
        for(int i = blacky; i <= 8; i++){
            for(int j = blackx; j <= 8; j++){
                if (blacky == white1 && blackx == white2) {
                    sakk = true;
                    break;
                }
                blacky++; blackx++;
            }
        }
        return sakk;
    }

    public static void main(String[] args) {
        System.out.println(queens("B1","8H"));
    }
}