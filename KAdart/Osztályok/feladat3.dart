//3. Hozzon létre Home osztályt a , , tulajdonságokkal. Hozzon létre egy úgynevezett metódust,
//amely kiírja a tulajdonságok értékeit. Hozzon létre egy objektumot az osztályból,
//és állítsa be a tulajdonságok értékeit. Hívja meg a metódust a tulajdonságok értékeinek kinyomtatásához.

class Home{
  String? utca;
  int? hazszam;
  String? telepules;
  void kiirat(){
    print("Lakcím: $telepules $utca Utca. $hazszam.");
  }
}
void main(){
  Home home = new Home();

  home.utca = "Kossuth Lajos";
  home.hazszam = 34;
  home.telepules = "Pálmonostora";
  home.kiirat();
}