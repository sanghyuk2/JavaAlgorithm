class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] arr = s.toLowerCase().split("");

        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("p"))
                pCount++;
            else if(arr[i].equals("y"))
                yCount++;
        }

        if(pCount != yCount)
            return false;
        else
            return true;



        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.


    }
}