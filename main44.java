import java.util.Scanner;
class main44 {
public static void main(String[] args){
Scanner s= new Scanner(System.in);
int i;
System.out.println("Enter A Number:");
i=s.nextInt();
if(i==0){
System.out.println("Number is Zero");
}
else if(i%2==0){
System.out.println("Number Is Even");
}
else{
System.out.println("Number is odd");
}
}
}
