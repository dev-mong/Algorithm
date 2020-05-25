class Solution {
   public String solution(String s) {
     String answer = "";
          
          char[] charArr = s.toCharArray();
          int arrLength = charArr.length;
          char space = ' ';
          int wordNum = 1;
          for(int i =0; i<arrLength; i++) {
              if(charArr[i]==space) {
                  //공백일때처리
                  wordNum=1;
                  continue;
              }
              String temp = new String(charArr[i]+"");
              if(wordNum%2==0) {
                  //짝수 -> 대문자
                  temp = temp.toLowerCase();
                  charArr[i] = temp.charAt(0);
              }else {
                  //홀수 -> 소문자
                  temp = temp.toUpperCase();
                  charArr[i] = temp.charAt(0);
              }
              
              wordNum++;
          }
          answer = new String(charArr);
          return answer;
  }
}