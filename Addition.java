import java.util.*;
public class Calculator{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    System.out.println("Enter Operator");
    char op = sc.next().charAt(0);
    switch(op){
       case '+':
          System.out.println(x+y);
          break;
   
       
     }
  }
}
						
    

