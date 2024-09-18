class Person2{
    String name;
    int age;
    String gender;

    public Person2(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void kiirat(){
        System.out.println("Név: " +this.name);
        System.out.println("Kor: " +this.age);
        System.out.println("Nem: " +this.gender);
    }
}

public class Szemelyekcon{
    public static void main(String[] args) {

        Person2 sz0 = new Person2("Jane Doe", 30, "female");
        sz0.kiirat();
        
    }
}