
package klinickicentar;

public class GH extends KlinickiCentar{
    GH (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Grudna hirurgija se nalazi na četvrtom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Grudna hirurgija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Marko Tomović";
        this.radnoVreme="\nOdeljenje radi od 9:00h do 15:00h.";
    }
    GH(){};
    
     public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}

