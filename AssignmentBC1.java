                                     //  Assignment==1
 
 /*Program1. Write a Java program to print 'Hello' on screen and then print your name on a
 separate line.
 Expected Output :
 Hello
 Alexandra Abramov */

  

 /*class Assignment1
 {
	
	public static void main(String[] args)
	{
		System.out.println("Hello");
		System.out.println("Alexandra Abramov");
	}
 }*/
 
//*****************************************************************************************************************************************

 /*2. Write a Java program to print the sum of two numbers.
 Test Data: 74 + 36 */

 /*import java.util.Scanner;
 class Assignment1
 {
	public static void main(String[] arg)
	{
		int a,b,c;
                System.out.println("Enter first no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter second no");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of Two number is: "+c);
	}
 }*/

//*****************************************************************************************************************************************

 /*3. Write a Java program to divide two numbers and print on the screen.
Test Data : 50/3
Expected Output : 16*/

/*import java.util.Scanner;
 class Assignment1
 {
	public static void main(String[] arg)
	{
		int a,b;
		float c;
                System.out.println("Enter first no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter second no");
		b=sc.nextInt();
		c=a/b;
		System.out.println(" Division of two number is: "+c);
	}
 }*/

//*****************************************************************************************************************************************

 /* 4. Write a Java program to print the result of the following operations.
 Test Data:
 a. -5 + 8 * 6
 b. (55+9) % 9
 c. 20 + -3*5 / 8
 d. 5 + 15 / 3 * 2 - 8 % 3
 Expected Output :
 43
 1
 19
 13*/ 
  
 
 /*class Assignment1
 {
      public static void main(String args[])
      {
            System.out.println(-5+8*6);
	    System.out.println((55+9)%9);
	    System.out.println(20+-3*5/8);
	    System.out.println(5 + (15/3)* 2- (8%3));

	}
 }*/


//*****************************************************************************************************************************************

 /* 5. Write a Java program that takes two numbers as input and display the product of two numbers. 
 Test Data:
 Input first number: 25
 Input second number: 5
 Expected Output :
 25 x 5 = 125*/

 /*import java.util.Scanner;
 class Assignment1
 {
      public static void main(String args[])
      {
             Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the First Number:  ");
	     int a=sc.nextInt();
	     System.out.println("Enter the Second Number:  ");
	     int b=sc.nextInt();
	     System.out.println(a+ "x" +b+ "=" +a*b);
      }
}*/


//*****************************************************************************************************************************************

 /*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5*/

 /*import java.util.Scanner;
 class Assignment1
 {
      public static void main(String args[])
      {
             Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the First Number:  ");
	     int a=sc.nextInt();
	     System.out.println("Enter the Second Number:  ");
	     int b=sc.nextInt();
	     System.out.println( a + " + " + b + " = " + (a+b));
 	     System.out.println(a + " - " + b + " = " + (a - b));
	     System.out.println(a + " x " + b + " = " + (a * b));
	     System.out.println(a + " / " + b + "=" + (a / b));
             System.out.println(a + " mod " +b+ "=" + (a % b));

      }
}*/


//*****************************************************************************************************************************************

/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */

 /*  import java.util.Scanner;
   class Assignment1
   {
          public static void main(String args[])
	  {
 	       Scanner scan=new Scanner(System.in);
		
               System.out.print(" Input a Number :");
		int a= scan.nextInt();
    	       
	       for(int i=1;i<10;i++)
		{
		      System.out.println(a + " x " + i + " = " + a * i);
		}
	  }
    }*/


//*****************************************************************************************************************************************

/* 8. Write a Java program to display the following pattern.*/

 /*   class Assignment1 
    {
 
 	   public static void main(String[] args) 
	   {

 	       	System.out.println("   J    a   v     v  a ");
        	System.out.println("   J   a a   v   v  a a");
        	System.out.println("J  J  aaaaa   V V  aaaaa");
        	System.out.println(" JJ  a     a   V  a     a");
    	    }
     }
  */

//*****************************************************************************************************************************************

  /* 9. Write a Java program to compute the specified expressions and print the output.
 Test Data:
 ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 Expected Output
 2.138888888888889 */

 /*class Assignment1  
 {
    public static void main(String[] arg) 
	{
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        }
 }*/


//*****************************************************************************************************************************************

 /* 10. Write a Java program to compute a specified formula.
 Specified Formula :
 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 Expected Output
 2.9760461760461765*/
 
 /*  class Assignment1 
	{
           public static void main (String args [ ] ) 
	   {
 		System.out.println ( 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))) ;
	   }
	}
*/

//*****************************************************************************************************************************************
 

