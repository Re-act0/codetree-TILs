import java.io.*;
import java.util.*;

public class Main { // 3226번 전화요금

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max = 0;

        max = a >= b ? a : b;


        // a = 조건 ? v1 : v2;


        bw.write(max + "");

        bw.flush();
    }
}