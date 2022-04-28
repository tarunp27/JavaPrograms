public class For {

  public static void main(String[] args) {
    /*
    int number = 5;
    for (int i = 1; i <= number; ++i) {
      System.out.println("Repetition");
    }
    int n = 5;
    System.out.println("These are odd number");
    for (int j = 0; j <n; j++) {
      System.out.println(2*j+1);
    }

    for(int i=1; i<=3;i++){
        for(int j=1; j<=4;j++){
            System.out.println(i+" "+j);
        }
    }
*/

    int[] arrayNums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    for (int val: arrayNums) {
      if(val % 2 == 0){
          continue;
      }
      if (val >= 15){
        break;
      }
      System.out.println(val);
    }
  }
}
