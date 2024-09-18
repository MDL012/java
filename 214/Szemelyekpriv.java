
public class Szemelyekpriv {
    public static void main(String[] args) {
        Persons sz0 = new Persons("Jane Doe", 30, "female");
        sz0.kiirat("Jane Doe", 30, "female");
    }
    
}
 class Persons{
    private String name;
    private int age;
    private String gender;

    public Persons(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void kiirat(String name,int age,String gender){
        System.out.println("Név: " +this.name);
        System.out.println("Kor: " +this.age);
        System.out.println("Nem: " +this.gender);
    }
}