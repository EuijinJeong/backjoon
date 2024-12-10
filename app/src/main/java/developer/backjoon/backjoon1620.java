package developer.backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class backjoon1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        
        int n = Integer.parseInt(inputs[0]); // 1 - n번까지의 포켓몬이 하나씩 들어옴
        int m = Integer.parseInt(inputs[1]); // 맞춰야 하는 문제의 개수

        HashMap<String, Integer> nameToNumber = new HashMap<>();
        HashMap<Integer, String> numberToname = new HashMap<>();

        // 입력 받음 (번호는 1부터 시작)
        for(int i = 1; i <= n; i++) {
            String temp = br.readLine();
            nameToNumber.put(temp, i);
            numberToname.put(i, temp);
        }

        StringBuilder sb = new StringBuilder();

        // 입력으로 숫자가 들어오면 그 숫자에 해당하는 포켓몬의 이름을 출력
        // 포켓몬의 이름이 들어오면 그에 해당하는 숫자 출력
        for(int i = 0; i < m; i++) {
            String search = br.readLine();

            try {
                // 숫자 입력인 경우
                int num = Integer.parseInt(search);
                sb.append(numberToname.get(num)).append("\n");
            } catch (NumberFormatException error){
                // 문자 입력인 경우
                sb.append(nameToNumber.get(search)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
