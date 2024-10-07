import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    bw.write(num + " ");
                    num++;
                    if (j == n - 1) {
                        num++;
                    }
                } else if (i % 2 == 1) {
                    bw.write(num + " ");
                    num += 2;
                    if (j == n - 1) {
                        num--;
                    }
                }
            }
            bw.write("\n");
        }

        bw.flush();
    }
}