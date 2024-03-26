import java.util.Scanner;

public class Osszesen{

    public static int szam(int A){
        int sz_osz = 0;
        for (int i = 0; i <= A; i++){
            sz_osz+=i;
        }
        return sz_osz;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        System.out.println("----------------------------|");
        System.out.print("Kérek egy számót: ");
        int sz_0 = s.nextInt();

        System.out.println("");
        System.out.println("Eredmény: " + szam(sz_0));

        System.out.println("----------------------------|");
        System.out.println("");
        
    }
}
