<<<<<<< HEAD


public class main{

	public static void main(String [] args){



 // Stores two numbers
        double num1, num2;
 
        // Take input from the user
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the numbers:");
 
        // Take the inputs
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
 
        System.out.println("Enter the operator (+,-,*,/):");
 
        char op = sc.next().charAt(0);
        double o = 0;
 
        switch (op) {
        // case to add two numbers
        case '+':
            o = num1 + num2;
            break;

	}


}

 

=======
case '-':
            o = num1 - num2;
            break;
>>>>>>> substraction
