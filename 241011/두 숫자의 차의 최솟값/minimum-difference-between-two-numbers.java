import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        } // 배열 초기화

        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        res = arr[1] - arr[0];
        for (int i = 1; i < n - 1; i++) {
            if (res > arr[i + 1] - arr[i])
                res = arr[i + 1] - arr[i];
        }

        bw.write(res + "");


        bw.flush();
    }
}