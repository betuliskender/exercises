/*
int a = 3;
 int b = 7;
 int sum = 10;
 
 if(a!=sum && b!=sum && a+b==sum){
 println("Succes");
 } else {
 println("Failure!");
 }
 */

int x = 17;
int y = 9;
int z = 4;
int sum = 30;

//x cant be 10, 20 or 30
if (x == 10 || x == 20 || x == 30) {
  println("Failure!");
}

//y cant be 10, 20 or 30
if (y == 10 || y == 20 || y == 30) {
  println("Failure!");
}

//z cant be 10, 20 or 30
if (z == 10 || z == 20 || z == 30) {
  println("Failure!");
}

if (x!=sum && y!=sum && z!=sum && x+y+z==sum) {
  println("Succes");
} else {
  println("Failure!");
}
