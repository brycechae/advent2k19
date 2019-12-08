import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day2Test {

    @Test
    void calculateSolutionReturnsCorrectInputForAddOperations() {
        String[] data = "1,0,0,0,99".split(",");
        String[] expected = "2,0,0,0,99".split(",");

        String[] actual = Day2.calculateSolution(data);

        assertThat(actual, is(expected));
    }

    @Test
    void calculateSolutionReturnsCorrectInputForMultiplyOperations() {
        String[] data = "2,3,0,3,99".split(",");
        String[] expected = "2,3,0,6,99".split(",");

        String[] actual = Day2.calculateSolution(data);

        assertThat(actual, is(expected));
    }

    @Test
    void calculateSolutionReturnsCorrectInputForMultiplyOperationsThatDoNotEndIn99() {
        String[] data = "2,4,4,5,99,0".split(",");
        String[] expected = "2,4,4,5,99,9801".split(",");

        String[] actual = Day2.calculateSolution(data);

        assertThat(actual, is(expected));
    }

    @Test
    void calculateSolutionReturnsCorrectInputLongAddOperation() {
        String[] data = "1,1,1,4,99,5,6,0,99".split(",");
        String[] expected = "30,1,1,4,2,5,6,0,99".split(",");

        String[] actual = Day2.calculateSolution(data);

        assertThat(actual, is(expected));
    }

    @Test
    void calculateSolutionReturnsCorrectInpufForSample() {
        String[] data = "1,9,10,3,2,3,11,0,99,30,40,50".split(",");
        String[] expected = "3500,9,10,70,2,3,11,0,99,30,40,50".split(",");

        String[] actual = Day2.calculateSolution(data);

        assertThat(actual, is(expected));
    }
}