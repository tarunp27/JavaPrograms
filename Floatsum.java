public class Floatsum {

  public static void main(String[] args) {
    float[] numbers = { 100.5f, 56.5f, 33.5f, 21.5f, 10.5f, 7.77f };
    float result = 0.0f;
    for (float value : numbers) {
      result = result + value;
    }
    System.out.println("1.Result:" + result);

    result=0.0f;
    for(int i=0; i<numbers.length; i++){
        result= result+ numbers[i];   
    }
    System.out.println("2.Result:" + result);
  }
}
