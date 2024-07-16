package developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class backjoon10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // 회원 수

       int[] arr = new Int[n][2];

        for(int i = 0; i<n; i++) {
            arr[i] = br.readLine().split(" ");
        }


        // 나이글 기준으로 정렬
        // 만약 나이가 같다면, 가입한 순으로 정렬
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int age1 = Integer.parseInt(o1[0]);
                int age2 = Integer.parseInt(o2[0]);
                if(age1 != age2) {
                    return Integer.compare(age1, age2);
                } else {
                    return 0;
                }
            }
        });

         // 정렬된 결과 출력
         for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
