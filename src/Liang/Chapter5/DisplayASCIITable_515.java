package Liang.Chapter5;

public class DisplayASCIITable_515 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 33; i <128 ; i++) {
            char item = (char) i;
            System.out.printf("%-6s ",item);
            counter++;

            if(counter %10 == 0){
                System.out.println();
            }
        }
    }
}
