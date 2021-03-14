/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate.grades.with.java;

import java.util.Scanner;

/**
 *
 * @author aasla
 */
public class CalculateGradesWithJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        int vize=input.nextInt();
        System.out.println("final notunuzu giriniz");
        int finall=input.nextInt();
        int vizeyuz,finalyuz;
        double not;
        do {
        System.out.println("**********************************");
        System.out.println("Lütfen yüzdeleri dikkatli giriniz ");        
        System.out.println("**********************************");    
        System.out.println("vize notu yüzde kaç etkilemektedir giriniz");
        vizeyuz=input.nextInt();
        System.out.println("final notu yüzde kaç etkilemektedir giriniz");
        finalyuz=input.nextInt();
        not=(vize*((double)vizeyuz/100)+finall*((double)finalyuz/100));
        } while (vizeyuz+finalyuz!=100);
        if (not<=100 && not>=90) {
            System.out.println("Harf notunuz: AA");
        }
        else if (not<=89 && not>=85) {
            System.out.println("Harf notunuz: BA");
        }
        else if (not<=84 && not>=80) {
            System.out.println("Harf notunuz: BB");
        }
        else if (not<=79 && not>=75) {
            System.out.println("Harf notunuz: CB");
        }
        else if (not<=74 && not>=70) {
            System.out.println("Harf notunuz: CC");
        }
        else if (not<=69 && not>=65) {
            System.out.println("Harf notunuz: DC");
        }
        else if (not<=64 && not>=60) {
            System.out.println("Harf notunuz: DD");
        }
        else if (not<=59 && not>=50) {
            System.out.println("Harf notunuz: FD");
        }
        else if (not<=49 && not>=0) {
            System.out.println("Harf notunuz: FF");
        }
                
    }
    
}
