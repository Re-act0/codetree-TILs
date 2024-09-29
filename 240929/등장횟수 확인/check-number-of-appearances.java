import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int x = 0;
        int[] arr = new int[5];
        int cnt = 0;
        while (x < 5) {
            arr[x] = Integer.parseInt(br.readLine());
            if (arr[x] % 2 == 0)
                cnt++;
            x++;
        }

        bw.write(cnt + "");


        bw.flush();
    }
}