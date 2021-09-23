class Main{
  public static void main(String[] args){
String[] stringArray = new String[]{"Betul", "Kasper", "Phiilip"};
int[] intArray = new int[]{2,4,3};
printArray(stringArray);
System.out.println(sumOfInt(intArray));
System.out.println(avgArray(intArray));
}

public static int sumOfInt(int[] arr){
int sum = 0;
for(int i = 0; i<arr.length;i++){
  sum= sum + arr[i];
}
return sum;
}

public static void printArray(String[] arr){
  for(int i = 0; i<arr.length;i++){
    System.out.println(arr[i]);
}
}

public static int avgArray(int[] arr){
  int sum = 0;
  for(int i = 0; i<arr.length;i++){
    sum= sum + arr[i];
  }
  return sum/arr.length;
}

//opgave 4.e: Jeg ville bruge Arrays.sort() metoden til at sortere arrayet.

}
