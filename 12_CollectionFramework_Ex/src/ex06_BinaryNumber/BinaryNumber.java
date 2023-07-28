package ex06_BinaryNumber;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumber {

    private int number;      // 10진수
    private List<Integer> binary; // 2진수

    // new BinaryNumber(32)  2진수 : 100000
    public BinaryNumber(int number) {
        this.number = number;
        binary = new ArrayList<>();

        // 10진수를 2진수로 변환하여 binary 리스트에 저장
        while (number > 0) {          
            binary.add(number % 2); // 2진수는 역순으로 저장되므로 0 인덱스에 삽입
            number /= 2;
        }
        
        // 입력된 숫자가 0인 경우에는 0이 하나만 들어있는 2진수 리스트를 생성
        if (binary.isEmpty()) {
            binary.add(0);
        }
    }

    // BinaryNumber bn = new BinaryNumber(32);
    // System.out.println(bn);  // 100000
    @Override
    public String toString() {
        String result = "";
        for (int i = binary.size() - 1; i >= 0; i--) {     
          result += binary.get(i);
        }
        return result;
    }

}
