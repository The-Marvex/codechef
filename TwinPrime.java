import java.util.*;

class Twinn
{
public static boolean prime(int n)
{
int a,b=0;
for(a=1;a<=n;a++)
{
if(n%a==0)
b++;
}
if(b==2)
return true;
else
return false;
}
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    int y1 = 0,y2 = 0;
    int n =in.nextInt();

int a,b,c;
if(prime(n)&&prime(n+2)){
y1 = n;
y2 = n+2;
}
else if(prime(n-1)&&prime(n+1)){
y1 = n-1;
y2 = n+1;
}
else
{
for(c=1;;c++)
{
a=n-c;
b=n+c;
if(prime(a)&&prime(a+2))
{
y1 = a;
y2 = a+2;
break;
}
if(prime(b)&&prime(b+2))
{
y1 = b;
y2 = b+2;
break;
}
}
}
int avg = (y1+y2)/2;
if(n==avg)
    System.out.println("1");
else
    System.out.println(avg);
}}
