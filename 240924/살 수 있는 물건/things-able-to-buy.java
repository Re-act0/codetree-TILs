import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        if (n >= 3000)
            bw.write("book");
        else if (n >= 1000 && n < 3000)
            bw.write("mask");
        else
            bw.write("no");


        bw.flush();
    }
}