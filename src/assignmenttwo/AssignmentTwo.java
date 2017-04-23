/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmenttwo;
import java.util.Scanner;
/**
 *
 
 */
public class AssignmentTwo {
   
   
    
  /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO cod e application logic here
        Toppings t=new Toppings();
        String typeOfpizza;   
        int choice = 0;
        int price;
        double c;
        int dec=0;
        boolean check1,check2;
        //boolean yes;
        Scanner sc;
           do//this loop to execute for the first time and ask user to place the second order
           {
            sc=new Scanner(System.in);
            System.out.println("-----Welcome to the PizzaHut-----");
            System.out.println(" Enter the size of the Pizza");
            System.out.println("1. Small Size\n");
            System.out.println("2. Medium Size\n");
            System.out.println("3. Large Size\n");
            check1=true;
            while(check1)//while loop to execute untill user enter a valid choice
            {
            try{
             choice=Integer.parseInt(sc.nextLine());//thorws a NumberFormat exception, if string is giver
             if(choice<1||choice>3)//check whether input enter between 1 inclusive and 3 inclusive
             {
              System.out.println("Please enter the above integers only");   
             check1=true;
             }
             else{
                     check1=false;
                     }
            }
            catch(NumberFormatException n)
            {
                System.out.println("Please enter proper selection");
                check1=true;
            }
          //  check=false;
            }
            
            switch(choice)//switch case which select based on user input
            {
                case 1: price=5;
                        typeOfpizza="Small Pizza";
                        t.smallSize(price,typeOfpizza);
                        break;
                        
                case 2: price=8;
                        typeOfpizza="Medium Pizza";
                        t.mediumSize(price,typeOfpizza);
                        break;
                    
                 case 3: price=12;
                         typeOfpizza="Large Pizza";
                         t.largeSize(price,typeOfpizza);
                         break;
                    
            }
   
           System.out.println("Do you want Addtional Pizza");//this pormpt the user to choose the option to continue to order the pizza
           System.out.println("1.Yes or 2.No");
           check2=true;
           while(check2)
           {
               try{
                   dec=Integer.parseInt(sc.nextLine());
                   if(dec<1||dec>2)
                   {
                       System.out.println("Please Enter a 1 or 2 only");
                       check2=true;
                   }
                   else{check2=false;}
               }
               
               catch(Exception e)
               {
                   System.out.println("Please enter proper selection");
                   check2=true;
               }
           }
           
          }  while(dec==1);
    
}}
