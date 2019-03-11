/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mariconti_giacomo
 */
//odt=olive da tavola    odo=olive da olio     odp=olio di pressione
public class Oliva {
    int anno,codice,superficie,superficieInProduzione,produzioneQuintali,odtProduzioneRaccoltaQuintali,odtProduzioneQuintali,
            odoProduioneQuintali,odpResaProduzioneQuintali,odpProduzioneQuintali;
    String regione;

    public Oliva(int anno, int codice,String regione, int superficie, int superficieInProduzione, int produzioneQuintali, int odtProduzioneRaccoltaQuintali, int odtProduzioneQuintali, int odoProduioneQuintali, int odpResaProduzioneQuintali, int odpProduzioneQuintali) {
        this.anno = anno;
        this.codice = codice;
        this.regione = regione;
        this.superficie = superficie;
        this.superficieInProduzione = superficieInProduzione;
        this.produzioneQuintali = produzioneQuintali;
        this.odtProduzioneRaccoltaQuintali = odtProduzioneRaccoltaQuintali;
        this.odtProduzioneQuintali = odtProduzioneQuintali;
        this.odoProduioneQuintali = odoProduioneQuintali;
        this.odpResaProduzioneQuintali = odpResaProduzioneQuintali;
        this.odpProduzioneQuintali = odpProduzioneQuintali;
    }
    public Oliva(){
        
    }
    
    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }
    
    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getSuperficieInProduzione() {
        return superficieInProduzione;
    }

    public void setSuperficieInProduzione(int superficieInProduzione) {
        this.superficieInProduzione = superficieInProduzione;
    }

    public int getProduzioneQuintali() {
        return produzioneQuintali;
    }

    public void setProduzioneQuintali(int produzioneQuintali) {
        this.produzioneQuintali = produzioneQuintali;
    }

    public int getOdtProduzioneRaccoltaQuintali() {
        return odtProduzioneRaccoltaQuintali;
    }

    public void setOdtProduzioneRaccoltaQuintali(int odtProduzioneRaccoltaQuintali) {
        this.odtProduzioneRaccoltaQuintali = odtProduzioneRaccoltaQuintali;
    }

    public int getOdtProduzioneQuintali() {
        return odtProduzioneQuintali;
    }

    public void setOdtProduzioneQuintali(int odtProduzioneQuintali) {
        this.odtProduzioneQuintali = odtProduzioneQuintali;
    }

    public int getOdoProduioneQuintali() {
        return odoProduioneQuintali;
    }

    public void setOdoProduioneQuintali(int odoProduioneQuintali) {
        this.odoProduioneQuintali = odoProduioneQuintali;
    }

    public int getOdpResaProduzioneQuintali() {
        return odpResaProduzioneQuintali;
    }

    public void setOdpResaProduzioneQuintali(int odpResaProduzioneQuintali) {
        this.odpResaProduzioneQuintali = odpResaProduzioneQuintali;
    }

    public int getOdpProduzioneQuintali() {
        return odpProduzioneQuintali;
    }

    public void setOdpProduzioneQuintali(int odpProduzioneQuintali) {
        this.odpProduzioneQuintali = odpProduzioneQuintali;
    }
    
}
