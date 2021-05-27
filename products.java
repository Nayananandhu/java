import java.io.*;
import java.util.Scanner;
class products
{ 
 int pcode;
 String pname;
 Float price;
 
 void read() throws IOException
 {
   System.out.print("\n");
   Scanner po = new Scanner(System.in);
   System.out.print("Enter the Product code: ");
		
   pcode=po.nextInt();
   System.out.print("Enter the product name: ");
		
   pname=po.next();
   System.out.print("Enter the product price: ");
		
   price=po.nextFloat();
   
 }
 void Display() throws IOException
 {
  System.out.println("Product code: " + pcode);
  System.out.println("Name of the Product: " + pname);
   System.out.println("Price of the product: " + price);
  
  }
public static void main(String args[])throws IOException
{
 int n;
 int emp;
 
 products p[]=new products[5];
 for(int i=1;i<=3;i++)
 {
  p[i]=new products();
  p[i].read();
  
 }
 
 int min=1;
 for(int i=1;i<=3;i++)
 {
  
  if(p[min].price>p[i].price)
  {
   min=i; 
     }
  }

System.out.print("\n Product with min price  \n");
p[min].Display();


 }

}
