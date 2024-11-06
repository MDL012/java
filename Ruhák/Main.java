package Ruhák;

public class Main {


    public static void main(String[] args) {
    Gardrobszekreny gardrobszekreny = new Gardrobszekreny(0,0);
    gardrobszekreny.addCloth(new Felsoruhazat());
    gardrobszekreny.addCloth(new Felsoruhazat());
    gardrobszekreny.addCloth(new Felsoruhazat());
    gardrobszekreny.addCloth(new Alsoruhazat());
    gardrobszekreny.addCloth(new Alsoruhazat());
    gardrobszekreny.addCloth(new Alsoruhazat());

    System.out.println(gardrobszekreny.printInfo());

    gardrobszekreny.washAllClothes();
    System.out.println(gardrobszekreny.printInfo());

    gardrobszekreny.repairAllClothes();
    System.out.println(gardrobszekreny.printInfo());

    System.out.println(gardrobszekreny.purge());
    }}
