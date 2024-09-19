/*
Write a program that checks if a given year is a leap year or not.

Leap years:
2000, 2004, 1904, 2024, 1600

Not leap years:
1900, 1929, 1933, 2023, 1867

Írjon programot, amely ellenőrzi, hogy egy adott év szökőév-e vagy sem.

Szökőévek:
2000, 2004, 1904, 2024, 1600

Nem szökőévek:
1900, 1929, 1933, 2023, 1867
*/

void main()
{
  int
  int ev = 2000;
  String szokoev = "Az év nem szökőév";
  if(ev%4==0){
    if(ev%100==0){
      if(ev%400==0){
        szokoev = "Az év szökőév";
      }
    }
    else{
       szokoev = "Az év szökőév";
    }
  }

}