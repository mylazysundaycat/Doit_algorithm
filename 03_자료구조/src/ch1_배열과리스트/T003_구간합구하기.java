package ch1_�迭������Ʈ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T003_�����ձ��ϱ� {
	public static void main(String[] args) throws IOException {
		//���ν�Ʈ��-������Ʈ��
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//StringTokenizer ���� ��Ʈ���� ���� ���� �޾��ֱ�
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
