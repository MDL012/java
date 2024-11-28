//1. Hozzon létre egy osztályt három tulajdonsággal: , , és . Ezenkívül hozzon létre egy metódust, amely a három tulajdonság értékét írja ki.

class AHaromTulajdonsag{
  String? vezetekerestnev;
  String? kerestnev;
  int? eletkor;
  void kiirat(){
    print("Neve: $vezetekerestnev $kerestnev. Életkor: $eletkor");
  }
}
void main(){
  AHaromTulajdonsag aht = new AHaromTulajdonsag();
  aht.vezetekerestnev = "Mészáros";
  aht.kerestnev = "Dénes Lajos";
  aht.eletkor = 21;
  aht.kiirat();
}