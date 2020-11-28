Q1.Array

package DSA1;
import java.util.*;
class AArray{
   Scanner sc=new Scanner(System.in);
int size;
int arr[];
AArray(){}
AArray(int size){
    
this.size=size;
arr=new int[size];
}
void addElement()
{
    for(int i=0;i<size;i++)
    {
    int x=sc.nextInt();
    arr[i]=x;
    }


}
void display(int size)
{
for(int x=0;x<size;x++)
{
System.out.println(arr[x]);
}

}
int delete(int x)
{ int i;
/*for( i=0;i<size-1;i++)
{
   
   if(x==i)
   {
   
   break;
   }
        
       
    }*/
for(int j=x-1;j<size-1;j++)
{
arr[j]=arr[j+1];

}
size--;
System.out.println(size);
return size--;
  
}


public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of array");
 int a=sc.nextInt();
 AArray Arr=new AArray(a);   
 System.out.println("Add elements");
Arr.addElement();
System.out.println("display elements");
Arr.display(a);
System.out.println("enter index/position that you want to delete");
int x=sc.nextInt();
int b=Arr.delete(x);
System.out.println("after deletion display array elements");
Arr.display(b);

}

}
*******************************************************************************************
stack operations

package DSA1;
import java.util.*;
class StackOperation{
    int top;
    int stack[];
    int size;
    StackOperation()
    {
    
    }
    public  StackOperation(int size)
    {
    top=-1;
    this.size=size;
   stack=new int[this.size];
    
    }
    boolean isEmpty()
    {
    return top==-1;
    
    }
 boolean isFull()
    {
    return (top>=size-1);
    
    }
 public void push(int x)
 {
 if(isFull())
 {
 System.out.println("Stack is overflow");

 }
 else
 {
stack[++top]=x;
 System.out.println("Element push successfully");
  
 }

 }
public void pop()
{
if(isEmpty())
 {
 System.out.println("Stack is underflow");
 
 }
 else
 {
top--;
 System.out.println("Element pop successfully");
 }
}
public void peek()
{
if(isEmpty())
 {
 System.out.println("Stack is underflow");
 
 }
 else
 {
System.out.println(stack[top]);
 
 }

}
public void display()
{
    if(isEmpty())
 {
 System.out.println("Stack is underflow");
 
 }
    else{
       
for(int i=top;i>=0;i--)
{
System.out.println(stack[i]+" ");
}
}

}
 }
class DemoStack{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of stack");
    int size=sc.nextInt();
StackOperation st=new StackOperation(size);
int ch;
do{
    System.out.println("Enter Your choice \n1.Push\n2.Pop\n3.display\n4.show top element");
    ch=sc.nextInt();
    switch(ch)
    {
        case 1:       System.out.println("Enter elements of stack");
                 for(int i=0;i<size;i++)
                    {
                       int x=sc.nextInt();
                      st.push(x);
                      
                      
                    }
                    break;
     
       case 2:
         
            st.pop();
            break;
         
 
   case 3:
           
       System.out.println("Display Stack  element");
         st.display();
          break;
    
   case 4:
       st.peek();
       break;
  }
}while(ch!=5);
}
}


******************************************************************************************
Linear Queue

package DSA1;
import java.util.*;

class LinearQue{
int front,rear;
int que[];
int size;
public LinearQue(int size)
{
front=rear=-1;
this.size=size;
que=new int [size];
}
public boolean isEmpty()
{
return front==rear;
}
public boolean isFull()
{
return rear>=size-1;
}
public void insertq(int x)
{
if(isFull())
{
    System.out.println("Queue is full");
}
else
{
que[++rear]=x;
}

}
public void deleteq()
{
    if(isEmpty())
{
    System.out.println("Queue is empty");
}
else
{
front=front+1;
}
}
public void status()
{
System.out.println("Front "+front);
System.out.println("Rear "+rear);


}
public void display()
{
    if(isEmpty())
{
    System.out.println("Queue is empty");
}
else
{
for(int i=front+1;i<=rear;i++)
{
System.out.print(que[i]+" ");
}
}

}
public void peek()
{
if(isEmpty())
{
    System.out.println("Queue is empty");
}
else
{
 System.out.println("Rear element "+que[rear]);
}

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
LinearQue que=new LinearQue(size);
char ch;
do{
    System.out.println("Enter Your choice \n1.add\n2.delete\n3.display\n4.show top element");
    int ch1=sc.nextInt();
    switch(ch1)
    {
        case 1:       System.out.println("Enter elements of queue");
                        for(int i=0;i<size;i++)
                        {
                     int x=sc.nextInt();
                     que.insertq(x);
                        }
                        que.status();
                      break;
                      
                    
                    
     
       case 2:
         
            que.deleteq();
             que.status();
            break;
          case 3:
           
       System.out.println("Display Stack QUEUE");
         que.display();
         System.out.println();
          break;
    
   case 4:
     que.peek();
     
       break;
  }
    System.out.println("Do you want to continue\n1Y\n2N");
    ch=sc.next().charAt(0);
}while(ch=='y'||ch=='Y');
}
}

