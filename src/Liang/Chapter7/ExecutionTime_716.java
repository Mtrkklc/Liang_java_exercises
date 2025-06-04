package Liang.Chapter7;

public class ExecutionTime_716 {
    public static void main(String[] args) {
        int[] randomArray = randomArray();
        int key = getKey(randomArray);

        long startTime = System.currentTimeMillis();
        int linearIndex = linearSearch(randomArray, key);
        long endTime = System.currentTimeMillis();
        long linearTime = endTime - startTime;

        System.out.println("Linear Search index: " + linearIndex);
        System.out.println("Linear Search time: " + linearTime + " ms");

        // === SELECTION SORT ===
        int[] arrayToSort = randomArray.clone(); // binary search için diziyi bozmayalım

        startTime = System.currentTimeMillis();
        selectionSort(arrayToSort);
        endTime = System.currentTimeMillis();
        long sortTime = endTime - startTime;

        System.out.println("Manual Sort time: " + sortTime + " ms");

        // === BINARY SEARCH ===
        startTime = System.currentTimeMillis();
        int binaryIndex = binarySearch(arrayToSort, key);
        endTime = System.currentTimeMillis();
        long binaryTime = endTime - startTime;

        System.out.println("Binary Search index: " + binaryIndex);
        System.out.println("Binary Search time: " + binaryTime + " ms");


    }


    public static int[] randomArray() {
        int[] randomArray = new int[100000];

        for (int i = 0; i < 100000; i++) {
            randomArray[i] = (int) (Math.random() * 100000);
        }
        return randomArray;
    }

    public static int getKey(int[] array) {
        return array[(int) (Math.random() * array.length)];
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            }

        }
        return -1;
    }
}
