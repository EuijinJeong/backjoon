package developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class backjoon1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int aNum = Integer.parseInt(input[0]);
        int bNum = Integer.parseInt(input[1]);

        HashSet<Integer> a = new HashSet<>(aNum);
        HashSet<Integer> b = new HashSet<>(bNum);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aNum; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bNum; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        // 차집합 계산
        HashSet<Integer> aMinusB = new HashSet<>(a);
        aMinusB.removeAll(b);

        HashSet<Integer> bMinusA = new HashSet<>(b);
        bMinusA.removeAll(a);

        // 차집합 크기 계산
        int count = aMinusB.size() + bMinusA.size();

        System.out.println(count);
    }
}
