package Day02;

import java.util.ArrayList;
import java.util.Scanner;

//인덱스 검색
//n 길이 배열 a
//key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞 부터 순서대로 저장


public class Ex11_indexSearch {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 길이 : ");
		int n = sc.nextInt();

		
		int[] arr = new int[n];
		int[] idx = null;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"번쨰 값을 입력하세요");
			arr[i] = sc.nextInt();			
		}
		
		System.out.println("\nKey 값을 입력하세요.");
		int key = sc.nextInt();
		
		int result = serchIdx(arr, n, key, idx);
		
		System.out.println("Key 값과 일치하는 값의 개수 : "+result);
		
	}
	
	static int serchIdx(int[] a,int n,int key, int[] idx) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		int result = 0;
		
		for(int j=0;j<a.length;j++) {
			
			if(a[j] == key) {
				list.add(j);
			}
		}
		
		idx = new int[list.size()];
			
		for(int k=0;k<idx.length;k++) {
			idx[k] = list.get(k);
		}
		
		result = idx.length;
		
		return result;
	}

}
