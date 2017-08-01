# reversenumber
import java.io.*;
import java.util.*;
public class reversenumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String a, b="";
int i,len;
System.out.println("Enter the string");
a=sc.nextLine();
len=a.ength();
for(i=len-1;i>=0;i--){
b=b+a.charAt(i);
}
System.out.println("Reverse the string:" +b);
}
}
