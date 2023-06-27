package fundamentos;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int a = sc.nextInt();
		System.out.println("Digite um numero");
		int b = sc.nextInt();
		System.out.println("Digite um numero");
		int c = sc.nextInt();

		System.out.println(b > c ? c > a ? c + "e o maior numero" : a + " e o maior numero" : "");
	
	}

}
