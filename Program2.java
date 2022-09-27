import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("enter the input");
int n =scan.nextInt();
int m=1;
for(int i=1;i<=n;i++) {
	System.out.println(m+"  ");
	m=m+2;
}
	}

}
