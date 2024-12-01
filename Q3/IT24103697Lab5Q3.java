import java.util.Scanner;

public class IT24103697Lab5Q3 
{
    public static void main(String[] args)
	{
		//declaring the variables
		double ROOM_CHARGE_PER_DAY = 48000.0;
		int DISCOUNT_10 = 10;
		int DISCOUNT_20 = 20;
        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Input start and end date of the reservation
        System.out.print("Enter the start day of reservation (1-31): ");
        int startDay = scanner.nextInt();
        
        System.out.print("Enter the end day of reservation (1-31): ");
        int endDay = scanner.nextInt();

        // Calculate the number of days reserved
        int daysReserved = endDay - startDay + 1;

        // Check if the input is valid
        if (daysReserved <= 0) {
            System.out.println("Invalid reservation: end day must be after the start day.");
            return;
        }

        // Determine the discount based on the number of days reserved
        int discount = 0;
        if (daysReserved >= 3 && daysReserved <= 4)
			{
            discount = DISCOUNT_10;  // 10% discount
        } 
		else if (daysReserved >= 5)
			{
            discount = DISCOUNT_20;  // 20% discount
        }
        
        // Calculate the total amount before and after discount
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = (discount / 100.0) * totalAmount;
        double finalAmount = totalAmount - discountAmount;

        // Output the results
		System.out.println("Room charge per day:" + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total amount after discount: Rs " + finalAmount);
		
		//close the scanner
		scanner.close();
    }
}
