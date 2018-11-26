package output;


import analyzer.SpeedTester;

public class ResultsAnalyzer {

    public static void main(String[] args) {
        printBubbleSortStartToMassSorted();
        printBubbleSortStartToMassSortedWithX();
        printBubbleSortStartToSortedRevertedArray();
        printBubbleSortStartToRandomlyFilledArray();
        System.out.print("\n");
        printMergedWithBubbleSortStartToMassSorted();
        printMergedWithBubbleSortStartToMassSortedWithX();
        printMergedWithBubbleSortStartToSortedRevertedArray();
        printMergedWithBubbleSortStartToRandomlyFilledArray();
        System.out.print("\n");
        printBubbleSortEndToMassSorted();
        printBubbleSortEndToMassSortedWithX();
        printBubbleSortEndToSortedRevertedArray();
        printBubbleSortEndToRandomlyFilledArray();
        System.out.print("\n");
        printMergedWithBubbleSortEndToMassSorted();
        printMergedWithBubbleSortEndToMassSortedWithX();
        printMergedWithBubbleSortEndToSortedRevertedArray();
        printMergedWithBubbleSortEndToRandomlyFilledArray();
        System.out.print("\n");
        printQuickSortToMassSorted();
        printQuickSortToMassSortedWithX();
        printQuickSortToSortedRevertedArray();
        printQuickSortToRandomlyFilledArray();
        System.out.print("\n");
        printMergedWithQuickSortToMassSorted();
        printMergedWithQuickSortToMassSortedWithX();
        printMergedWithQuickSortToSortedRevertedArray();
        printMergedWithQuickSortToRandomlyFilledArray();
        System.out.print("\n");
        printArraySortToMassSorted();
        printArraySortToMassSortedWithX();
        printArraySortToSortedRevertedArray();
        printArraySortToRandomlyFilledArray();
        System.out.print("\n");
        printMergedWithArraySortToMassSorted();
        printMergedWithArraySortToMassSortedWithX();
        printMergedWithArraySortToSortedRevertedArray();
        printMergedWithArraySortToRandomlyFilledArray();
    }
    
    private static void printBubbleSortStartToMassSorted() {
        System.out.println("Пузирькове сортування з початку в відсортований массив: " +
                SpeedTester.bubbleSortStartToMassSorted() + " нс.");
    }

    private static void printBubbleSortEndToMassSorted() {
        System.out.println("Пузирькове сортування з кінця в відсортований массив: " +
                SpeedTester.bubbleSortEndToMassSorted() + " нс.");
    }

    private static void printQuickSortToMassSorted() {
        System.out.println("Швидке сортування в відсортований массив: " +
                SpeedTester.quickSortToMassSorted() + " нс.");
    }

    private static void printArraySortToMassSorted() {
        System.out.println("Сортованний массив в відсортований массив: " +
                SpeedTester.arraySortToMassSorted() + " нс.");
    }

    private static void printMergedWithBubbleSortStartToMassSorted() {
        System.out.println("Зливаюче сортування пузирькового сортування з початку в відсортований массив: " +
                SpeedTester.mergedWithBubbleSortStartToMassSorted() + " нс.");
    }

    private static void printMergedWithBubbleSortEndToMassSorted() {
        System.out.println("Зливаюче сортування пузирькового сортування з кінця в відсортований массив: " +
                SpeedTester.mergedWithBubbleSortEndToMassSorted() + " нс.");
    }

    private static void printMergedWithQuickSortToMassSorted() {
        System.out.println("Зливаюче сортування швидкого сортування в відсортований массив: " +
                SpeedTester.mergedWithQuickSortToMassSorted() + " нс.");
    }

    private static void printMergedWithArraySortToMassSorted() {
        System.out.println("Зливаюче сортування сортованного массиву в відсортований массив: " +
                SpeedTester.mergedWithArraySortToMassSorted() + " нс.");
    }

    private static void printBubbleSortStartToMassSortedWithX() {
        System.out.println("Пузирькове сортування з початку в відсортований массив з X в кінці: " +
                SpeedTester.bubbleSortStartToMassSortedWithX() + " нс.");
    }

    private static void printBubbleSortEndToMassSortedWithX() {
        System.out.println("Пузирькове сортування з кінця в відсортований массив з X в кінці: " +
                SpeedTester.bubbleSortEndToMassSortedWithX() + " нс.");
    }

    private static void printQuickSortToMassSortedWithX() {
        System.out.println("Швидке сортування в відсортований массив з Х в кінці: " +
                SpeedTester.quickSortToMassSortedWithX() + " нс.");
    }

    private static void printArraySortToMassSortedWithX() {
        System.out.println("Сортованний массив в відсортований массив з Х в кінці: " +
                SpeedTester.arraySortToMassSortedWithX() + " нс.");
    }

