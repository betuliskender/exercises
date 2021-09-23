class Datamatik{
public static void main(String[] args){
  Teacher teacher = new Teacher("William", 32, false);
  Student student = new Student("Betül", 27, true, "b");
  Student student2 = new Student("Kasper", 30, false, "b");

  System.out.println(teacher.name+" "+teacher.age+" "+teacher.isFemale);
  System.out.println(student.name+" "+student.age+" "+student.isFemale+" "+student.datamatikerTeam);
  System.out.println(student2.name+" "+student2.age+" "+student2.isFemale+" "+student2.datamatikerTeam);
}
}
