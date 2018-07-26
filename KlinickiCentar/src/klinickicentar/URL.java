
package klinickicentar;

public class URL extends KlinickiCentar{
    URL (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Urologija se nalazi na prizemlju.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Urologija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Marija Tadić";
        this.radnoVreme="\nOrdinacija radi od 9:00h do 16:00h.";
    }
    URL(){};
    
    public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}


