import java.util.Scanner;

public class IT24103697Lab5Q1
{
public static void main(String args[])
{

//declaring the variables
int num1,num2,num3,max,min;

// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		
System.out.print("Enter the first integer:"  );
  num1 = scanner.nextInt();
System.out.print("Enter the second integer:" );
  num2 = scanner.nextInt();
System.out.print("Enter the third integer:" );
  num3 = scanner.nextInt();
 
 max = num1;
 if(num2>max)
	 max = num2;
 if(num3>max)
	 max=num3;
 
 min = num1;
 if(num2<min)
	 min=num2;
 if(num3<min)
	 min=num3;

System.out.println("The numbers you entered are:" + num1 + " " + num2 +" " +num3);

System.out.println("The smallest number:" + min);
System.out.print("The highest number:" + max);

//close the scanner
scanner.close();
}
}

