package CodeUp;

import java.util.Scanner;

public class CU_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a>=90){
            System.out.println("A");
        } else if (a>=70 && a<=89){
            System.out.println("B");
        } else if (a>=40 && a<=69){
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
