void main()
{
  int sz1 = 0;
  do{
    print("Kérek egy 3 jegyű egész számot");
    sz1 = 362;
    print(sz1);
    if(sz1 > 99 && sz1 < 1000){
      break;
    }
    else{
      print("Túl nagy vagy túl kicsi szám let beűtve.");
    }
  } while (true);
  String nem = "nem ";
  for(int i = 10; i < 32; i++){
    if(i*i == sz1){
      nem = "";
      break;
    }
  }
  print("Ez a szám "+ nem +"négyzetszám.");
  nem = "nem ";
  for(int i = 2; i < sz1/2;i++){
    if(sz1%i == 0){
      nem = "";
      break;
    }
  }
   print("Ez a szám "+ nem +"prímszám.");
}