******************************************************************************************
Doubly Linked list OPerations

package DSA1;
import java.util.*;
class DoublyOperation{
static class Node{

Node next;
Node prev;
int data;
Node(int data)
{
this.data=data;
this.next=null;
this.prev=null;
}
}
Node head;
int length;
DoublyOperation()
{
this.head=null;
this.length=0;
}
public void biggInsert(int data)
{ 
    Node newNode=new Node(data);
if(head==null)
{
head=newNode;

}
else
{

head.prev=newNode;
newNode.next=head;
head=newNode;
}
length++;
}
public void endInsert(int data)
{
    Node newNode=new Node(data);
    Node temp=head;
if(head==null)
{
head=newNode;

}
else
{
while(temp.next!=null)
{
temp=temp.next;
}
newNode.prev=temp;
temp.next=newNode;
newNode.next=null;


}
length++;

}
public void posInsert(int x,int data)
{
     Node newNode=new Node(data);
if(x==1)
{
biggInsert( data);

}
else

if(x>length)
    {
    
    endInsert(data);
    }
 

else
{
    Node temp=head;
int i=1;
while(temp.next!=null)
{

i++;
if(i==x)
{
break;
}

temp=temp.next;

}
newNode.prev=temp;
newNode.next=temp.next;
temp.next.prev=newNode;
temp.next=newNode;

}
length++;
}
public void bigDelete()
{

if(head==null)
{
System.out.println("List is empty");

}
if(head.next==null&&head.prev==null)
{

head=null;

}
else
{
head=head.next;
head.prev.next=null;
head.prev=null;
}
length--;
}
public void endDelete()
{
Node temp=head;
if(head==null)
{
System.out.println("List is empty");

}
else {

while(temp.next.next!=null)
{
temp=temp.next;

}
temp.next.prev=null;
temp.next=null;

length--;
}
}
public void posDelete(int x)
{
    Node temp=head;
if(head==null)
{
System.out.println("List is empty");

}
if(x==1)
{
bigDelete();
}
else if(x>length){

endDelete();

}
else {
    int i=1;
   while(temp.next!=null)
   {
       i++;
   if(i==x)
   {
   break;
   
   }
   else{
   temp=temp.next;
   }
   }
   temp.next.next.prev=temp.next.prev;
   
   temp.next=temp.next.next;
   

   
   
   length--;
}
    }
public void fDisplay()
{
Node temp=head;

 if(head==null)
{
System.out.println("list is empty");

}

else{
    
while(temp.next!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
System.out.println(temp.data);
}
/*if(temp.next==null)
{
System.out.println(temp.data);
}*/

}
public void bDisplay()
{
Node temp=head;
if(head==null)
{
System.out.println("list is empty");

}

else {
   
while(temp.next!=null)
{
temp=temp.next;
}
while(temp.prev!=null)
{
System.out.print(temp.data+" ");
temp=temp.prev;

}
System.out.print(temp.data+" ");
}


}
}
class DemoDoubly{

public static void main(String args[])
{
DoublyOperation dL= new DoublyOperation();

int ch=0;
do{
 System.out.println("Enter Your choice \n1.add\n2.delete\n3.display");
Scanner sc=new Scanner(System.in);
 ch=sc.nextInt();
 switch(ch)
 {
     case 1:
     {
         System.out.println("Enter Your choice \n1.add at begnning\n2.Middle\n3.last");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                  System.out.println("Enter node data");
                  int data=sc.nextInt();
                  dL.biggInsert(data);
                  System.out.println("add Successfully");
                  break;
              case 2:
                   System.out.println("Enter node data");
                  int data1=sc.nextInt();
                  System.out.println("Enter location");
                  int x=sc.nextInt();
                  dL.posInsert(x, data1);
                    System.out.println("add Successfully");
                  break;
              case 3:
                   System.out.println("Enter node data");
                  int data2=sc.nextInt();
                  dL.endInsert(data2);
                    System.out.println("add Successfully");
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
                 
                
     
       case 2:
     {
         System.out.println("Enter Your choice \n1.delete at begnning\n2.Middle\n3.last");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                   dL.bigDelete();
                    System.out.println("Deleted Successfully");
                  
                  break;
              case 2:
                   System.out.println("Enter node index");
                  int data2=sc.nextInt();
                  dL.posDelete(data2);
                  System.out.println("Deleted Successfully");
                  break;
              case 3:
                 dL.endDelete();
                 System.out.println("Deleted Successfully");
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
        
 
 case 3:
     System.out.println("Display in forward direction");
      dL.fDisplay();
      System.out.println();
         System.out.println("Display in backward direction");
      dL.bDisplay();
      break;
           
     
    
           
     
      default:
          
         System.out.println("Enter valid choice");
       
   }

}while(ch!=4);
     }

}
******************************************************************************************
Linked list operation

package DSA;
import java.util.*;
class LinkedList
{
        Node head;

static class Node{
int data;
Node next;
public Node(int data)
{
this.data=data;

next=null;
}
}
boolean isEmpty()
{
return head==null;
}
void display()  
     {  
         Node ptr = head;  
 while (ptr != null)  
         {  
 System.out.println(ptr.data);  
             ptr = ptr.next;  
         }  
     }
void midInsert(int pos,int data)
{
Node temp=head;   
Node four2  = new Node(data);  
for(int i=0;i<pos-2;i++)
{
temp=temp.next;
}
four2.next=temp.next;
temp.next=four2;
}
void bigInsert(int data)
{
Node temp=head; 
Node first2 = new Node(data);  
first2.next=head;
head=first2;

}
void lastInsert(int data)
{
   Node temp=head; 
   Node last  = new Node(data);
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=last;
last.next=null;
}
void bigDelete()
{
    if(isEmpty())
    {
   System.out.println("List is empty");
    }
    else{
head=head.next;
    }
}
void lastDelete()
{
    if(isEmpty())
    {
   System.out.println("List is empty");
    }
    else{
Node temp=head; 
while(temp.next.next!=null)
{
temp=temp.next;
}
temp.next=null;
}
}
void midDelete(int pos)
{
if(isEmpty())
    {
   System.out.println("List is empty");
    }
else{
Node temp=head;
for(int i=1;i<pos-1;i++)
{
temp=temp.next;
}
Node temp2=temp.next;
temp.next=temp2.next;
temp2.next=null;

}
}
public static void main(String[] args)  
     {  
        
 LinkedList list = new LinkedList();  
  
 list.head   = new Node(10);  
         Node second = new Node(20);  
         Node third  = new Node(30); 
         Node four  = new Node(40);  
         Node five  = new Node(50);  
         Node six  = new Node(60);  
  
list.head.next = second;   
second.next = third; 
third.next=four; 
four.next=five;
five.next=six;

int ch=0;
do{
 System.out.println("Enter Your choice \n1.add\n2.delete\n3.display");
Scanner sc=new Scanner(System.in);
 ch=sc.nextInt();
 switch(ch)
 {
     case 1:
     {
         System.out.println("Enter Your choice \n1.add at begnning\n2.Middle\n3.last");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                  System.out.println("Enter node data");
                  int data=sc.nextInt();
                  list.bigInsert(data);
                  System.out.println("add Successfully");
                  break;
              case 2:
                   System.out.println("Enter node data");
                  int data1=sc.nextInt();
                  System.out.println("Enter location");
                  int x=sc.nextInt();
                  list.midInsert(x, data1);
                    System.out.println("add Successfully");
                  break;
              case 3:
                   System.out.println("Enter node data");
                  int data2=sc.nextInt();
                  list.lastInsert(data2);
                    System.out.println("add Successfully");
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
                 
                
     
       case 2:
     {
         System.out.println("Enter Your choice \n1.delete at begnning\n2.Middle\n3.last");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                   list.bigDelete();
                    System.out.println("Deleted Successfully");
                  
                  break;
              case 2:
                   System.out.println("Enter node index");
                  int data2=sc.nextInt();
                  list.midDelete(data2);
                  System.out.println("Deleted Successfully");
                  break;
              case 3:
                 list.lastDelete();
                 System.out.println("Deleted Successfully");
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
        
 
 case 3:
      list.display();
      break;
           default:
          
         System.out.println("Enter valid choice");
       
      }

}while(ch!=4);
     }
}
******************************************************************************************
circular doubly liked list delete operations
package DSA1;
import java.util.*;
class CircularDoublyLinked{
Node head;
int length=0;
boolean isEmpty()
{
return head==null;
}
public void bigDelete()
{
    Node temp=head;
if(isEmpty())
{
System.out.println("List is empty");
}
if(length==1)
{
head.next=null;
head=null;

}
else{
    while(temp.next!=head)
    {
    temp=temp.next;
    }
    temp.next=temp.next.next;
    head.next=head;
}


}

public void posDelete(int pos)
{
Node temp=head;
int i=1;
while(temp.next!=head)
{
i++;
if(i==pos)
{
break;
}
temp=temp.next;

}
temp.next=temp.next.next;
temp.next.next=null;
length--;
}
public void endDelete()
{
    Node temp=head;
if(length==1)
{
head.next=null;
head=null;
}
else
    while(temp.next.next!=head){
    
    temp=temp.next;
     }
temp.next.next=null;
temp.next= head;


}

}
******************************************************************************************
Circular Queue operations
package DSA1;
import java.util.*;
class CircularQue{
int front,rear;
int que[];
int size;
int length=0;
public CircularQue(int size)
{
front=rear=-1;
this.size=size;
que=new int [size];
}
public boolean isEmpty()
{
if(front==rear||front>=0||length==0) 
{
return true;
}
else
{
return false;
}
}
public boolean isFull()
{
if((front==0&&rear==size-1)||(rear==front-1))
{
return true;
}
else return false;
}
public void status()
{
System.out.println("Front "+front);
System.out.println("Rear "+rear);
System.out.println("length "+length);
}
public void addQue(int x)
{
/*if(isFull())
{
    System.out.println("Queue is full");
}*/
    if(length==size)
    {
        System.out.println("Queue is full");
    }
    else if(rear==front&&length==0)
{
rear=-1;
front=-1;
que[++rear]=x;
length++;

}
else if(front>=0&&rear==size-1)
{
    rear=-1;
que[++rear]=x;
length++;
}


else{
que[++rear]=x;
length++;
}
}
public void delQue()
{
/*if(isEmpty())
{
    System.out.println("Queue is empty");
}*/
    if(length==0)
    {
         System.out.println("Queue is empty");
    }
    else if(front==size-1)
       {
front=-1;
front++;
length--;
       }
else{
      front++;
      length--;
        
        }
}

public void display()
{
    if(length==0)
{
    System.out.println("Queue is empty");
}
    else if(front>0&&rear==0)
    {
        for(int i=front+1;i<=rear;i++)
        {
    System.out.print(que[i]+" ");
        }
    
    }
    else if(front==rear&&length!=0)
    {
        for(int i=front;i>=rear;i++)
        {
    System.out.print(que[i]+" ");
        }
    
    }
    else {
    for(int i=front+1;i<=rear;i++)
{
System.out.print(que[i]+" ");
}
 }
    
    

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
CircularQue que=new CircularQue(size);
int ch;
do{
    System.out.println("Enter Your choice \n1.add\n2.delete\n3.display");
     ch=sc.nextInt();
    switch(ch)
    {
        case 1:       System.out.println("Enter elements of queue");
                        for(int i=0;i<size;i++)
                        {
                     int x=sc.nextInt();
                     que.addQue(x);
                        }
                        que.status();
                      break;
                      
                    
                    
     
       case 2:
         
            que.delQue();
             que.status();
            break;
          case 3:
           
       System.out.println("Display Stack QUEUE");
         que.display();
         System.out.println();
          break;
    
   
  }
   
}while(ch!=4);
}
}


******************************************************************************************
circular linkedList
package DSA1;
import java.util.*;
class Node{
Node next;
int data;
Node(int data)
{
this.data=data;
next=null;

}

}
class CircularLinkedList{
Node head;
int length;
public CircularLinkedList()
{
this.head=null;
this.length=0;

}
boolean isEmpty()
{
return head==null;
}
public void biggInsert(int data)
{
Node newNode=new Node(data);

if(head==null)
{
head=newNode;
head.next=head;
}
else
{
    newNode.next=head;
    head.next=newNode;
 
head=newNode;
}
length++;
}
public void midInsert(int pos,int data)
{
    Node temp=head;
Node newNode=new Node(data);
for(int i=0;i<pos-2;i++)
{
temp=temp.next;
}
newNode.next=temp.next;
temp.next=newNode;
length++;
}
public void lastInsert(int data)
{ Node temp=head;
    Node newNode=new Node(data);
if(head==null)
{
head=newNode;
}
else
{
while(temp.next!=head)
{
temp=temp.next;

}
newNode.next=temp.next;
temp.next=newNode;
}
length++;
}
public void bigDelete()
{
    Node temp=head;
if(isEmpty())
{
System.out.println("List is empty");
}
else if(length==1)
{
head.next=null;
head=null;
}
else{
    while(temp.next!=head)
    {
    temp=temp.next;
    }
    temp.next=head.next;
        head=head.next;
    

}
length--;
}
public void endDelete()
{
    Node temp=head;
    if(isEmpty())
{
System.out.println("List is empty");
}
    else if(length==1)
{
head.next=null;
head=null;
System.out.println("Deleted Successfully");
}
    else{
    while(temp.next.next!=head){
    
    temp=temp.next;

    }
    temp.next= head;
temp.next.next=null;

System.out.println("Deleted Successfully");
length--;
}
}

public void posDelete(int pos)
{
    
Node temp=head;
if(head==null)
{
System.out.println("List is empty");

}
else if(pos==1)
{
bigDelete();
}
else if(pos>length){

endDelete();

}
else {

int i=1;
while(temp.next!=head)
{
i++;
if(i==pos)
{
break;
}
temp=temp.next;
}
temp.next=temp.next.next;

length--;
}
}

public void display()
{
 Node temp=head;
 if(isEmpty())
{
System.out.println("List is empty");
}
 else{
while(temp.next!=head)
{
System.out.println(temp.data);
temp=temp.next;
}
System.out.println(temp.data);

}
}
}
class Cdemo{
public static void main(String args[])
{
CircularLinkedList Cl=new CircularLinkedList();
    int ch=0;
do{
 System.out.println("Enter Your choice \n1.add\n2.delete\n3.display");
Scanner sc=new Scanner(System.in);
 ch=sc.nextInt();
 switch(ch)
 {
     case 1:
     {
         System.out.println("Enter Your choice \n1.add at begnning\n2.Middle\n3.last");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                  System.out.println("Enter node data");
                  int data=sc.nextInt();
                 Cl.biggInsert(data);
                  System.out.println("add Successfully");
                  break;
              case 2:
                   System.out.println("Enter node data");
                  int data1=sc.nextInt();
                  System.out.println("Enter location");
                  int x=sc.nextInt();
                  Cl.midInsert(x, data1);
                    System.out.println("add Successfully");
                  break;
              case 3:
                   System.out.println("Enter node data");
                  int data2=sc.nextInt();
                  Cl.lastInsert(data2);
                    System.out.println("add Successfully");
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
                 
                
     
       case 2:
     {
         System.out.println("Enter Your choice \n1.delete at begnning\n2.Middle\n3.last");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                   Cl.bigDelete();;
                    System.out.println("Deleted Successfully");
                  
                  break;
              case 2:
                   System.out.println("Enter node index");
                  int data2=sc.nextInt();
                  Cl.posDelete(data2);
                  System.out.println("Deleted Successfully");
                  break;
              case 3:
                 Cl.endDelete();
                 
                  break;
               default:
          
         System.out.println("Enter valid choice");
                  
          }
              break;
        
     }           
        
 
 case 3:
     Cl.display();
      break;
           
     
    
           
     
      default:
          
         System.out.println("Enter valid choice");
       
 }

}while(ch!=4);

}


}



























