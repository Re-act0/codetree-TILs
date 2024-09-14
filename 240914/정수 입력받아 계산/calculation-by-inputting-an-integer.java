import java.io.*;
import java.util.*;

public class Main { // 3226번 전화요금

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int a = Integer.parseInt(br.readLine());
        int result = (a * 2) + 3;


        bw.write(""+ result);

        bw.flush();
    }
}