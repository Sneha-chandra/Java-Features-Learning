//MyCalculator.java
package p1;
public class MyCalculator{
    public int Add(int x,int y)
    {
        return x+y;
    }
   public int Subtract(int x,int y)
    {
        return x-y;
    }
    public int Product(int x,int y)
    {
        return x*y;
    } }
//TestPackage.java
import p1.MyCalculator;
class TestPackage{
    public static void main(String[] args)
    {
     MyCalculator M = new MyCalculator();
     System.out.print("\n\n\tThe Sum is : " + M.Add(45,10));
      System.out.print("\n\n\tThe Subtract is :" + M.Subtract(45,10));
      System.out.print("\n\n\tThe Product is :" + M.Product(45,10));
    }
}

