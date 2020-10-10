package Day01;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		System.out.println("���� 7. >>>>>>>>>");

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.println("���ڸ� �Է��ϼ���.");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("������ ��" + sum);

		System.out.println("���� 8. >>>>>>>>>");

		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		int sum2 = 0;	
		
		sum2 = (1+num)*num/2;
		
		System.out.println("������ ��"+sum2);
		
		System.out.println("���� 9. >>>>>>>>>");
		int a  = 0;
		int b = 0;
		int sum3 = 0;
		
		sum3 = sumof(a,b);
		
		System.out.println("������ ��"+sum3);
		
	}
	
	static int sumof(int a, int b) {
		
		int sum3 = 0;
		
		return sum3;
	}

}
