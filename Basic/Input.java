// Taking a input from user
import java.util.Scanner;
public class Input {
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("enter the value of A: ");
 int a= sc.nextInt();
 System.out.print("enter the value of B: ");
 int b = sc.nextInt();
 int c = a+b;
 System.out.print("sum: "+c);
}
}
