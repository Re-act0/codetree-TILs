import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int[] arr = new int[50];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i != 0 && arr[i] % 3 == 0) {
                bw.write(arr[i - 1] + "");
                break;
            }
        }


        bw.flush();
    }
}