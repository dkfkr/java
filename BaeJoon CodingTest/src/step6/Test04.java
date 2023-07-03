package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Test04 {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine());
 
        bw.write(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
}

//두 번째는 StringBuilder 클래스 내에 있는 reverse() 메소드를 사용하는 것입니다. 이것은 문자열을 서로 뒤집어 주는 역할을 하기때문에 우리가 할 일은 기존에 있던 문자열과 뒤집은 문자열이 서로 동일한지 검사만 하면 됩니다.
//단, 이때 문자열이 같은지 검사할 때는 '=='이 아니라 equals() 메소드를 사용해야한다는 점만 조심하시길 바랍니다.
//참고로, StringBuilder에서 String을 반환할 때는 toString() 메소드를 사용하시면 됩니다.
//아래는 위 과정을 정리한 소스코드입니다.