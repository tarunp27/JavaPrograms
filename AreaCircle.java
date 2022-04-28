public class AreaCircle
{
    double result = 0;
    double calcArea(double r)
       {
           return 3.14 * r * r ;
       }
       public static void main(String[] args){
           AreaCircle ac = new AreaCircle();
           ac.result = ac.calcArea(10);
           System.out.println("Area of circle =" + ac.result); 
       }
}