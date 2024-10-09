import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        /* 정수 a, b;
        a = a / b;
        a가 1 이하일때까지 // a <= b일때까지만 진행
        // 나머지가 등장한 횟수 제곱, 합 출력*/

        // 변수 선언, 배열 선언
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int arr[] = new int[10];

        int x = 0;
        int res = 0; // 결과값 출력 변수

        // 배열 초기화
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }

        while (a > 1) {
            x = a % b;
            a /= b;
            arr[x]++;

        }

        for (int i = 0; i < 10; i++) {
            res += (arr[i] * arr[i]);
        }
        bw.write(res + "");

        bw.flush();
    }
}