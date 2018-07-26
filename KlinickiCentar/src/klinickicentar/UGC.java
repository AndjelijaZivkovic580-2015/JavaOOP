
package klinickicentar;

public class UGC extends KlinickiCentar{
UGC (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Urgentni centar se nalazi na prizemlju.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Urgentni centar";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Nikola Savićević";
        this.radnoVreme="\nOrdinacija je dostupna ceo dan.";
    }
    UGC(){};
    
   public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}




