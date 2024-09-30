import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int cnt = 1;
        double sum = 0;
        int a = Integer.parseInt(br.readLine());
        sum += a;


        while (true) {
            int x = Integer.parseInt(br.readLine());
            if (x < 20 || x >= 30)
                break;
            sum += x;
            cnt += 1;

        }

        double avg = (sum / cnt);

        bw.write(String.format("%.2f\n", avg));

        bw.flush();
    }
}