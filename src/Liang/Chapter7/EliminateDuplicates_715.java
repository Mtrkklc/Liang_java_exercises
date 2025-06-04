package Liang.Chapter7;

public class EliminateDuplicates_715 {
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int[] result = eliminateDuplicates(list);

        for (int number : result) {
            System.out.printf("%2d",number);
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int counter = 0;
        int[] eliminatedList = new int[list.length];
        boolean isExist;


        for (int i = 0; i < list.length; i++) {
            isExist = false;

            for (int j = 0; j < counter; j++) {
                if (eliminatedList[j] == list[i]) {
                    isExist = true;
                    break;
                }

            }
            if (!isExist) {
                eliminatedList[counter] = list[i];
                counter++;
            }
        }

        int[] result = new int[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = eliminatedList[i];
        }
        return result;
    }
}
