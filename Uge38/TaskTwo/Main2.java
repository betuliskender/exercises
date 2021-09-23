class Main2{

public static void main(String [] args) {
  sumOf(2,3);
  System.out.println(myWords("Hej"));
  System.out.println(ifUpperCaseTrue("Velkommen"));
  }


  public static void sumOf(int s1, int s2){
  System.out.println(s1+s2);
  }

  public static String myWords(String string1){
    return string1.toUpperCase();
  }

  public static boolean ifUpperCaseTrue(String string2){
 return Character.isUpperCase(string2.charAt(0));
    }

}
