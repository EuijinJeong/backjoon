package developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class backjoon1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫재쭐 입력 처리
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // 해시맵 생성
        HashSet<String> nonHeard = new HashSet<>();
        HashSet<String> nonSee = new HashSet<>();

        // 해시맵 생성한거에 값 입력받음
        for(int i = 0; i < n; i++) {
            String temp = br.readLine();
            nonHeard.add(temp);
        }
        for(int i = 0; i < m; i++) {
            String temp = br.readLine();
            nonSee.add(temp);
        }

        List<String> list = new ArrayList<>();

        // 중복이 있다면 제거, 없다면 추가
        for(String temp : nonSee) {
            if(nonHeard.contains(temp)) {
                list.add(temp);
            }
        }


        Collections.sort(list);

        System.out.println(list.size());
        for(String temp : list) {
            System.out.println(temp);
        }
    }
}
