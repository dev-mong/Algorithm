package Day02;

//예제 12,13
//위쪽과 왼쪽에 곱하는 수가 있는 덧셈, 곱셈표를 출력

public class Ex1_multiTable {

	public static void main(String[] args) {
		
		System.out.println("\n\t<<< 두 수의 곱셈표 >>>");
		System.out.print("  | ");
		for(int k=1;k<=9;k++) {
			System.out.print(k+"  ");
		}
		
		System.out.println("\n--+----------------------------");
		
		int result = 0;
		
		for(int i=1;i<=9;i++) {
			System.out.print(i+" |");
			for(int j=1;j<=9;j++) {
				result = i*j;
				System.out.printf("%3d",result);
			}
			System.out.println();
		}
		
		System.out.println("\n\t<<< 두 수의 덧셈표 >>>");
		
		System.out.print("  | ");
		for(int k=1;k<=9;k++) {
			System.out.print(k+"  ");
		}
		
		System.out.println("\n--+----------------------------");
		
		
		for(int i=1;i<=9;i++) {
			System.out.print(i+" |");
			for(int j=1;j<=9;j++) {
				result = i+j;
				System.out.printf("%3d",result);
			}
			System.out.println();
		}
		
	}

}
