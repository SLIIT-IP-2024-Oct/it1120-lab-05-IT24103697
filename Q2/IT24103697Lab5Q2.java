import java.util.Scanner;

public class IT24103697Lab5Q2
{
public static void main(String args[])
{

//declaring the variables
int newMember;
String prize;

// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		
System.out.print("Enter the number of new members introduced:");
newMember = scanner.nextInt();

if(newMember<0)
{
System.out.println("Imput must be greater than 0");
}
else
{
	
switch(newMember)
{
case 0:
prize = "No prize";
break;

case 1:
prize = "Pen";
break;

case 2:
prize = "Umbrella";
break;

case 3:
prize = "Bag";
break;

case 4:
prize = "Travelling chair";
break;

case 5:
prize = "Headphone";
break;

}

System.out.print("Prize is : " + prize);
}

//close the scanner 
scanner.close();
}
}