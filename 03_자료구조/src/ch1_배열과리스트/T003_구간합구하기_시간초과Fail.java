package ch1_�迭������Ʈ;

import java.util.Scanner;

public class T003_�����ձ��ϱ�_�ð��ʰ�Fail {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		
		String[] arr1 = sc.nextLine().split(" ");
		String[] arr2 = sc.nextLine().split(" ");
		
		int n = Integer.parseInt(arr1[0]);
		int m = Integer.parseInt(arr1[1]);
		
		//2��°�� ���ڹ迭 ������
		int[] numArr = new int[n];
			
		//2��°�� ���ڹ迭 ���
		for(int i=0; i<n; i++) {
			numArr[i] = Integer.parseInt(arr2[i]);
		}
			
		//�չ迭
		int[] numArrSum = new int[n+1];
		
		//�չ迭 �����
		for(int i=1; i<n+1; i++) {
			numArrSum[i] = numArrSum[i-1]+numArr[i-1]; 
		}
		
		for(int i=0; i<m; i++) {
			String[] arr3 = sc.nextLine().split(" ");
			int p = Integer.parseInt(arr3[0]);
			int q = Integer.parseInt(arr3[1]);
			
			System.out.println(numArrSum[q]-numArrSum[p-1]);
			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		
	}
}
