package developer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class backkoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<String>  entryExitRecords = new HashSet<>();

        // 입력받음
        for(int i = 0; i < n; i++) {
           String[] input = br.readLine().split(" ");
           String name = input [0];
           String action = input [1];

           if(action.equals("enter")) {
                entryExitRecords.add(name);
           } else if(action.equals("leave")) {
                entryExitRecords.remove(name);
           }
        }

        ArrayList<String> peopleInCompany = new ArrayList<>(entryExitRecords);
        Collections.sort(peopleInCompany, Collections.reverseOrder());

        // 사전 순의 역순으로 출력해야 함
        for( String value : peopleInCompany) {
            System.out.println(value);
        } 
    }
}
