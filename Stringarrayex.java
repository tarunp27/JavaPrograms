public class Stringarrayex {

  public static void main(String[] args) {
    String[] Students = { "Tarun", "Mala", "Pugal", "Sarvesh" };
    for (int i = 0; i <= 3; i++) {
      System.out.println(Students[i]);
      System.out.println();
    }
    int[] marks;
    marks = new int[3];
    marks[0] = 100;
    marks[1] = 77;
    marks[2] = 89;

    for (int results : marks) {
      System.out.println(results);
    }
    //for each array string
    System.out.println("------------------------");
    for(String name: Students){
        System.out.println(name);
    }


  }
}
