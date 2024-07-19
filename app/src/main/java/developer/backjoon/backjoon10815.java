package developer.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class backjoon10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 카드 수
        HashSet<Integer> sangeunCards = new HashSet<>(); // 상근이가 가지고 있는 카드 목록

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자 카드에 적혀있는 정수를 HashSet에 저장
        for(int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            sangeunCards.add(card);
        }

        int m = Integer.parseInt(br.readLine()); // 판단해야할 카드의 수
        StringBuilder result = new StringBuilder(); // 판단해야할 카드의 리스트

        // 위에서 한번 사용했으니 다시 초기화해야함.
        st = new StringTokenizer(br.readLine());

        // 입력받으면서 동시에 result에 값 추가
        for(int i = 0; i < m; i++) {
            int queryCard = Integer.parseInt(st.nextToken());
            if(sangeunCards.contains(queryCard)) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }

        System.out.println(result.toString());

    }
}
