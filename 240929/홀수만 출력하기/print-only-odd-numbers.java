import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = 0;
        int[] arr = new int[n];
        while (x < n) {
            arr[x] = Integer.parseInt(br.readLine());
            x++;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                bw.write(arr[i] + "\n");
            }
        }


        bw.flush();
    }
}