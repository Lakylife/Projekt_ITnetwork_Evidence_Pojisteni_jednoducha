/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *
 *        ______            __       __        __         
 *       / ____/____   ____/ /___   / /____ _ / /__ __  __
 *      / /    / __ \ / __  // _ \ / // __ `// //_// / / /
 *     / /___ / /_/ // /_/ //  __// // /_/ // ,<  / /_/ / 
 *     \____/ \____/ \__,_/ \___//_/ \__,_//_/|_| \__, /  
 *                                         /____/  
 *
 *                   2023 LICENCE (JAVA CLASS)
 *
 *    Tento kód spadá pod licenci programátora a autora kódu.
 *                  Více informací najdete na
 *                      www.tvujpartak.cz
 *                       www.codelaky.cz
 *
 *  E-mail: lukas.helebrandt@gmail.com   |    Tel: +420 721 770 063
 * 
 * @author Lukáš Helebrandt
 */
public class DatabazePojistencu {
            // Načtení Scanneru pro uživatelský vstup
            Scanner sc = new Scanner(System.in,"utf-8");
            
            // Vytvoření databáze pojistenců
            public static ArrayList<Osoba> pojistenci = new ArrayList<>();
            
            // Základní deklarace prvků
            private Osoba clovek;
            private String jmeno;
            private String prijmeni;
            private String telefon;
            private int vek;
            String volba = "0";
       
       // Vytvoření metody "PřidatPojistence"
       public void pridatPojistence() {
           // Kontrolní cyklus zadání správné délky jména
           do {
                // Vstup uživatele pro zadání jména
                System.out.println("Zadejte jméno pojistného");
                jmeno = sc.nextLine();
                
                // Kontrola pomocí podmínky
                if(jmeno.length() <= 2) {
                        System.out.println("Jméno je moc krátké!");
                    } 
                
           } while (jmeno.length() <= 2 || jmeno.length() >= 15);
           
                // Vstup uživatele pro zadání příjmení
                System.out.println("Zadejte príjmení");
                prijmeni = sc.nextLine();
           
                // Vstup uživatele pro zadání telefonu
                System.out.println("Zadejte telefonní císlo");
                telefon = sc.nextLine();
                
               
            // Kontrolní cyklus zadání sprévného věku
            do{
                // Vstup uživatele pro zadání věku
                System.out.println("Zadejte vek");
                vek = Integer.parseInt(sc.nextLine());
                // Kontrola pomocí podmínky
                String kontrolaVeku = String.valueOf(vek);
                int delkaVeku = kontrolaVeku.length();
                    if(delkaVeku <= 110) {
                        } else {
                            System.out.println("Moc vysoký věk");
                    }
            } while (vek > 110);
                
            // Základní nastavení pro registraci pojistěné osoby
            clovek = new Osoba(jmeno,prijmeni,telefon, vek);
            pojistenci.add(clovek);
                
                // Podmínka pro uložení dat
                if(clovek.getJmeno() == clovek.getJmeno()){
                
                    System.out.print("\nData byla ulozena. ");
                    
                    } else {
                        System.out.println("\nData nebyla uložena.");
                }
            
            // Přechod na další volbu
            System.out.print("Pokracujte libovolnou klávesou...\n");
            volba = sc.nextLine();
       }
       
       // Vytvoření metody "Zobrazení všech pojistenců"
       public void zobrazitVsechnyPojistence() {
            // Cyklus pro výpis všech pojistenců
            for (Osoba osoby : pojistenci) {       
                System.out.printf("%-10s %-10s %-10d %-10s %n", osoby.getJmeno(), osoby.getPrijmeni(), osoby.getVek(), osoby.getTelefon());
            }
            System.out.println("");
            // Přechod na další volbu
            System.out.print("Pokracujte libovolnou klávesou...\n");
            volba = sc.nextLine();
       }
       
       // Vytvoření metody "Filtr Pojistěnců"
       public void filtrPojistencu()
       {
            // Uživatelský vstup pro filtrování výpisu
            System.out.println("Zadejte jméno pojistného:");
            String jmenoOsoby = sc.nextLine();
            System.out.println("Zadejte příjmení pojistného:");
            String prijmeniOsoby = sc.nextLine();
            System.out.println("");
            
            // Cyklus pro výpis dané osoby
            for (Osoba osoby : pojistenci) {
                // Podmínka pro správný výpis pomocí
                if(jmenoOsoby.contains(osoby.getJmeno()) && prijmeniOsoby.contains(osoby.getPrijmeni())) {
                 System.out.printf("%-10s %-10s %-10d %-10s %n", osoby.getJmeno(), osoby.getPrijmeni(), osoby.getVek(), osoby.getTelefon());              
                }
            }
            System.out.println("");
                
            // Přechod na další volbu
            System.out.print("Pokracujte libovolnou klávesou...\n");
            volba = sc.nextLine();
       }
}
