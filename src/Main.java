import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		char c[] = {'C','h','i','n','a'};
		//a=scanner.nextInt();
		int i =0;
		for(i=0;i<c.length;i++) {
			c[i]=(char) (c[i]+4);
		}
		System.out.print(c);
	}
	
	
}
