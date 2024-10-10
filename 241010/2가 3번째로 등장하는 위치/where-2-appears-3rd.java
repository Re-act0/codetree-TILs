import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[500];

        for (int i = 0; i < 500; i++) {
            arr[i] = 0;
        }
        int x = 0;
        int res = 0;
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (x < n) {
            res = Integer.parseInt(st.nextToken());
            arr[res]++;
            cnt++;
            if (arr[2] == 3)
                break;

            x++;
        }

        bw.write(cnt + "");

        bw.flush();
    }
}