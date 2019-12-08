import utils.AdventUtils;

import java.io.IOException;
import java.util.Arrays;

public class Day2 {

    public static void main(String[] args) throws IOException {
        String problemLines = AdventUtils.readFile(Day2.class);
        String[] data = problemLines.split(",");

        String[] sol = calculateSolution(data);

        System.out.println(Arrays.toString(sol));
    }

    static String[] calculateSolution(String[] data) {
        for (int i = 0; i < data.length - 4; i += 4) {
            int operation = Integer.parseInt(data[i]);
            int firstPosition = Integer.parseInt(data[i + 1]);
            int secondPosition = Integer.parseInt(data[i + 2]);
            int thirdPosition = Integer.parseInt(data[i + 3]);
            if (operation == 1) {
                data[thirdPosition] = (Integer.parseInt(data[firstPosition]) + Integer.parseInt(data[secondPosition])) + "";
            } else if (operation == 2) {
                data[thirdPosition] = (Integer.parseInt(data[firstPosition]) * Integer.parseInt(data[secondPosition])) + "";
            } else {
                break;
            }
        }
        return data;
    }
}
