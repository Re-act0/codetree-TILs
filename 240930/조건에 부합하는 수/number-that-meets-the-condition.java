import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0 && i % 4 != 0) {// 짝수 + 4의 배수가 아닌 경우
                continue;
            }

            if ((i / 8) % 2 == 0) { // 8로 나눈 몫이 짝수인 경우
                continue;
            }
            if (i % 7 < 4) {// 7로 나눈 나머지가 4보다 작은 수
                continue;
            }

            bw.write(i + " ");
        }

        bw.flush();
    }
}