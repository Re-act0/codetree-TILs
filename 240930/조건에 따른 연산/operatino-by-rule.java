import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n < 1000){
            if (n % 2 == 0)
                n = (n * 3) + 1;
            else
                n = (n * 2) + 2;

            cnt++;
        }

        bw.write(cnt +"");
        bw.flush();
    }
}