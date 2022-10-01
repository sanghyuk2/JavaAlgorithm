public class StringtoInt {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("1234"));
    }
}

class Solution {
    public int solution(String s) {
        int answer;
        String num = "";

        String[] list = s.split("");

        if(list[0] == "+") {
            for(int i = 1; i < list.length; i++) {
                num += list[i];
            }
            answer = Integer.parseInt(num);

        }else if(list[0] == "-") {
            for(int i = 1; i < list.length; i++) {
                num += list[i];
            }
            answer = -1 * Integer.parseInt(num);
        }else {
            for(int i = 1; i < list.length; i++) {
                num += list[i];
            }
            answer = Integer.parseInt(num);
        }





        return answer;
    }
}