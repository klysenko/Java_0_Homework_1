public class QuickSort {
    public static void main(String[] Args) {
        int[] arrayToSort = {0, 78, 56, 78, 4, 10, -10,128};
        int firstIndex = 0;
        int lastIndex = arrayToSort.length - 1;
        quickSort(arrayToSort, firstIndex,lastIndex);
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
    }
    public static void quickSort(int[] array, int firstIndex, int lastIndex) {

        int middleIndex = (firstIndex + lastIndex) / 2;
        int pivot = array[middleIndex];
        int i = firstIndex;
        int j = lastIndex;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int a = array[i];
                array[i] = array[j];
                array[j] = a;
                i++;
                j--;
            }
        }
        if (firstIndex < j) {
            quickSort(array, firstIndex, j);
        }
        if (lastIndex > i) {
            quickSort(array, i, lastIndex);
        }

    }
}
