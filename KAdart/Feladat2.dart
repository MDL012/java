/*Check that the string “To be, or not to be, that is the question” contains a specific substring:
"bee"
"to be"
Use a string method.
Answer in a complete sentence.

Ellenőrizze, hogy a „Lenni vagy nem lenni, ez a kérdés” karakterlánc tartalmaz-e egy adott részstringet:
"méh"
"lenni"
Használjon karakterlánc-módszert.
Teljes mondatban válaszoljon.
*/
void main()
{
  String hamleth = "Lenni vagy nem lenni, ez a kérdés";
  String hamlethB = hamleth.toLowerCase();
    bool meh = hamlethB.contains("méh");
    bool lenni = hamlethB.contains("lenni");
    print("Szöveg: $hamleth");
    if(meh){
      print("A 'méh1 szó benne van a szövegben.");
    }
    else{
      print("A 'méh' szó nincs benne a szövegben.");
    }
     if(lenni){
      print("A 'lenni' szó benne van a szövegben.");
    }
    else{
      print("A 'lenni' szó nincs benne a szövegben.");
    }
}