package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                //
                Scanner input = new Scanner(System.in);
                ArrayList<GroceryItem> groceryItem = new ArrayList<>();

                String add = " ";
                do {
                    System.out.println("Enter an item name");
                    String item = input.nextLine();

                    System.out.println("Enter price");
                    double price = input.nextDouble();

                    System.out.println("Enter quantity");
                    int quantity = input.nextInt();

                    groceryItem.add(new GroceryItem(item, price, quantity));

                    System.out.println("Would you like to add another item. Y(yes) or N(no)");
                    add = input.next();

                    input.nextLine();

                } while (add.equalsIgnoreCase("Y") || add.equalsIgnoreCase("yes"));

                System.out.println("====================================GROCERY ITEMS==============================================");
                System.out.println("Item Name: " + "\t\t" + " Price " + "\t\t" + " Quantity " + "\t\t" + " Cost ");

                double purchaseamount = 0;
                for (GroceryItem g : groceryItem) {
                    System.out.println(g.getItemName() + "\t\t\t" + "$" + String.format("%.2f", g.getPrice()) + "\t\t\t" + g.getQuantity() + "\t\t\t\t" + "$" + String.format("%.2f", g.getCost()));
                    //print on same line with 2 decimal places

                    purchaseamount+=g.getCost();
                }
                System.out.println("Total purchase amount: " + String.format("%.2f", purchaseamount) );
//        System.out.printf("%.2f", + purchaseamount); print on next Line
                System.out.println("\nTotal purchased items: " + groceryItem.size());

                if (purchaseamount>20){
                    System.out.println("You spent too much today!");
                }else{
                    System.out.println("Thanks for shopping!");
                }
            }
        }



