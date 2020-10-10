package Day02;

//예제2 
//배열 요소 역순으로 출력
// 예제 4
//배열의 모든 요소를 배열 a에 복사하는 메소드
//예제 5
//b 배열의 요소를 a에 역순으로 복사 

public class Ex06_array {

	public static void main(String[] args) {
		
		int[] arr= {5,10,73,2,-5,42};

		int[] b = {1,2,3,4}; //원본 배열
		int[] a = new int[b.length]; //복사 할 배열
		
		System.out.println("역순으로 출력");
		reserve(arr);
		
		System.out.println("\n\na의 모든 요소의 합계");
		sumOf(a);
		
		System.out.println("배열 b의 모든 요소를 배열 a에 복사 ");
		copy(a, b);
		
		System.out.println("\n배열 b의 모든 요소를 배열 a에 역순으로 복사");
		rcopy(a,b);
	}
	
	static void result(int[] arr) {
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
	
	//역순으로 출력
	static void reserve(int[] arr) {
		
		int temp;
		for(int i=0;i<(arr.length)/2;i++) {
			int j=arr.length-1-i;
			
			System.out.println("arr[" + i + "]와 arr[" + (arr.length - i - 1) + "]를 교환합니다.");
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			result(arr);
		}
		System.out.println("배열 역순 정렬을 마쳤습니다.");
	}
	
	//배열의 합계
	static void sumOf(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println("a의 합계 :"+ sum+"\n");
	}
	
	
	//a의 배열을 b배열에 복사 
	static void copy(int[] a,int[] b) {
		
//		for(int i=0;i<a.length;i++) {
//			b[i] = a[i];
//			System.out.print("원본 배열 : "+ a[i]);
//			System.out.print(" 복사한  배열 : "+ b[i]);
//			System.out.println();
//		}
		
		//System 클래스의 메소드를 이용하여 배열 복사
		System.arraycopy(b, 0, a, 0, a.length);
		for(int i=0;i<a.length;i++) {
		System.out.print("원본 배열 : "+ a[i]);
		System.out.print(" 복사한  배열 : "+ b[i]);
		System.out.println();
		}
	}
	
	static void rcopy(int[] a,int[] b) {
		int temp;
		
		for(int i=0;i<b.length;i++) {
			int j=b.length-1-i;
			temp=b[i];
			a[i]=b[j];
			b[j]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print("역순 배열 : "+ a[i]);
			System.out.println();
		}
		
	}
	
	
}
