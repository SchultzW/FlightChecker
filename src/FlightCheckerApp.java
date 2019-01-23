import java.util.Scanner;

public class FlightCheckerApp
{
	 final int MAX_ROW = 5;
     final int MAX_COL = 3;
     static int[][] seatArray =    { { 450, 450, 450, 450 },
                               { 425, 425, 425, 425},
                               { 400, 400, 400, 400},
                               { 375, 375, 375, 375},
                               { 375, 375, 375, 375},
                               { 350, 350, 350, 350} };
     static int row;
	 static int col;
	 static Scanner in = new Scanner(System.in);
     
     public static void main(String[]args)
 	{
    	int price;
 		 String newLine = System.getProperty("line.separator");
 		
 		System.out.println("    0    1   2   3 "+newLine+
 						   "0   A1  A2   A3  A4"+newLine+
 						   "1   B1  B2   B3  B4"+newLine+
 						   "2   C1  C2   C3  C4"+newLine+
 						   "3   D1  D2   D3  D4"+newLine+
 						   "4   E1  E2   E3  E4"+newLine+
 						   "5   F1  F2   F3  F4"+newLine);
 		      
 		  getInput();
 		  System.out.println("choose a column");
 		  col=Integer.parseInt(in.nextLine());
 		  price=getFlight(row,col);
 		  
 		
 	}
     public static void getInput()
     {
    	 int price;
    	 row=getRow();
    	 col=getCol();
    	 price=getFlight(row,col);
    	 confirm(price);
     }
     public static int getRow()
     {
    	 System.out.println("choose a row");
    	 row=Integer.parseInt(in.nextLine());
    	 return row;
     }
     public static int getCol()
     {
    	 System.out.println("choose a column");
    	 col=Integer.parseInt(in.nextLine());
    	 return col;
     }
     public static int getFlight(int row, int col)
     {
    	 int price=0;
    	 price=seatArray[row][col];
    	 return price;
     }
     public static void confirm(int price) 
     {
    	 
    	 System.out.println("Your flight costs $"+price);
    	 System.out.println("Is this okay? Yes/No");
    	 String check=in.nextLine();
    	 if(check.toLowerCase().equals("yes"))
    	 {
    		 System.out.println("Your flight has been booked.");
    		 System.exit(1);
    	 }
    	 else
    	 {
    		 getInput();
    	 }
     }
	
}
