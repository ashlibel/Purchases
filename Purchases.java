//Ashley Gutierrez Carreto
//December 7, 2023
//Lab 13 Purchases
//This code keeps the record of the purches that were made at a store.
//It asks the user the item's name, price, and the number bought. 
//This will then write all of it's data to a text file. Once
//all the items are entered then it will print out the total cost.
import java.io.PrintWriter;
import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;

public class Purchases
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double cartCost = 0.0;
        int numItems = 0;
        String itemName = " ";
        String input = "";
        int numberBought = 0;
        double totalCost;
        double itemPrice = 0;
        String fileName = "products.txt";
        Scanner inputStream = null;
        System.out.println ("The file "+ fileName +
                            "\ncontains the following lines: \n");
         
        System.out.print("Enter the name of the item: ");
            
        input = keyboard.nextLine();
           
        while (!input.equalsIgnoreCase("exit"))
        {
            itemName = input;              
            System.out.print ("Enter item price:");
            itemPrice = Double.parseDouble (keyboard.nextLine());
                    
            System.out.print ("Enter number of items bought: ");
            numberBought = Integer.parseInt (keyboard.nextLine());
                    
            totalCost= numberBought * itemPrice;
            cartCost += totalCost;
            String write = itemName + " Price: " +itemPrice + "\nQuanity: " 
                          + numberBought+ "\nTotal Cost: " +cartCost;
            System.out.printf (write);
            System.out.printf("\n");
            System.out.print("Enter the name of the item: ");
            input = keyboard.nextLine();
        }

        System.out.println("\n Total Amount of Items Purchased: " +numberBought);
        System.out.println(" Total cost:  " + cartCost); 
        //double precision data
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(fileName);   
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("Error opening the file" + fileName);
            System.exit (0);
        }

        String productOutput = itemName + "," + itemPrice + ","+ numberBought 
                                        + "," + cartCost;
        System.out.println(productOutput);
        outputStream.println(productOutput);
        outputStream.close();
    }
}
        