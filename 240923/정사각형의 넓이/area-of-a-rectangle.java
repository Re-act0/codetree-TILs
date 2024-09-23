import java.io.*;
import java.util.*;

public class Main { // 3226번 전화요금

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        if (n < 5)
            bw.write(n * n + "\ntiny");
        else
            bw.write(n * n + "");


        bw.flush();
    }
}