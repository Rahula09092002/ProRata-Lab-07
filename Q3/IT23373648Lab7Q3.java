import java.util.Scanner;

public class IT23373648Lab7Q3 {
   
   public static void main(String [] args){
   
     Scanner input = new Scanner(System.in);
	 
	 for(int i = 1; i <=5 ; i++){
	  
	   System.out.print("Enter total bill amount for customer " + i + " :");
	   double billAmount = input.nextDouble();
	   
	   System.out.print("Enter payment mode (C/O) : ");
	   char paymentMode = input.next().charAt(0);
	   
	   double discount = 0 ;
	   double amountToPay;
	   
	   if(paymentMode == 'C' || paymentMode == 'c'){
	     discount = billAmount * 0.05;
		 amountToPay = billAmount - discount;
		 
		 System.out.println("Discount:" + discount);
		 System.out.println("Amount to be paid : " + amountToPay);
		 
	   }else if (paymentMode == 'O' || paymentMode == 'o'){
	     amountToPay = billAmount;
		 
		 System.out.println("Discount: 0");
		 System.out.println("Amount to be paid: " + amountToPay);
	   }else{
	     System.out.println("Payment Mode is Not valid");
	   }
	   System.out.println();
	 }
	 
	 input.close();
   }
}