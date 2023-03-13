package ch1_배열과리스트;

import java.util.Arrays;
import java.util.Scanner;

public class T002 {
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
	}
}
