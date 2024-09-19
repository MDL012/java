
public class Szemelyekpriv {
    public static void main(String[] args) {
        Persons sz0 = new Persons("Jane Doe", 30, "female");
        sz0.kiirat("Jane Doe", 30, "female");
        sz0.setName("Den Epick");
        sz0.setAge(250);
        sz0.setName("Férfi");
        System.out.println("Neve: " + sz0.getName());
        System.out.println("Kora:" + sz0.getAge());
        System.out.println("Neme: " + sz0.getGender());

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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}