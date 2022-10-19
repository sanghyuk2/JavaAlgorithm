/*
다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요
1 10 5 8 7 6 4 3 2 9
 */

//Selection Sort와 비교하였을 때 최솟값을 따로 저장해주었던 선택정렬과 달리 버블정렬은 필요없다.
public class BubbleSort {
    public static void main(String[] args) {
        int temp = 0;
        //array.length = 10
        //index는 9까지 있다.
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 9 - i; j++) {
                //i = 0, j = 8일때 왜 IndexOutOfBoundsException 안터지지?
                //왜냐하면 index가 9까지 있기 때문이다.. (이걸 왜 고민하고 있었지..)
                if(array[j] > array[j+1]) {
                    //큰 값을 임시 메모리 변수 temp에 넣는다.
                    temp = array[j];
                    //작은 값을 큰 값 위치로 옮긴다. (index 상으로 작은 값이 앞으로 당겨졌다)
                    array[j] = array[j+1];
                    //큰 값을 작은 값 위치로 옮긴다. (index 상으로 큰 값이 뒤로 밀려났다)
                    array[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(array[i]);
        }




    }
}

/*
동작에 걸리는 시간은
10 + 9 + 8 + ... + 1
즉, O(N^2) 시간복잡도이다.

하지만 선택 정렬보다 느리다.
이유는 선택 정렬 같은 경우 가장 작은 수를 골라서 마지막에 넘겨주지만, 버블 정렬의 경우 옆의 수와 계속적으로 비교 후 교차 해 주어야 하기 때문이다.
정렬 중 가장 느리다는 특징을 가지고 있다.
 */