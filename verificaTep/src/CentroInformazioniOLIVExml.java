
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mariconti_giacomo
 */
public class CentroInformazioniOLIVExml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        InputStreamReader reader = new InputStreamReader (System.in);
        BufferedReader myInput = new BufferedReader (reader);
        List<Oliva> lista = null;
        Parser dom = new Parser("filaAxml.xml");
        System.out.println("1)vedi tutte le info 2)vedi totale olio pressione produzione 3)vedi regione campione per olive da tavola produzione raccolta 4)vedi regione campione olive superficie in produzione");
        int opzione = tastiera.nextInt();
        try{
            switch(opzione){
                case 1:
                    System.out.println("inserisci anno e regione");
                    int anno = tastiera.nextInt();
                    String regione = tastiera.next();
                    lista = dom.vediInfo(anno,regione);
                    for(Oliva oliva : lista){
                        System.out.println(oliva.getAnno());
                        System.out.println(oliva.getCodice());
                        System.out.println(oliva.getRegione());
                        System.out.println(oliva.getSuperficie());
                        System.out.println(oliva.getSuperficieInProduzione());
                        System.out.println(oliva.getProduzioneQuintali());
                        System.out.println(oliva.getOdtProduzioneRaccoltaQuintali());
                        System.out.println(oliva.getOdtProduzioneQuintali());
                        System.out.println(oliva.getOdoProduioneQuintali());
                        System.out.println(oliva.getOdpResaProduzioneQuintali());
                        System.out.println(oliva.getOdpProduzioneQuintali());
                    }
                    break;
                case 2:
                     System.out.println("inserisci anno");
                     int anno1 = tastiera.nextInt();
                     int totale=dom.totaleODPproduzione(anno1);
                     System.out.println("totale");
                     break;
                case 3:
                     
                     break;
            }
        }
        catch(Exception e){
            e.getMessage();
        }
    }
    
}
