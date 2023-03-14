package ch1_�迭������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class T002_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.valueOf(sc.nextLine());
		String score = sc.nextLine();
		String[] scoreArr = score.split(" ");
		int[] scoreArrSort = new int[n];
		
		for(int i=0; i<n; i++) {
			scoreArrSort[i] = Integer.parseInt(scoreArr[i]);
		}
		
		Arrays.sort(scoreArrSort);
		
		int sum = 0;
		float average = 0;
		float max = (float)scoreArrSort[n-1];
		
		for(int i=0; i<n; i++) {
			sum += scoreArrSort[i];
		}
		
		average = ((float)sum/max*100f)/(float)n;
		System.out.println(average);
		
		/*

			�̷��� �������� Scanner Ŭ������ nextLine()�޼ҵ�� �ٸ� �޼ҵ���� 
			�о���� ������ �ٸ��� �����Դϴ�. nextInt(), nextDouble() ��� ���� 
			�޼ҵ�� \n����(���๮��) �������� �о���� \n���� ��ü�� �о���� �����Ƿ� 
			������ ������� \n���� ���� �ֽ��ϴ�. 
			nextLine() �޼ҵ�� \n���ڱ����� �о���Ƿ� nextInt(), nextDouble() 
			��� ���� �޼ҵ� ���Ŀ� ����ϸ� ������ ������� �ٷ� \n���� ���̱� ������ 
			������ �߻��ϰ� �˴ϴ�. ���� nextLine() �޼ҵ带 ����ϱ� ���� 
			nextInt()���� �޼ҵ带 ����Ͽ��ٸ� nextLine() �޼ҵ带 ��������ν� 
			������ ����� ��ġ�� �������־�� �մϴ�.
		 
		 */
	}
}
