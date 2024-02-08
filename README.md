# Purchases
First time practicing to use a program that creates or reads binary/ text files.
a program that will record the purchases made at a store.  For each purchase, read (from the keyboard) an item’s name, its price, and the number bought.  Compute the cost of the purchase (number bought times price), and write all this data to a text file.  Display this information as you read it.  After all the items have been entered, write the number of items and total cost to the screen. 

When it says, "write all this data to a text file", that means you should write the item’s name, its price, the number bought, and the total cost of the purchase to the file.  Since data written to a file is meant to be read back from the file, you have to write the data in some kind of special format.  You can choose from either of the following two formats.

Use fileName.printf ("---",  itemName, itemPrice, numberBought, totalCost);  Inside the quotation marks, instead of my dashes, you should use %s for String data, %d for int data, and %f for double precision data.  After the % symbol and before the letter (s, d, or f), you can put a number to indicate the number of spaces to allow for the item to take.  If the number takes fewer spaces, the extra space will be filled with blanks.  You can test your code by using System.out.printf (---) instead of fileName.printf (---);

