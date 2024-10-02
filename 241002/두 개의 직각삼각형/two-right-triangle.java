import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) { // 줄 띄우기
            for (int j = 0; j < n - i; j++) { // 첫번째 삼각형
                bw.write("*");
            }
            for (int k = 0; k < 2 * i; k++) { // 두번째 공백
                bw.write(" ");
            }
            for (int l = 0; l < n - i; l++) { // 세번째 삼각형
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
    }
}