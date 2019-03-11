
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mariconti_giacomo
 */
public class Parser {
    private List<Oliva> olive;
    String file;
    
    public Parser() {
        olive = new ArrayList();
        file = "";
    }
    public Parser(String file){
        this.file = file;
        olive = new ArrayList();
    }
    
    public void valorizzaLista()
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(file);
        root = document.getDocumentElement();
        
        // generazione della lista degli elementi "docente"
        nodelist = root.getElementsByTagName("row");
        String regione=null;
        int anno=0,codice=0,superficie=0,superficieInProduzione=0,produzioneQuintali=0,odtProduzioneRaccoltaQuintali=0,odtProduzioneQuintali=0,
            odoProduioneQuintali=0,odpResaProduzioneQuintali=0,odpProduzioneQuintali=0;
        if(nodelist != null && nodelist.getLength() > 0){
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                
                NodeList n1 = element.getElementsByTagName("anno");
                if(n1 != null && n1.getLength() > 0){
                        element = (Element)n1.item(0);
                        anno = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                } 
                NodeList n2 = element.getElementsByTagName("codice");
                if(n2 != null && n2.getLength() > 0){
                        element = (Element)n2.item(0);
                        codice = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                } 
                NodeList n3 = element.getElementsByTagName("regioni");
                if(n3 != null && n3.getLength() > 0){
                        element = (Element)n3.item(0);
                        regione = element.getTextContent();
                        //string nome = element.getTextContent();
                }
                NodeList n4 = element.getElementsByTagName("olive_superficie__ha_");
                if(n4 != null && n4.getLength() > 0){
                        element = (Element)n4.item(0);
                        superficie = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                }
                NodeList n5 = element.getElementsByTagName("olive_superficie_in_produzione__ha_");
                if(n5 != null && n5.getLength() > 0){
                        element = (Element)n5.item(0);
                        superficieInProduzione = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                }
                NodeList n6 = element.getElementsByTagName("olive_produzione__quintali_");
                if(n6 != null && n5.getLength() > 0){
                        element = (Element)n6.item(0);
                        produzioneQuintali = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                }
                NodeList n7 = element.getElementsByTagName("olive_da_tavola_produzione_raccolta__quintali_");
                if(n7 != null && n7.getLength() > 0){
                        element = (Element)n7.item(0);
                        odtProduzioneRaccoltaQuintali = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                }
                NodeList n8 = element.getElementsByTagName("olive_da_tavola_produzione__quintali_");
                if(n8 != null && n8.getLength() > 0){
                        element = (Element)n8.item(0);
                        odtProduzioneQuintali = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                }
                NodeList n9 = element.getElementsByTagName("olive_da_olio_produzione__quintali_");
                if(n9 != null && n9.getLength() > 0){
                        element = (Element)n9.item(0);
                        odoProduioneQuintali = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                }
                NodeList n10 = element.getElementsByTagName("olio_di_pressione_resa_di_produzione__quintali_");
                if(n10 != null && n10.getLength() > 0){
                        element = (Element)n10.item(0);
                        odpResaProduzioneQuintali = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                }
                NodeList n11 = element.getElementsByTagName("olio_di_pressione_produzione__quintali_");
                if(n11 != null && n11.getLength() > 0){
                        element = (Element)n11.item(0);
                        odpProduzioneQuintali = Integer.parseInt(element.getTextContent());
                        //string nome = element.getTextContent();
                }
            }
                    Oliva oliva = new Oliva(anno,codice,regione,superficie,superficieInProduzione,produzioneQuintali,odtProduzioneRaccoltaQuintali,odtProduzioneQuintali,odoProduioneQuintali,odpResaProduzioneQuintali,odpProduzioneQuintali);
                    olive.add(oliva);
        }
    }
        
    
    public List<Oliva> vediInfo(int anno,String regione)
        throws ParserConfigurationException, SAXException, IOException {
        List<Oliva> lista = new ArrayList();
        valorizzaLista();
        for(Oliva o : olive){
            if(o.anno==anno){
                 if(o.regione.equals(regione)){
                     lista.add(o);
                }
            }
        }
        return lista;
    }
    
    public int totaleODPproduzione(int anno)
        throws ParserConfigurationException, SAXException, IOException {
        int totale=0;
         valorizzaLista();
         for(Oliva o : olive){
              if(o.anno==anno){
                 totale=totale+o.odpProduzioneQuintali;
              }
         }
         return totale;
    }
}
