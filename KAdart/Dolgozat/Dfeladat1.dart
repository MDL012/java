import 'dart:io';

void main()
{
    int sz1 = 15;
    int sz2 = 8;
    if(sz1 > sz2){
      int s = sz1;
      sz1 = sz2;
      sz2 = s;
    }
    print("A kisebb oldal: $sz1.");
    print("A nagyobb oldal: $sz2.");

    String alak  = "téglalap";
    if(sz1 == sz2){
      alak = "négyzet";
    }
    print("A négyszög egy $alak.");

    int szK = 2*(sz1+sz2);
    int szT = sz1*sz2;
    print("A négyszög kerületét: $szK.");
    print("A négyszög területét: $szT.");
}