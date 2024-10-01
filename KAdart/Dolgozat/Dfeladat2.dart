void main()
{
  int sz1 = 4;
  int sz2 = 6;
  int sz3 = 2;

  if(sz1 + sz2 <= sz3 || sz3 + sz2 <= sz1 || sz3 + sz1 <= sz2 || sz1 == 0 || sz2 == 0 || sz3 == 0){ 
    print("A megadott számok nem alkothatnak háromszöget");
  }
  else{
    print("A megadott számok háromszöget alkothatnak.");
  }
}