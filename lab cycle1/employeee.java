import java.util.Scanner;
public class employeee {
 int empid;
 String name;
 float salary;
 public void getInput() {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the empid :: ");
  empid = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextFloat();
 }
 public void display() {
  System.out.println("Employee id = " + empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
 }
 public static void main(String[] args) {
  employeee e[ ]=new employeee[2];  
  for(int i=0; i<2; i++) {   
   e[i] = new employeee();
   e[i].getInput();

  }  

 for(int i=0; i<2; i++)
{
  int id;
Scanner sc = new Scanner(System.in);
System.out.println("enter employee id");
         id = sc.nextInt();
          if(e[i].empid==id)
          e[i].display(); 
  } 
 }
}
