package crtamojelku;

import java.util.Scanner;

public class CrtamoJelku {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("Unesite velicinu jelke:");
        int a;
        a = s.nextInt();
        

            for (int i = 1; i < a; i++) {
                for (int j = 1; j < a - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < i; k++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        System.out.println("     *");
    }
}