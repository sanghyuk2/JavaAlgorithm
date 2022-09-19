public class pickTheMiddle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("qwer");

    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        if(str.length % 2 == 0 && str.length >= 2) {
            System.out.println("This is the one that you should be");
            int idx = str.length / 2;
            answer += str[idx-1];
            answer += str[idx];

        }else if(str.length % 2 != 0 && str.length > 2) {
            int idx = str.length / 2;
            answer = str[idx];
        }

        if(str.length == 2)
            answer = str[1] + str[0];

        if(str.length == 1)
            answer = str[0];


        System.out.println(answer);

        return answer;
    }
}

//다른 사람 풀이
/*
class StringExercise{
    String getMiddle(String word){

        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
* */