package Day02;

//예제 14
//위쪽과 왼쪽 덧셈을 출력하는 덧셈표 

public class Ex2 {

	public static void main(String[] args) {
		
		System.out.print("  | ");
		for(int k=1;k<=9;k++) {
			System.out.print(k+"  ");
		}
		
		System.out.println("\n--+----------------------------");
		
		int result = 0;
		
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
