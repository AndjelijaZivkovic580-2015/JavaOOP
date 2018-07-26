
package klinickicentar;

public class GAKP extends KlinickiCentar{
    GAKP (String sprat, String imeOdeljenja, String imeGlvnogLekara,String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Porodilište se nalazi na drugom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Porodilište";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Lidija Nenadović";
        this.radnoVreme="\nOrdinacija je dostupna ceo dan.";
    }
    GAKP(){};
    
     public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}


