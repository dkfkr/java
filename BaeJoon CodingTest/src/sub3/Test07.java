package sub3;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.io.IOException;
	
public class Test07 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        int T = Integer.parseInt(br.readLine());

	        for (int i = 0; i < T; i++) {
	            String[] inputs = br.readLine().split(" ");
	            int A = Integer.parseInt(inputs[0]);
	            int B = Integer.parseInt(inputs[1]);

	            int sum = A + B;
	            String c = "Case #" + i + ": " + sum;
 	            bw.write(c);
	            bw.newLine();
	        }

	        bw.flush();
	        bw.close();
	        br.close();
	    }
	}