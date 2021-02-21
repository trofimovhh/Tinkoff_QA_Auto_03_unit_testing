import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TinkoffSortTests {
    @Test
    public void positiveValuesTest() {
        int[] arrayForTest = {97, 25, 42, 90, 71, 16, 82, 39, 36, 74};
        int[] humanSortedArray = {16, 25, 36, 39, 42, 71, 74, 82, 90, 97};
        arrayForTest = TinkoffSort.sort(arrayForTest);
        Assertions.assertArrayEquals(humanSortedArray, arrayForTest);
    }

    @Test
    public void zeroValuesTest() {
        int[] arrayForTest = {0, 0, 0, 0};
        int[] humanSortedArray = {0, 0, 0, 0};
        arrayForTest = TinkoffSort.sort(arrayForTest);
        Assertions.assertArrayEquals(humanSortedArray, arrayForTest);
    }

    @Test
    public void negativeValuesTest() {
        int[] arrayForTest = {-13, -3, -6, -4, -125, -78};
        int[] humanSortedArray = {-125, -78, -13, -6, -4, -3};
        arrayForTest = TinkoffSort.sort(arrayForTest);
        Assertions.assertArrayEquals(humanSortedArray, arrayForTest);
    }

    @Test
    public void zeroPositiveNegativeValuesTest() {
        int[] arrayForTest = {1, -1, 0, -100, 99};
        int[] humanSortedArray = {-100, -1, 0, 1, 99};
        arrayForTest = TinkoffSort.sort(arrayForTest);
        Assertions.assertArrayEquals(humanSortedArray, arrayForTest);
    }

    @Test
    public void emptyArrayTest() {
        int[] arrayForTest = {};
        int[] humanSortedArray = {};
        arrayForTest = TinkoffSort.sort(arrayForTest);
        Assertions.assertArrayEquals(humanSortedArray, arrayForTest);
    }

    @Test
    public void onlyFourTest() {
        int[] arrayForTest = {444, 44, 4, 44, 444};
        int[] humanSortedArray = {4, 44, 44, 444, 444};
        arrayForTest = TinkoffSort.sort(arrayForTest);
        Assertions.assertArrayEquals(humanSortedArray, arrayForTest);
    }

    @Test
    public void everyDigitTest() {
        int[] arrayForTest = {2, 4, 6, 8, 1, 3, 5, 7, 9, 0};
        int[] humanSortedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayForTest = TinkoffSort.sort(arrayForTest);
        Assertions.assertArrayEquals(humanSortedArray, arrayForTest);
    }

    @Test
    public void intBoundaryValuesTest() {
        int[] arrayForTest = {2147483647, -2147483648, 2128507, 345678};
        int[] humanSortedArray = {-2147483648, 345678, 2128507, 2147483647};
        arrayForTest = TinkoffSort.sort(arrayForTest);
        Assertions.assertArrayEquals(humanSortedArray, arrayForTest);
    }
}