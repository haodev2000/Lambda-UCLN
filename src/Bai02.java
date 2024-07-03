import java.lang.reflect.Array;
import java.util.function.Function;

public class Bai02 {
    public static void main(String[] args) {

        Function<Integer, StringBuilder> function = new Function<>() {
            @Override
            public StringBuilder apply(Integer integer) {
                return convertBinary(integer);
            }
        };

        System.out.println("Giá trị nhị phân của 33 là: ");
        System.out.println(function.apply(33));

    }

    public static StringBuilder convertBinary(int num){
        StringBuilder binary = new StringBuilder();
        while(num > 0){
           int n = num%2;
            num = num/2;
            binary.append(n);
        }


        return binary.reverse();

    }
}
