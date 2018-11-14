public class BinarySearch {
    public static void main(String[] Args) {
        int numberToFind = 10;
        int sourceSortedArray[] = {2, 3, 4, 6, 10, 15, 20};

        int firstIndex = 0;
        int lastIndex = sourceSortedArray.length;
        int elementIndex = -1;
        while (firstIndex < lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (numberToFind == sourceSortedArray[middleIndex]) {
                elementIndex = middleIndex;
                break;
            } else {
                if (numberToFind < sourceSortedArray[middleIndex]) {
                    lastIndex = middleIndex;
                } else {
                    firstIndex = middleIndex + 1;
                }
            }
        }
        if (elementIndex == -1) {
            System.out.println("Element was not found");
        } else {
            System.out.println("Element is found at " + elementIndex + " index");
        }
    }
}
