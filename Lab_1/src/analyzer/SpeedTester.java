package analyzer;

import fillers.ArrayGenerator;
import sorters.SortMass;

public class SpeedTester {
    private static long start;
    private static long end;
    private static final int ARRAY_SIZE = 1000;
    private static final int X = (int) (Math.random() * (2147483647 / 2));
    private static int[] MassSorted = ArrayGenerator.massSorted(ARRAY_SIZE);
    private static int[] MassSortedWithX = ArrayGenerator.massSortedPlusX(ARRAY_SIZE, X);
    private static int[] sortedRevertedArray = ArrayGenerator.massSortedReverseOrder(ARRAY_SIZE);
    private static int[] randomlyFilledArray = ArrayGenerator.massRandom(ARRAY_SIZE);




    public static long bubbleSortStartToMassSorted (){
        int[] array = MassSorted.clone();
        return getBubbleSortStartTime(array);
    }

    public static long bubbleSortEndToMassSorted (){
        int[] array = MassSorted.clone();
        return getBubbleSortEndTime(array);
    }

    public static long quickSortToMassSorted (){
        int[] array = MassSorted.clone();
        return getQuickSortTime(array);
    }

    public static long arraySortToMassSorted (){
        int[] array = MassSorted.clone();
        return getArraySortTime(array);
    }

    public static long mergedWithBubbleSortStartToMassSorted (){
        int[] array = MassSorted.clone();
        return getMergedWithBubbleSortStartTime(array);
    }

    public static long mergedWithBubbleSortEndToMassSorted (){
        int[] array = MassSorted.clone();
        return getMergedWithBubbleSortEndTime(array);
    }

    public static long mergedWithQuickSortToMassSorted (){
        int[] array = MassSorted.clone();
        return getMergedWithQuickSortTime(array);
    }

    public static long mergedWithArraySortToMassSorted (){
        int[] array = MassSorted.clone();
        return getMergedWithArraySortTime(array);
    }


    public static long bubbleSortStartToMassSortedWithX (){
        int[] array = MassSortedWithX.clone();
        return getBubbleSortStartTime(array);
    }

    public static long bubbleSortEndToMassSortedWithX (){
        int[] array = MassSortedWithX.clone();
        return getBubbleSortEndTime(array);
    }

    public static long quickSortToMassSortedWithX (){
        int[] array = MassSortedWithX.clone();
        return getQuickSortTime(array);
    }

    public static long arraySortToMassSortedWithX (){
        int[] array = MassSortedWithX.clone();
        return getArraySortTime(array);
    }

    public static long mergedWithBubbleSortStartToMassSortedWithX (){
        int[] array = MassSortedWithX.clone();
        return getMergedWithBubbleSortStartTime(array);
    }

    public static long mergedWithBubbleSortEndToMassSortedWithX (){
        int[] array = MassSortedWithX.clone();
        return getMergedWithBubbleSortEndTime(array);
    }

    public static long mergedWithQuickSortToMassSortedWithX (){
        int[] array = MassSortedWithX.clone();
        return getMergedWithQuickSortTime(array);
    }

    public static long mergedWithArraySortToMassSortedWithX (){
        int[] array = MassSortedWithX.clone();
        return getMergedWithArraySortTime(array);
    }


    public static long bubbleSortStartToSortedRevertedArray (){
        int[] array = sortedRevertedArray.clone();
        return getBubbleSortStartTime(array);
    }

    public static long bubbleSortEndToSortedRevertedArray (){
        int[] array = sortedRevertedArray.clone();
        return getBubbleSortEndTime(array);
    }

    public static long quickSortToSortedRevertedArray (){
        int[] array = sortedRevertedArray.clone();
        return getQuickSortTime(array);
    }

    public static long arraySortToSortedRevertedArray (){
        int[] array = sortedRevertedArray.clone();
        return getArraySortTime(array);
    }

    public static long mergedWithBubbleSortStartToSortedRevertedArray (){
        int[] array = sortedRevertedArray.clone();
        return getMergedWithBubbleSortStartTime(array);
    }

    public static long mergedWithBubbleSortEndToSortedRevertedArray (){
        int[] array = sortedRevertedArray.clone();
        return getMergedWithBubbleSortEndTime(array);
    }

    public static long mergedWithQuickSortToSortedRevertedArray (){
        int[] array = sortedRevertedArray.clone();
        return getMergedWithQuickSortTime(array);
    }

    public static long mergedWithArraySortToSortedRevertedArray (){
        int[] array = sortedRevertedArray.clone();
        return getMergedWithArraySortTime(array);
    }


    public static long bubbleSortStartToRandomlyFilledArray (){
        int[] array = randomlyFilledArray.clone();
        return getBubbleSortStartTime(array);
    }

    public static long bubbleSortEndToRandomlyFilledArray (){
        int[] array = randomlyFilledArray.clone();
        return getBubbleSortEndTime(array);
    }

    public static long quickSortToRandomlyFilledArray (){
        int[] array = randomlyFilledArray.clone();
        return getQuickSortTime(array);
    }

    public static long arraySortToRandomlyFilledArray (){
        int[] array = randomlyFilledArray.clone();
        return getArraySortTime(array);
    }

    public static long mergedWithBubbleSortStartToRandomlyFilledArray (){
        int[] array = randomlyFilledArray.clone();
        return getMergedWithBubbleSortStartTime(array);
    }

    public static long mergedWithBubbleSortEndToRandomlyFilledArray (){
        int[] array = randomlyFilledArray.clone();
        return getMergedWithBubbleSortEndTime(array);
    }

    public static long mergedWithQuickSortToRandomlyFilledArray (){
        int[] array = randomlyFilledArray.clone();
        return getMergedWithQuickSortTime(array);
    }

    public static long mergedWithArraySortToRandomlyFilledArray (){
        int[] array = randomlyFilledArray.clone();
        return getMergedWithArraySortTime(array);
    }


    private static long getBubbleSortStartTime (int[] array) {
        start = System.nanoTime();
        SortMass.bubbleSortStart(array);
        end = System.nanoTime();
        return end - start;
    }

    private static long getBubbleSortEndTime (int[] array) {
        start = System.nanoTime();
        SortMass.bubbleSortEnd(array);
        end = System.nanoTime();
        return end - start;
    }

    private static long getQuickSortTime (int[] array) {
        start = System.nanoTime();
        SortMass.quickSort(array);
        end = System.nanoTime();
        return end - start;
    }

    private static long getArraySortTime (int[] array) {
        start = System.nanoTime();
        SortMass.arraySort(array);
        end = System.nanoTime();
        return end - start;
    }

    private static long getMergedWithBubbleSortStartTime (int[] array) {
        start = System.nanoTime();
        SortMass.mergedSortWithBubbleStart(array);
        end = System.nanoTime();
        return end - start;
    }

    private static long getMergedWithBubbleSortEndTime (int[] array) {
        start = System.nanoTime();
        SortMass.mergedSortWithBubbleEnd(array);
        end = System.nanoTime();
        return end - start;
    }

    private static long getMergedWithQuickSortTime (int[] array) {
        start = System.nanoTime();
        SortMass.mergedSortWithQuickSort(array);
        end = System.nanoTime();
        return end - start;
    }

    private static long getMergedWithArraySortTime (int[] array) {
        start = System.nanoTime();
        SortMass.mergedSortWithArraySort(array);
        end = System.nanoTime();
        return end - start;
    }

}
