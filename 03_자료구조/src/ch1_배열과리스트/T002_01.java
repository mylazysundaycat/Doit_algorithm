package ch1_배열과리스트;

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

			이러한 문제점은 Scanner 클래스의 nextLine()메소드와 다른 메소드들이 
			읽어오는 범위가 다르기 때문입니다. nextInt(), nextDouble() 등과 같은 
			메소드는 \n문자(개행문자) 전까지를 읽어오고 \n문자 자체는 읽어오지 않으므로 
			버퍼의 출발점이 \n문자 전에 있습니다. 
			nextLine() 메소드는 \n문자까지만 읽어오므로 nextInt(), nextDouble() 
			등과 같은 메소드 이후에 사용하면 버퍼의 출발점이 바로 \n문자 전이기 때문에 
			에러가 발생하게 됩니다. 따라서 nextLine() 메소드를 사용하기 전에 
			nextInt()같은 메소드를 사용하였다면 nextLine() 메소드를 사용함으로써 
			버퍼의 출발점 위치를 변경해주어야 합니다.
		 
		 */
	}
}
