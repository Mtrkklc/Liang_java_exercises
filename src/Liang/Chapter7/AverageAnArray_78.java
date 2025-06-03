package Liang.Chapter7;

public class AverageAnArray_78 {
    public static void main(String[] args) {
        int intResult;
        double doubleResult;
        int[] intArray  = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        double[] doubleArray  = new double[] {1.4,3.5,7.2,6.4,8.1,9.7,12.2};

        intResult = average(intArray);
        doubleResult = average(doubleArray);

        System.out.println("Integer Result: " + intResult);
        System.out.println("Double Result: " + doubleResult);

    }

    public static int average(int[] array){
        int sum = 0;

        for (int number : array){
            sum += number;

        }
        return (sum / array.length) ;
    }

    public static double average(double[] array){
        double sum = 0;
        for (double number : array){
            sum += number;
        }
        return (sum / array.length);
    }
}
