import java.util.*;
public class even {
    /**
     * @param n
     * @return
     */
    public static boolean iseven(int n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        else{
            return false;
        }
      }
        public static void main(String[] args)
        {
          Scanner sc=new Scanner(System.in);
          
          int n=sc.nextInt();
          if(iseven(n)){
            System.out.println("number is even");
          }else{
            System.out.print("number is odd");
          }
        }
     
}
