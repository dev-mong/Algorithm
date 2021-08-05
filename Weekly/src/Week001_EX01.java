package Weekly;

/*
    << 위클리 챌린지 >>
    날짜 :20210802 ~ 20210808 1주차 
    부족한 금액 계산하기 
*/

public class Week001_EX01 {
    
    public static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for(int i=1;i<=count ;i++) {
            sum += price*i;
        }
        
        answer = money - sum;
        if(answer < 0){
            answer = Math.abs(answer);
        } else if(answer >= 0){
            answer = 0;
        }

        return answer;
    }
    
    public static void main(String[] args) {
        
        int price = 3;
        int money = 30;
        int count = 4;
        
        long result = solution(price, money, count);
        
        System.out.print("부족한 금액 : "+result);
    }
}
