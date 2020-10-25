package ex17_matrixSum;

public class Solution1 {

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		int sum =0;
		
		for(int i=0;i<arr1.length;i++) {

			for(int j=0;j<arr1[i].length;j++) {
				
				System.out.print(arr1[i][j]);
				System.out.print(arr2[i][j]);
				sum = arr1[i][j] + arr2[i][j];
				
				System.out.println("행"+i+"열"+j);
				System.out.println(sum);
				
				answer[i][j] = sum;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		solution(arr1, arr2);
		
		
		
	}

}
