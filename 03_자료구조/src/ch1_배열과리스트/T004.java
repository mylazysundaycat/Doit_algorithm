package ch1_배열과리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T004 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//n*n크기인 2차배열 받기
		int[][] A = new int[n][n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//n*n크기의 2차 합배열 S 받기	
		int[][] S = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				S[i][j] = S[i][j-1]+A[i-1][j-1];
			}
		}
		
		
		//두 개의 좌표값을 받아서 합을 구하기
		for(int i=1; i<=m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int sol = 0;
			sol = (S[x1][y2]-S[x1][y1]+A[x1-1][y1-1])+(S[x2][y2]-S[x2][y1]+A[x2-1][y1-1]);
			System.out.println(sol);
			//S[2][4]-S[2][2]+A[
		}
		
		
		/*
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				S[j+n*i] = S[j+n*i-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		
		
		for(int i=1; i<=m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int sol = 0;
			if(S[(x2-1)*n+y2]==S[(x1-1)*n+y1]) {
				sol= S[(x2-1)*n+y2]-S[(x1-1)*n+y1-1];
			}else if(x1==1&&y1==1&&x2==n*n&&y2==n*n){
				sol= S[n*n];
			}
			else{
				sol= S[(x2-1)*n+y2]-S[(x1-1)*n+y1];
			}

			System.out.println(sol);
		
		}
		*/
	}
}
