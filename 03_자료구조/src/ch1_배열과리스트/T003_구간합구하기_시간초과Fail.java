package ch1_�迭������Ʈ;

import java.util.Scanner;

public class T003_�����ձ��ϱ�_�ð��ʰ�Fail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr1 = sc.nextLine().split(" ");
		String[] arr2 = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(arr1[0]);
		int b = Integer.parseInt(arr1[1]);
		
		//2��°�� ���ڹ迭 ������
		int[] numArr = new int[a];
		
		for(int i=0; i<a; i++) {
			numArr[i] = Integer.parseInt(arr2[i]);
		}
		
		int[] sumArr = new int[b];
		
		int sum = 0;
		
		for(int i=0; i<b; i++) {
			String[] arr3 = sc.nextLine().split(" ");
			int p = Integer.parseInt(arr3[0])-1;
			int q = Integer.parseInt(arr3[1])-1;
			for(int j=p; j<=q; j++) {
				sumArr[i] += numArr[j];
			}
		}
		
		for(int i=0; i<b; i++) {
			System.out.println(sumArr[i]);
		}

		
	}
}
