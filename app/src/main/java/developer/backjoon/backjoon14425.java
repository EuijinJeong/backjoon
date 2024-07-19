package developer.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class backjoon14425 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 같은 줄에서 두 수를 입력받기 때문에 이런식으로 작성함.
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashSet<String> inputString = new HashSet<>();

        // 입력받은 문자열 해시세트에 추가
        for(int i = 0; i < n; i++) {
            inputString.add(br.readLine());
        }

        int count = 0;

        // 루프를 돌면서 입력받은 값이 원래 있었던 해시맵에 존재하면 카운트 증가
        for(int i = 0; i<m; i++) {
            String query = br.readLine();
            if(inputString.contains(query)) {
                count++;
            }
        }

       System.out.println(count);
    }
}
