package HomeWork03;

//(Дополнительно) Реализовать алгоритм сортировки слиянием
public class Task01 {
    public static void main(String[] args) {
        int[] arry = { 6, 3, 2, 5, 6, 2, 0, 0 };
        printArray(arry);
        mergeSort(arry, arry.length);
        printArray(arry);
    }

    public static void printArray(int[] arrayNumbers) {
        System.out.print("Массив:");
        for (int i : arrayNumbers) {
            System.out.print(" "+ i);
        }
        System.out.println("\n");
    }

    public static void mergeSort(int[] arrayNumbers, int lengthResult) {
        if (lengthResult < 2) {
            return;
        }
        int mid = lengthResult / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[lengthResult - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = arrayNumbers[i];
        }
        for (int i = mid; i < lengthResult; i++) {
            rightArray[i - mid] = arrayNumbers[i];
        }
        mergeSort(leftArray, mid);
        mergeSort(rightArray, lengthResult - mid);
        merge(arrayNumbers, leftArray, rightArray, mid, lengthResult - mid);
    }

    public static void merge(int[] arrayNumbers, int[] leftArray, int[] rightArray, int leftArLength,
            int rightArLength) {
        int i = 0, j = 0, k = 0;
        while (i < leftArLength && j < rightArLength) {
            if (leftArray[i] <= rightArray[j]) {
                arrayNumbers[k++] = leftArray[i++];
            } else {
                arrayNumbers[k++] = rightArray[j++];
            }
        }
        while (i < leftArLength) {
            arrayNumbers[k++] = leftArray[i++];
        }
        while (j < rightArLength) {
            arrayNumbers[k++] = rightArray[j++];
        }
    }
}