    private static void printMergedWithBubbleSortStartToMassSortedWithX() {
        System.out.println("Зливаюче сортування пузирькового сортування в відсортований массив з початку з X в кінці: " +
                SpeedTester.mergedWithBubbleSortStartToMassSortedWithX() + " нс.");
    }

    private static void printMergedWithBubbleSortEndToMassSortedWithX() {
        System.out.println("Зливаюче сортування пузирькового сортування в відсортований массив з кінця з X в кінці: " +
                SpeedTester.mergedWithBubbleSortEndToMassSortedWithX() + " нс.");
    }

    private static void printMergedWithQuickSortToMassSortedWithX() {
        System.out.println("Зливаюче сортування швидкого сортування в відсортований массив з Х в кінці: " +
                SpeedTester.mergedWithQuickSortToMassSortedWithX() + " нс.");
    }

    private static void printMergedWithArraySortToMassSortedWithX() {
        System.out.println("Зливаюче сортування сортованного массиву в відсортований массив з Х в кінці: " +
                SpeedTester.mergedWithArraySortToMassSortedWithX() + " нс.");
    }


    private static void printBubbleSortStartToSortedRevertedArray() {
        System.out.println("Пузирькове сортування з початку в відсортований з кінця: " +
                SpeedTester.bubbleSortStartToMassSorted() + " нс.");
    }

    private static void printBubbleSortEndToSortedRevertedArray() {
        System.out.println("Пузирькове сортування з кінця в відсортований з кінця: " +
                SpeedTester.bubbleSortEndToSortedRevertedArray() + " нс.");
    }

    private static void printQuickSortToSortedRevertedArray() {
        System.out.println("Швидке сортування в відсортований з кінця: " +
                SpeedTester.quickSortToSortedRevertedArray() + " нс.");
    }

    private static void printArraySortToSortedRevertedArray() {
        System.out.println("Сортованний массив в відсортований з кінця: " +
                SpeedTester.arraySortToSortedRevertedArray() + " нс.");
    }

    private static void printMergedWithBubbleSortStartToSortedRevertedArray() {
        System.out.println("Зливаюче пузирькове сортування з початку в відсортований з кінця: " +
                SpeedTester.mergedWithBubbleSortStartToMassSorted() + " нс.");
    }

    private static void printMergedWithBubbleSortEndToSortedRevertedArray() {
        System.out.println("Зливаюче пузирькове сортування з кінця в відсортований з кінця: " +
                SpeedTester.mergedWithBubbleSortEndToSortedRevertedArray() + " нс.");
    }

    private static void printMergedWithQuickSortToSortedRevertedArray() {
        System.out.println("Зливаюче швидке сортування в відсортований з кінця: " +
                SpeedTester.mergedWithQuickSortToSortedRevertedArray() + " нс.");
    }

    private static void printMergedWithArraySortToSortedRevertedArray() {
        System.out.println("Зливаюче сортованого массива в відсортований з кінця: " +
                SpeedTester.mergedWithArraySortToSortedRevertedArray() + " нс.");
    }


    private static void printBubbleSortStartToRandomlyFilledArray() {
        System.out.println("Пузирькове сортування з початку в рандомний массив: " +
                SpeedTester.bubbleSortStartToRandomlyFilledArray() + " нс.");
    }

    private static void printBubbleSortEndToRandomlyFilledArray() {
        System.out.println("Пузирькове сортування з кінця в рандомний массив: " +
                SpeedTester.bubbleSortEndToRandomlyFilledArray() + " нс.");
    }

    private static void printQuickSortToRandomlyFilledArray() {
        System.out.println("Швидке сортування в рандомний массив: " +
                SpeedTester.quickSortToRandomlyFilledArray() + " нс.");
    }

    private static void printArraySortToRandomlyFilledArray() {
        System.out.println("Сортованого массива в рандомний массив: " +
                SpeedTester.arraySortToRandomlyFilledArray() + " нс.");
    }

    private static void printMergedWithBubbleSortStartToRandomlyFilledArray() {
        System.out.println("Зливаюче пузирькове сортування з початку в рандомний массив: " +
                SpeedTester.mergedWithBubbleSortStartToRandomlyFilledArray() + " нс.");
    }

    private static void printMergedWithBubbleSortEndToRandomlyFilledArray() {
        System.out.println("Зливаюче пузирькове сортування з кінця в рандомний массив: " +
                SpeedTester.mergedWithBubbleSortEndToRandomlyFilledArray() + " нс.");
    }

    private static void printMergedWithQuickSortToRandomlyFilledArray() {
        System.out.println("Зливаюче швидке сортування в рандомний массив: " +
                SpeedTester.mergedWithQuickSortToRandomlyFilledArray() + " нс.");
    }

    private static void printMergedWithArraySortToRandomlyFilledArray() {
        System.out.println("Зливаюче сортованого массива в рандомний массив: " +
                SpeedTester.mergedWithArraySortToRandomlyFilledArray() + " нс.");
    }

    
}
