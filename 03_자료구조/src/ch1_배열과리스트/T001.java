package ch1_배열과리스트;

import java.util.Scanner;

public class T001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		char[] charArr = b.toCharArray();
		long sum = 0;
		
		for(int i=0; i<a; i++) {
			sum += charArr[i]-'0';
		}
		
		System.out.println(sum);

	}
}
