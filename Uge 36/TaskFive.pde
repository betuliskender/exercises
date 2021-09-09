void setup() {
  MethodOne(); 
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it. 
 */

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 

  int max = 10;

  if (i > max) {
    String output = "i is greater than "+max+".";
    println(output); // skal flyttes ind, da det er en lokal vairable og den derfor ikke kan læse den
  }
}

/* 
 Finish the following method so that we can change the number assigned 
 to the weekday and it prints the correct output.  
 */
void MethodTwo() 
{
  int weekDay = 3; // 0 = Monday, 6 = Sunday.
  boolean weekend = false;

  if (weekDay < 5)
  {
    weekend = false;
  } else 
  {
    weekend = true;
  }

  // Print the name of the weekday here: 
  if (weekDay==0) {
    println("It's Monday");
  } 
  if (weekDay==1) {
    println("It's Tuesday");
  } 
  if (weekDay==2) {
    println("It's Wedensday");
  }
  if (weekDay==3) {
    println("It's Thursday");
  } 
  if (weekDay==4) {
    println("It's Friday");
  } 
  if (weekDay==5) {
    println("It's Saturday");
  } 
  if (weekDay==6) {
    println("It's Sunday");
  }
  // Print if it is weekend here:
  if (weekend) {
    println("It's Weekend");
  } else {
    println("It's weekday");
  }
}
