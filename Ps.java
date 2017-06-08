import java.io.*;
import java.util.*;
class Ps
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n>0)
{
System.out.println("positive");
}
else if(n==0)
{
System.out.println("Zero");
}
else
System.out.println("Negative");
}
}
