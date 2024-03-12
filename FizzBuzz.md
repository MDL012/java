public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");

        for (int i = 1; i <= 50; i++){
            if (i%5 == 0 && i%3 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
            else if (i%3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
}}
