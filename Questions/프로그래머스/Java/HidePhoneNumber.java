import java.util.Arrays;
class Solution {
    public String solution(String phone_number) {
        String answer = "";

        String[] str = phone_number.split("");

        for(int i = 0; i < str.length-4; i++)
            str[i] = "*";

        answer = String.join("",str);

        return answer;
    }
}