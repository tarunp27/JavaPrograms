public  class Switch{
    public static void main(String[] args){
        int number = 10;
      switch(number) {
          case 5: 
          System.out.println("small");
          break;

          case 15:
          System.out.println("large");
          break;

          case 10:
          System.out.println("Matching");
          break;

          default:
          System.out.println("Optimum");
          break;
      }
    }
}