package developer.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class backjoon11478 {
    public static void main(String[] args) throws IOException{
        // 부분 문자열 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String arr = br.readLine(); // 사용자에게 입력을 받음

        HashSet<String> newArr = new HashSet<>();

        for(int i = 0; i < arr.length(); i++) {
            for(int j = i + 1; j <= arr.length(); j++) {
                newArr.add(arr.substring(i, j));
            }
        }

        int count = newArr.size();

        System.out.println(count);
    }
}
