import java.util.Scanner;
class even
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int s=1;
int e=10;
System.out.println("enter a no");
do
{
if (s%2==0)
System.out.println(s);
s++;
}
while(s<=e);
}
}