package developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // 점의 개수

        int[][] arr = new int[n][2]; // 위치가 같은 두 점은 없음

        // 좌표값 입력 받음
        for(int i = 0; i< n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // x좌표를 기준으로 정렬, x좌표가 같다면 y좌표를 기준으로 정렬
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                } else {
                    return Integer.compare(o1[0], o2[0]);
                }
            }
        });

        for(int i =0; i<n; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        
    }
}