/* 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/

 /* class Assignment1 
  {
       public static void main(String[] args) 
      {
        double R = 7.5;
  	System.out.println("Perimeter is = " + (2 * R * Math.PI));
  	System.out.println("Area is = " + (Math.PI * R * R));
      } 
  }*/

//*****************************************************************************************************************************************

 
 /*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

 /*import java.util.Scanner;
 class Assignment1
 {
 
 	public static void main(String[] args)
        {
  	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter First number: ");
  	    int No1 = in.nextInt();
   	    System.out.print("Enter second number: ");
            int No2 = in.nextInt();
            System.out.print("Input third number: ");
            int No3 = in.nextInt();
   	    System.out.println("Average of Three numbers is: " + 
            (No1 + No2 + No3) / 3);
         }
 }*/

//*****************************************************************************************************************************************
  
  /*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */

  /* public class Assignment1 
   {
        public static void main(String[] strings) 
        {
 		 double width = 5.6;
        	 double height = 8.5;	
        	double perimeter = 2*(height + width);
		double area = width * height;			
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
         }
    } */

//*****************************************************************************************************************************************


 /*14. Write a Java program to print an American flag on the screen.*/
  
 /*  class Assignment1 
   {
       public static void main(String[] args)
       {
        	System.out.println("* * * * * * ==================================");
        	System.out.println(" * * * * *  ==================================");
        	System.out.println("* * * * * * ==================================");
        	System.out.println(" * * * * *  ==================================");
        	System.out.println("* * * * * * ==================================");
        	System.out.println(" * * * * *  ==================================");
        	System.out.println("* * * * * * ==================================");
        	System.out.println(" * * * * *  ==================================");
        	System.out.println("* * * * * * ==================================");
        	System.out.println("==============================================");
                System.out.println("==============================================");
        	System.out.println("==============================================");
        	System.out.println("==============================================");
        	System.out.println("==============================================");
        	System.out.println("==============================================");
       }
    }*/

//*****************************************************************************************************************************************

 //15. Write a Java program to swap two variables.
  /* import java.util.Scanner;
   public class Assignment1
   {
 	public static void main(String[] args) 
	{
   	 	int a, b,temp;
   		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number: ");
   		a = in.nextInt();
   		System.out.println("Enter the second number: ");
   		b = in.nextInt();
		temp = a;
   		   a = b;
   		   b = temp;
	       System.out.println(" Swapped values Are:" + a + " and " + b);
        
	}
    }*/ 

//***************************************************************************************************************************************** 


 //16. Write a Java program to print a face.

  /*public class Assignment1
   {
      public static void main(String[] args)
      {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
      }
   }*/

//*****************************************************************************************************************************************

 /* 17. Write a Java program to add two binary numbers.
  Input Data:
  Input first binary number: 10
  Input second binary number: 11
  Expected Output
  Sum of two binary numbers: 101 */
  
  /*import java.util.Scanner;
   
  class Assignment1

 {
   public static void main(String[] args)
   {
	//Two variables to hold two input binary numbers	 
	long b1, b2;
	int i = 0, carry = 0;

	//This is to hold the output binary number
	int[] sum = new int[10];

	//To read the input binary numbers entered by user
	Scanner scanner = new Scanner(System.in);

	//getting first binary number from user
	System.out.print("Enter first binary number: ");
	b1 = scanner.nextLong();
	//getting second binary number from user
	System.out.print("Enter second binary number: ");
	b2 = scanner.nextLong();

	//closing scanner after use to avoid memory leak
	scanner.close();
	while (b1 != 0 || b2 != 0) 
	{
		sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
		carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
		b1 = b1 / 10;
		b2 = b2 / 10;
	}
	if (carry != 0) {
		sum[i++] = carry;
	}
	--i;
	System.out.print("Output: ");
	while (i >= 0) {
		System.out.print(sum[i--]);
	}
	System.out.print("\n");  
   }
}*/  

//or we can write same program using Wrapper class Given Below... 


  
 /* class Assignment1
  {
     public static void main(String a[])
     {
        
        String A="10";
	String B="11";
	System.out.println("Input First Binary Number:  "  +A);
	System.out.println("Input Second Binary Number:  "  +B);

	int A1=Integer.parseInt(A,2);//The java.lang.Integer.parseInt(String s, int radix) method parses the string argument s as 
        //a signed integer in the radix specified by the second argument radix
	int B1=Integer.parseInt(B,2);
	
        int add=A1+B1;

	System.out.println("Sum of Two Binary Number:  " +Integer.toBinaryString(add));//returns the string representation of the  int value 
                                                                                     // represented by the argument in binary (base 2)
     }	
  }
  */

//*****************************************************************************************************************************************

