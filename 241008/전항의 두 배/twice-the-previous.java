import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int[] arr = new int[50];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + 2 * arr[i - 2];
        }
        for (int j = 0; j < 10; j++) {
            bw.write(arr[j] + " ");
        }

        bw.flush();
    }
}