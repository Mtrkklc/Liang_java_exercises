package Liang.Chapter5;

public class DemonstrateCancellationErrors_523{
  public static void main(String[] args) {
    int n = 50_000;
    double resultLeft = 0;
    double resultRight = 0;

    for (int i = 1; i <= 50_000; i++) {
      resultLeft += 1.0 / i;
    }
    System.out.println("Left to Right: " + resultLeft);

    for (int i = 50_000; i >= 1; i--) {
      resultRight += 1.0 / i;
    }
    System.out.println("Right to Left: " + resultRight);

  }
}
