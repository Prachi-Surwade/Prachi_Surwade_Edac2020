/* Q.1)
class Prog1
{
    public static void main(String args[])
    {
	System.out.println("Hello Word");
    }
}*/

//*************************************************

/*Q.2)

 class Prog2
 {
    public static void main(String args[])
    {
	int rollNo = 100;
	System.out.println("Roll No = " +rollNo);
     }
 }*/
//********************************************************************

/* 03.Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ] */

import java.util.*;
 
class Assignment1
{
    public static void main(String args[])
    {
        double x,y;
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        //y=sc.nextInt();
        y= Math.pow(x,2) + (3*x) - 7;       
        System.out.println(y);
    }
    
} 



	





/* Q. 5) Write a Program to accept a String as a command line argument and print a Welcome message as given below.

class ABC
{
     public static void main(String args[]) 
     {
  	   System.out.println(" Welcome" +args[0]);
     }
}*/