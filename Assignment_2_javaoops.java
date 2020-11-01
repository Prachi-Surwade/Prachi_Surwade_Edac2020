
/*
import java.util.Scanner;
class Que1
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number : ");
   int num=sc.nextInt();
   
  for(int i=1;i<=10;i++)
   {
    System.out.println(num +"*"+ i + "=" + (num*i));
   }
 }
}
*/

/*
import java.util.Scanner;
class Que2
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int rev=0;
    //int num=45678,rev=0;
   
    System.out.println("number before reversed : "+num);
   
    while(num!=0)
    {
     int r=num%10;
     rev=(rev*10)+r;
     num=num/10;
    }
   
   System.out.println("number after reversed : "+rev);
   
   }
 }
*/

/*
import java.util.Scanner;
class Que3
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
    
  System.out.println("enter number to check prime or not : ");
   int num=sc.nextInt();
   //int flag=0;
  
   for(int i=2;i<=num/2;i++)                
  {
    if(num%i==0)
    {
      //flag=1; 
      System.out.println("Entered number is Not prime ");
      break; 
    }
   
 }
  
  if(flag==0)
   {
     System.out.println("Entered number is prime ");
   }
  else
  {
   System.out.println("Entered number is Not prime ");
  }
}
}
*/


/*
import java.util.Scanner;
class Que4
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no. of series");
  int num=sc.nextInt();
  int sum=0;
  for(int i=12;i<=num;i+=10)
  {
    System.out.println(i + " ");
    sum=sum+i;
  }
  System.out.println(sum);   
 
}
}
*/

/*
import java.util.Scanner;
class Que5
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter lowest number :  ");
  int a=sc.nextInt();
  System.out.println("Enter highest  number :  "); 
  int b=sc.nextInt();
 System.out.println(); 
  
  for(int j=a;j<=b;j++)
 {
    if(j==1 || j==0)
     continue;
  boolean flag=false;
  for(int i=2;i<=j/2;i++)
    {
     
      if(j%i==0)
       {
          flag=true;
          break;
       }
    }

   if(!flag)
     {
       System.out.println(j+" k ");
      }

  }
 
}
}
*/


/*
import java.util.Scanner;
class Que5
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter lowest number :  ");
  int a=sc.nextInt();
  System.out.println("Enter highest  number :  "); 
  int b=sc.nextInt();
 System.out.println(); 
  
  while(a<b)
   {
  boolean flag=false;
  for(int i=2;i<=a/2;i++)
    {
      if(a%i==0)
       {
          flag=true;
          break;
       }
    }

   if(!flag && a!=0 && a!=1)
     {
       System.out.println(a+" ");
      }
       a++;
  }
 
}
}
*/


/*
import java.util.Scanner;
class Que6
{

 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
   int sum=0;
   double avg=0.0;

  System.out.println("Enter no. of elements in array : ");

  int num=sc.nextInt();
  int a1[]=new int[num];

  System.out.println("Enter array elements : ");
  //Que6 q=new Que6();

    for(int i=0;i<a1.length;i++)
     {
       a1[i]=sc.nextInt();
     }
    System.out.println("array elements are : ");
    for(int i=0;i<a1.length;i++)
     {
       //System.out.println(a1[i]);
       sum=sum+a1[i];
     }

    System.out.println("Sum of array elements : "+sum);
   avg=(double)sum/num;
   System.out.println("Average of array elements are : "+avg);
}
}
*/




/*
import java.util.Scanner;
class Que7
{

 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of Array : ");
    int size=sc.nextInt();
   int[] a1=new int[size];
  System.out.println("Enter Array elements : ");
  for(int i=0;i<size;i++)
  {
   a1[i]=sc.nextInt();
  }

  System.out.println(" Array elements are: ");
  for(int i=0;i<size;i++)
  {
    System.out.println(a1[i]);
  }


   int temp;
  System.out.println(" Array elements in asceding order: ");
  for(int i=0;i<size;i++)
  {
    for(int j=i+1;j<size;j++)
     {
       if(a1[i]>a1[j]) //2>3
        {
         temp=a1[i];
         a1[i]=a1[j];
         a1[j]=temp;
        }
     }
  }

  for(int a : a1)
  {
    System.out.println(a);
  }

  System.out.println(" Array elements in descending order: ");
  for(int i=0;i<size;i++)
  {
    for(int j=i+1;j<size;j++)
     {
       if(a1[i]<a1[j]) 
        {
         temp=a1[i];
         a1[i]=a1[j];
         a1[j]=temp;
        }
     }
  }

  for(int a : a1)
  {
    System.out.println(a);
  }

 }
}
*/


/*
import java.util.Scanner;
class Que8
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of Array : ");
    int size=sc.nextInt();
   int[] a1=new int[size];
  System.out.println("Enter Array elements : ");
  for(int i=0;i<size;i++)
  {
   a1[i]=sc.nextInt();
  }

  System.out.println(" Array elements are: ");
  for(int i=0;i<size;i++)
  {
    System.out.println(a1[i]);
  }
 
  System.out.println(" Reverse the array: ");
  for(int i=size-1;i>=0;i--)
  {
    System.out.println(a1[i]);
  } 
  

 }
}

*/


/*
import java.util.Scanner;
class Que9
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of Array : ");
    int size=sc.nextInt();
   int[] a1=new int[size];
  System.out.println("Enter Array elements : ");
  for(int i=0;i<size;i++)
  {
   a1[i]=sc.nextInt();
  }

  System.out.println(" Array elements are: ");
  for(int i=0;i<size;i++)
  {
    System.out.println(a1[i]);
  }

  System.out.println("Enter element which u have to search : ");
  int search=sc.nextInt();
  int count=0;
  for(int i=0;i<size;i++)
  {
    if(a1[i]==search)
     {
      count++;
     } 
  }

 if(count!=0)
  {
   System.out.println("Number is present "+count+"  times");
  }

  else
  {
   System.out.println("Number is not present");
  }
 }
}
*/




/*
import java.util.Scanner;
class Que10
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of Array : ");
    int size=sc.nextInt();
   int[] a1=new int[size];
  System.out.println("Enter Array elements : ");
  for(int i=0;i<size;i++)
  {
   a1[i]=sc.nextInt();
  }
  int sumo=0,sume=0;
  System.out.println(" Array elements are: ");
  for(int i=0;i<size;i++)
  {
    System.out.println(a1[i]);
  }
  
  for(int i=0;i<size;i++)
  {
    if(a1[i]%2==0)
     {
       sume=sume+a1[i];
     }
     else
      {
        sumo=sumo+a1[i];
      }
  }
  
  System.out.println("Sum of even elements in an array : "+sume);
  System.out.println("Sum of odd elements in an array : "+sumo);
 
 }
}
*/



/*Que : Fibonacies series

import java.util.Scanner;
class Fibo
{
public static void main(String[] args)
{
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter no. of fibo number : ");
  int a=sc.nextInt();
  int num1=0,num2=1;
  
System.out.println(" fibo number series : ");
   int temp=0;
   for(int i=1;i<=a;i++)
   {
    System.out.print(num1+"  ");
    temp=num1+num2;
    num1=num2;
    num2=temp;
   }
 }
}

*/


