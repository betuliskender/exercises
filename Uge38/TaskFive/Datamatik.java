class Datamatik{

  static Student [] studentArray = new Student[]{
   new Student("Betül", 27, true, "b"),
   new Student("Kasper", 30, false, "b"),
    new Student("Phillip", 27, false, "b"),
   new Student("Malene", 30, true, "b"),
   new Student("Martin", 29, false, "b"),
   new Student("Long", 29, false, "b"),
   new Student("Mia", 28, true, "b"),
   new Student("Mads", 25, false, "b"),
   new Student("Kim", 32, false, "b"),
   new Student("Kristian", 23, false, "b")
  };


    public static void main(String[] args){
      arrayInt(studentArray, 1);
      System.out.println(arrayString(studentArray, "Mia"));
    }

    public static void arrayInt(Student[] arr, int tal){
      System.out.println(arr[tal].name);
    }

    public static int arrayString(Student[] arr, String ord){
      for(int i=0; i<arr.length;i++){
        if(arr[i].name.equals(ord)){
          return i;
        }
      }
      return -1;
    }
  }
