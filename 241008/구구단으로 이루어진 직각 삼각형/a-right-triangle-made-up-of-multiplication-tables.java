import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int N = Integer.parseInt(br.readLine());
        int N1 = N;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N1; j++) {
                bw.write(i + " * " + j + " = " + i * j);
                if (j != N1){
                    bw.write(" / ");
                }
            }
            N1--;
            bw.write("\n");
        }

        bw.flush();
    }
}