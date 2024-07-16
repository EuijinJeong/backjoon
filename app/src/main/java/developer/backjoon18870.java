package developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class backjoon18870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // 좌표 배열 복사 및 정렬
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // 압축된 좌표 계산
        Map<Integer, Integer> coordinateMap = new HashMap<>();
        int rank = 0;

        //  값을 삽입
        for(int value : sortedArr) {
            if(!coordinateMap.containsKey(value)) {
                coordinateMap.put(value, rank++);
            }
        }


        StringBuilder sb = new StringBuilder();
        for(int value : arr) {
            sb.append(coordinateMap.get(value)).append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}
