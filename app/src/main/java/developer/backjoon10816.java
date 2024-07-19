package developer;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class backjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 카드의 개수

        HashMap<Integer, Integer> sangeunCards = new HashMap<>();
        // StringBuilder sb = new StringBuilder();

        // 상근이가 가지고 있는 카드의 수를 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            sangeunCards.put(i, input);
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];

        for(int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 몇개 가지고 있는지 계산하는 로직
        int[] result = new int[m];
        int count = 0;
        for(int i = 0; i<m; i++) {
            if(sangeunCards.containsValue(arr[i])) {
                count++;
                result[i] = count;
            }
        }

        for(int temp : result) {
            System.out.println(temp);
        }
    }
}
