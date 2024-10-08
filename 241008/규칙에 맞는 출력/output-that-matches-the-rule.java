import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int N = Integer.parseInt(br.readLine());
        int N1 = N;
        for (int i = 0; i < N; i++) {
            for (int j = N1; j <= N; j++) {
                bw.write(j + " ");
            }
            N1--;
            bw.write("\n");
        }

        bw.flush();
    }
}