/* 19. Write a Java program to convert a decimal number to binary number.
 Input Data:
 Input a Decimal Number : 5
 Expected Output
 Binary number is: 101 */

 /*import java.util.Scanner;
 class Assignment1
 {
      public static void main(String args[])
    {
        int dec_num, quot, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();
		
        quot = dec_num;
		
        while(quot != 0)
        {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}*/

//or we can write same program using Wrapper class Given Below... 


  
 /* import java.util.Scanner;

 class Assignment1
  {

       public static void main(String args[])
       {
	    //Scanner sc=new Scanner(System.in);
	    System.out.println("Input a Decimal Number: " +sc.nextInt());
            System.out.println(Integer.toBinaryString(5));

       }
  }*/

//*****************************************************************************************************************************************


/*
20. Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output
Hexadecimal number is : F */

 import java.util.Scanner;
 class Assignment1
 {
      public static void main(String args[])
      {
        int dec_num, rem;
        String hexdec_num="";
        
        // hexadecimal number digits 
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        dec_num = in.nextInt();
		
        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");         
    }
}


 /*class Assignment1
  {

       public static void main(String args[])
       {
            System.out.println(Integer.toHexString(15));//The Integer.toHexString()
         // method converts decimal to hexadecimal.

       }

  }*/

//*****************************************************************************************************************************************



 /*21. Write a Java program to convert a decimal number to octal number.
  Input Data:
  Input a Decimal Number: 15
  Expected Output
  Octal number is: 17*/

  /*class Assignment1
  {
 
       public static void main(String args[])
       {
            System.out.println(Integer.toOctString(15));//The Integer.toHexString()
         // method converts decimal to hexadecimal.

       }

  }*/





/*22. Write a Java program to convert a binary number to decimal number.
 Input Data:
 Input a binary number: 100
 Expected Output
 Decimal Number: 4 */
  
 /*
    class Assignment1
   {
         public static void main(String args[])
	 {
		
		int BinToDec=Integer.parseInt("100",2);
		System.out.println("Decimal Number :  " +BinToDec);
               
         }
   }
*/
 



/*23. Write a Java program to convert a binary number to hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output
HexaDecimal value: D*/
	
  /* import java.util.Scanner;
     class Assignment1 
    {
       public static void main(String[] args) 
       {
           int[] hex = new int[1000];
  	   int i = 1, j = 0, rem, dec = 0, bin;
  	   Scanner in = new Scanner(System.in);
  	   System.out.print("Input a Binary Number: ");
           bin = in.nextInt();
           while (bin > 0) 
           {
   		rem = bin % 2;
   		dec = dec + rem * i;
   		i = i * 2;
   		bin = bin / 10;
  	   }
   	   i = 0;
  	   while (dec != 0) 
		{
   			hex[i] = dec % 16;
   			dec = dec / 16;
   			i++;
  		}
 		 System.out.print("HexaDecimal value: ");
  		for (j = i - 1; j >= 0; j--)
  		{
   			if (hex[j] > 9) 
   			{
    				System.out.print((char)(hex[j] + 55)+"\n");
   			} 
			else
   			{

    				System.out.print(hex[j]+"\n");
   			}
  		}
 	}
    } */

//*****************************************************************************************************************************************



 /*24. Write a Java program to convert a binary number to a Octal number.
Input Data:
Input a Binary Number: 111
Expected Output
Octal number: 7*/
 
 /*import java.util.Scanner;
 class Assignment1 
 {
    public static void main(String[] args) 
    {
        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
	System.out.print("Input a Binary Number : ");
        binnum = scan.nextInt();
        binnum1=binnum;
     
      while(binnum > 0)
        {
            rem = binnum % 10;
            decnum = decnum + rem*i;
            //System.out.println(rem);
            i = i*2;
            binnum = binnum/10;
        }   

		i=1;
        quot = decnum;
		
        while(quot > 0)
        {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Octal Number is  " +binnum1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
        System.out.print("\n");
 
      }
 }*/


//or we can write same program using Wrapper class Given Below...********* 



 /* class Assignment1
  {
 
       public static void main(String args[])
       {
            System.out.println(String.toOctString(111));//The Integer.toHexString()
         // method converts decimal to hexadecimal.

       }

  }
*/


//*****************************************************************************************************************************************




/*25. Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output
Equivalent decimal number: 8*/




 
 /* import java.util.Scanner;
   class Assignment1
  {
 
    public static void main(String[] args) 
     {
     Scanner in = new Scanner(System.in);
     long octal_num, decimal_num = 0;
     int i = 0;
     System.out.print("Input any octal number: ");
     octal_num = in.nextLong();
     while (octal_num != 0) 
     {
      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
      octal_num = octal_num / 10;
     }
    System.out.print("Equivalent decimal number: " + decimal_num+"\n");
   }
}*/







        
 			





















 







 
 
         




































































































































































































