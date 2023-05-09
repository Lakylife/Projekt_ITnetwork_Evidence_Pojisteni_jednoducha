/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.evidencepojisteni;
import java.util.Scanner;
/**
 *
 * @author imac-lukashelebrandt
 */
public class EvidencePojisteni {
    
    public static void vypisFunkci(){
    
        System.out.println("-------------------------------");
        System.out.println("Evidence pojistenych");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Pridat nového pojisteného");
        System.out.println("2 - Vypsat vsechny pojistené");
        System.out.println("3 - Vyhledat pojisteného");
        System.out.println("4 - Konec");
    
    }

    public static void main(String[] args) {  
        
        // Načtení Scanneru pro uživatelský vstup
        Scanner sc = new Scanner(System.in,"utf-8");
        
        // Načtení metod
        DatabazePojistencu data = new DatabazePojistencu();
        String volbaFunkce = "0";
        
         // Hlavní cyklus
        while (!(volbaFunkce.equals("4"))) {
            
            // Výpis funkcí evidence
            vypisFunkci();

            // Výběr volby
            volbaFunkce = sc.nextLine();
            System.out.println("");
        
            // Reakce na volbu
            switch(volbaFunkce) {
                case "1":
                    data.pridatPojistence();
                    break;
                case "2":   
                    data.zobrazitVsechnyPojistence();
                    break;
                case "3":
                    data.filtrPojistencu();
                    break;
            }
        }  
    }
}
