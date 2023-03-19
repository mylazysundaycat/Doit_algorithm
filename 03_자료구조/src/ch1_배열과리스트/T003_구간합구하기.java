package ch1_배열과리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T003_구간합구하기 {
	public static void main(String[] args) throws IOException {
		//메인스트림-보조스트림
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//StringTokenizer 열고 스트림을 통해 라인 받아주기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		long[] S = new long[suNo+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int q=0; q<quizNo; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(S[j]-S[i-1]);
		}
		

	}
}
