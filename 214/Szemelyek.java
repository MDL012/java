class Person{
    String name;
    int age;
    String gender;

    void getGoal(){
        System.out.println("Élj a pillanatnak!");
    }
    void introduce(){
        System.out.println("Szia, " + name + " vagyok, " +age +" éves " +gender +".");
    }
}
public class Szemelyek {
    public static void main(String[] args) {

        Person sz1 = new Person();

        sz1.name = "Den Epick";
        sz1.age = 231;
        sz1.gender = "Férfi";
        sz1.getGoal();
        sz1.introduce();

        Person sz2 = new Person();

        sz2.name = "Hofehérke";
        sz2.age = 17;
        sz2.gender = "Nő";
        sz2.getGoal();
        sz2.introduce();

        Person sz3 = new Person();

        sz3.name = "Cthulhu";
        sz3.age = +68538;
        sz3.gender = "?";
        sz3.getGoal();
        sz3.introduce();
     }
}