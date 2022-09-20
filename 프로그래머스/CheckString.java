//문자열 다루기 기본
public class CheckString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("1234");
    }
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        char[] ch = s.toCharArray();

        //문제에 문자열 s의 길이에 대한 제한을 무시하고 넘겨서 못풀었었다.
        if(ch.length == 4 || ch.length == 6) {

            for (int i = 0; i < ch.length; i++) {
                if (!Character.isDigit(ch[i])) {
                    answer = false;
                    break;
                }
            }
        }else {
            answer = false;
        }

        System.out.println(answer);

        return answer;
    }
}

//referece) https://blog.naver.com/PostView.naver?blogId=hoon4672&logNo=222204799623&parentCategoryNo=4&categoryNo=&viewDate=&isShowPopularPosts=true&from=search

//다른 사람 풀이 (regex)를 통해 풀었다.
/*
class Solution {
  public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
  }
}
 */