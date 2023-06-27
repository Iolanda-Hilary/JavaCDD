package fundamentos;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int a = sc.nextInt();

	
		System.out.println(a < 0 ? "negativo" : "positivo");
		
	}

}
