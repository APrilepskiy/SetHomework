import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SetHomework {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = Collections.min(array);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {

        BufferedReader stream = new BufferedReader(new InputStreamReader(System.in));

        String Number = stream.readLine();
        int n = Integer.parseInt(Number);

        List<Integer> list = new ArrayList<Integer>();

        while (n > 0) {
            int i = Integer.parseInt(stream.readLine());
            list.add(i);
            n--;
        }
        stream.close();
        return list;
    }

}
