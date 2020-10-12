package Day03.Ex03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//이진 탐색 3

public class Ex03_binSearch3{
	
	public static void main(String[] args) {
		
		//키와, 시력에 대한 정보
		PhyscData[] pd = {
				new PhyscData("기서용",175,0.6),
				new PhyscData("손흥민",185,1.2),
				new PhyscData("홍길동",170,0.2),
				new PhyscData("박지성",178,0.5)
		};

		
		System.out.println("검색 할 시력을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		double eye = sc.nextDouble();
		
		//binarySearch를 사용하기 위해 내림차순으로 정렬
		Arrays.sort(pd, new eyeComparator()); // 
		
		System.out.println(Arrays.toString(pd));

		int idx = Arrays.binarySearch(pd, new PhyscData(" ",0,eye), new eyeComparator());

		System.out.println(idx);
	}

}	

//시력 별로 정렬하기 위해 - 특정 범위를 설정함으로 Comparator 클래스 생성
class eyeComparator implements Comparator<PhyscData>{

	@Override
	public int compare(PhyscData o1, PhyscData o2) {
		PhyscData pd1=(PhyscData) o1;
		PhyscData pd2=(PhyscData) o2;
		
		return (pd1.eye > pd2.eye ? -1 : (pd1.eye < pd2.eye) ? 1 : 0); //삼항연산자는 뺄셈보다 속도가 빨라 효율적
	}
}
