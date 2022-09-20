public class numberspace {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(10000000, 1000);
    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++) {
            //여기서 애 먹었다..
            //윤성우 자바 책 p.66을 보면, "왼편에 있는 변수의 자료형에 상관없이 정수는 int형으로 표현하기로 약속되어 있다"
            //즉, 컴파일러가 알아서 이를 long형으로 인식해주지 않는다.
            //따라서 명시적 형 변환 혹은 수자 뒤에 L 혹은 l을 붙여준다.
            //헤맸던 이유 : 명시적 형 변환 부재
            answer[i] = (long)x*(i+1);

        }









        return answer;
    }
}



