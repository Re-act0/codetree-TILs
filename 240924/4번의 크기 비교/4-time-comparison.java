import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        if (a > b)
            bw.write("1\n");
        else
            bw.write("0\n");
        if (a > c)
            bw.write("1\n");
        else
            bw.write("0\n");
        if (a > d)
            bw.write("1\n");
        else
            bw.write("0\n");
        if (a > e)
            bw.write("1\n");
        else
            bw.write("0\n");

        bw.flush();
    }
}