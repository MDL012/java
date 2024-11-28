//2. Hozzon létre egy Camera osztályt a következő tulajdonságokkal: , , . Hozzon létre egy úgynevezett metódust,
//amely kiírja a három tulajdonság értékét. Hozzon létre két objektumot a Kamera osztályból, és hívja meg a metódusmegjelenítést.

class Camera{
  String? gyarto;
  String? tipus;
  String? felbontas;
  void kiirat(){
    print("A kamera: $gyarto $tipus. Felbontás: $felbontas");
  }
}
void main(){
  Camera camera1 = Camera();
  Camera camera2 = Camera();


  camera1.gyarto = "Sony";
  camera1.tipus = "XX-31-1";
  camera1.felbontas = "8140X7660";

  camera2.gyarto = "Sony";
  camera2.tipus = "YY-79-9";
  camera2.felbontas = "3440X2960";

  camera1.kiirat();
  camera2.kiirat();
}
