import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            a += n;
            bw.write(a + "\n");
        }
        
        bw.flush();
    }
}