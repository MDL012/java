/*currentHours = 14;
currentMinutes = 34;
currentSeconds = 42;

/Write a program that prints the remaining seconds (as an integer) from a
day if the current time is represented by the variables above

Írjon programot, amely kiírja egy nap hátralévő másodperceit (egész számként),
az aktuális időt a fenti változók képviselik
*/
void main()
{
  int currentHours = 14;
  int currentMinutes = 34;
  int currentSeconds = 42;
  
  int akti = (currentHours*60+currentMinutes)*60+currentSeconds;
  int endi = 24*60*60;
  int hati = endi-akti;
  print(hati);
}