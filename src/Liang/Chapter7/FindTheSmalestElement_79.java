package Liang.Chapter7;

public class FindTheSmalestElement_79 {
    public static void main(String[] args) {
        double[] array = new double[] {1.9,2.5,3.7,2,1.5,6,3,45,2};
        System.out.println("Minimum value: " + min(array));

    }

    public static  double min(double[] array){
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
