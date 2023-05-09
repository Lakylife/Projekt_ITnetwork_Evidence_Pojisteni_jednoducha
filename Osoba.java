/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cz.itnetwork.evidencepojisteni;
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
public class Osoba {
    
        // Deklarace základných proměných 
        private String jmeno;
        private String prijmeni;
        private String telefon;
        private int vek;
   
    
        /** Vytvoření nového pojištěnce do evidence pojištěných */    
        public Osoba(String jmeno, String prijmeni, String telefon, int vek) {
                this.jmeno = jmeno;
                this.prijmeni = prijmeni;
                this.telefon = telefon;
                this.vek = vek;
        }
    

       /**
        * @return the jmeno
        */
       public String getJmeno() {
           return jmeno;
       }

       /**
        * @return the prijmeni
        */
       public String getPrijmeni() {
           return prijmeni;
       }

       /**
        * @return the telefon
        */
       public String getTelefon() {
           return telefon;
       }

       /**
        * @return the datumNarozeni
        */
       public int getVek() {
           return vek;
       }

}
