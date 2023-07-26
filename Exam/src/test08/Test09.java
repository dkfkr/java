package test08; 

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test09 {
    public static void main(String[] args) {
    	
        String path = "C:\\Users\\fg012\\Desktop\\gugudan.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (int i = 1; i <= 9; i++) {
                int result = 2 * i;
                String line = "2 x " + i + " = " + result;
                writer.write(line);
                writer.newLine();
            }
            System.out.println("구구단 2단이 " + path + " 장소에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류가 발생하였습니다.");
            e.printStackTrace();
        }
    }
}
