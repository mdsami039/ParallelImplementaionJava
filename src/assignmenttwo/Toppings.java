/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmenttwo;
import java.util.Scanner;
import java.util.regex.Matcher;//This package is imported to validate phone number
import java.util.regex.Pattern;//To mathc with the given number
/**
 *
 * @author hammad
 */
public class Toppings 
{
String toppings[]={"0.Bacon","1.Olives","2.Mushrooms","3.Ham","4.Pineapple","5.Salami","6.Anchovies"};
//Created a array ot toppings to show to the user
int c,order,tops;
String c1="";
String cName;
String typeOforder="";
String addr="";
String typePizza="";
String phoneNo;
String phoneNo1="";
int numToppings;
Scanner sc;
int counter=0;
double cost;
String typeOftoppings[]=new String[6];
int index,toppingCharge;

boolean check;
boolean check2=true;
boolean check3=true;
boolean check4=true;
public void selectTop()
{//selectTop method to accept the input from the user and to display the toppings
 sc=new Scanner(System.in);
 
 check=true;
  while(check)//Created a while loop inorder to ask user untill he gave right input
    {
       System.out.println("Do you want toppings");
       System.out.println("1.Yes or 2.No");
 try{    
  c=Integer.parseInt(sc.nextLine());//throw an exception whenever shring gives as input
  if(c<1||c>2)//if user select neither of the two options were select warn the user
  {
      System.out.println("Sorry...invalid letter");
      check=true;
  }
  
  else{check=false;}
  } 
catch(Exception e)
{
    System.out.println("Please enter the integers only");
    check=true;
}
}
 numToppings=0;
 toppingCharge=0;
 while((c==1)&&(toppingCharge<5))/*While loop evaluated based on the user input
                     if the user selects option and toppingCharge should be less than 4
                       user can select maximum of four toppings */             
 {
 for(String s:toppings)//This loop dislplay the toppings available in the array
 System.out.println(s);
 System.out.println("\nPlease enter type of toppings you want");
 //check2=true;
 int s=1;
 while(s==1)
 {
 try
 {   
 index=Integer.parseInt(sc.nextLine());//if the user is selected any non integer value display the error message
 if(index<0||index>7)//It evaluated when user enter either less than zero or greater than 7
 {
     System.out.println("Enter the value between 0 and 6");
   s=1;
     
 }
 else{s=2;}
 }
 catch(NumberFormatException e)//catch the exception whenever inputmistach is given
 {
     System.out.println("Please enter valid integers");
     s=1;
 }
 }
 
 typeOftoppings[numToppings]=toppings[index];//typeOftoppings store the selected toppings by using index
 index++;//for every successive loop index value increases by one
 toppingCharge++;//for every successive loop toppingCharge value increases by one
 numToppings++;
 
     check3=true;
 while(check3)//It evaluate every time to ask user for further selectionn of the toppings
         {  
             System.out.println("Do you want additional Toppings");
             System.out.println("1.Yes or 2.No");
          //   sc.next();
 try{    
     
  tops=Integer.parseInt(sc.nextLine());//raises an exception whenever string or non integer values is given
  if(tops<1||tops>2)
  {
      System.out.println("Sorry...invalid letter");
      check3=true;
  }if(tops==1)
  {
  c=1;
  check3=false;
  }
  if(tops==2)
  {
      c=2;
  check3=false;
  
  }
  
 }
catch(Exception e)
{
    System.out.println("Please enter the integers only");
    check3=true;
}
}
 
 }
 
}

void summary(int order,String cName,String typeOforder,String phoneNo,String addr,double cost,String typeOfpizza) 
        //Display at the end of the selling pizza to the customer with the pizza details...
        
    {
        System.out.println("Name of the Customer is "+cName);
        System.out.println("phone number of the Customer is "+phoneNo);
        System.out.println("Type of the Pizza is "+typeOfpizza);
        System.out.println("Type of the order is "+typeOforder);
        if(c==1)
        {
        for(int i=0;i<numToppings;i++)
        {
            System.out.println("Type of toppings are "+typeOftoppings[i]);
        }
        }
        if(order==2)
        {
          System.out.println("Address of the customer is "+addr);
        }
       System.out.println("Total Cost of the Order is $ "+cost);
    }
public void recordCol(double c,String typePizza)
{//Customer can ask for eat in or take away
    sc=new Scanner(System.in);
    System.out.println("Do you want 1-Collected or 2-Delivered");
    System.out.println("1.Yes or 2.No");
    check4=true;
    while(check4)//this loop to ask user continuously until user enter valid input
    {        
    try
    {
     order=Integer.parseInt(sc.nextLine());//throws an exception whenever entered string or character or simple entered
    if(order<1||order>2)//if the input is less than 1 and greater than 2 throws an exception 
    {
        System.out.println("Invalid Integer");
        check4=true;
    }
    else{
        check4=false;
    }
    } catch(NumberFormatException e)
    {
        System.out.println("Please enter only 1 or 2 only");
        check4=true;
    }
    }
    if(order==1)
    {
    typeOforder="Collected";
    }
    if(counter==0)
    {
    System.out.println("Enter the name of the Customer");
    while(check2)
    {
    try{
        cName=sc.nextLine();
        
        if((cName.length()!=5)||cName.isEmpty())
        {
            System.out.println("Enter a proper 5 letter Name");
            check=true;
        }
       else
        {
        check2=false;
        }
    }
    catch(Exception e)
    {
        
        System.out.println("Please enter letters only");
        check2=true;
    }
    }
    System.out.println("Enter the phone number of the Customer");
    check3=true;
    //String phoneNo1="";
    check3=true;
    while(check3)
    {
    try{
       phoneNo1=sc.next();
       Pattern p=Pattern.compile("\\d[0-9]{5}");//Sets the pattern as only digits and length is Ten
       Matcher m=p.matcher(phoneNo1);
    if(phoneNo1.length()!=5)
     {
         System.out.println("Please Enter a valid 5 digit phone number");
         check3=true;
     }
     else{check3=false;}
     }
    catch(Exception e)
    {
           System.out.println("Enter digits only");
    }
}
    if(order==2)//if the Delievered is selected it takes the address from the customer
    {
    typeOforder="Delivered";
    System.out.println("Enter the address of the customer");
    int a=1;
    while(a==1)
    {
        try
        {
            addr=sc.nextLine();//prompt the user untill user enter the address up to lenght 10
             if(addr.length()<10)
             {
        System.out.println("Please enter the proper address");
        a=1;
             }
             else{a=0;}
        }
        catch(Exception e)
        {
            System.out.println("Invalid address");
        }
    }
    
       if(cost<30)
        cost+=8;
    }
    }
    double exp=cost;
    String tp=typePizza;
    String tops[]=toppings;
    counter++;
    
    summary(order,cName,typeOforder,phoneNo1,addr,exp,tp);
}

public void smallSize(int p,String type)//
{
    typePizza=type;
    selectTop();
    cost=p+toppingCharge;//set the cost of the pizza plus by taking toppings charges and actual price of the pizza
    recordCol(cost,typePizza);//call the recordCol methods to enter the customer details
    
}
public void mediumSize(int p,String type)
{
 typePizza=type;
 selectTop();
 cost=p+toppingCharge;//set the cost of the pizza plus by taking toppings charges and actual price of the pizza
 recordCol(cost,typePizza);
}
public void largeSize(int p,String type)
{
    typePizza=type;
    selectTop();
    cost=p+toppingCharge;//set the cost of the pizza plus by taking toppings charges and actual price of the pizza
    recordCol(cost,typePizza);
    
}

}

    
        
        
      



              


