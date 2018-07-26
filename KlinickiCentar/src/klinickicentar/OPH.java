
package klinickicentar;

public class OPH extends KlinickiCentar{
    OPH (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Opšta hirurgija se nalazi na četvrtom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Opšta hirurgija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Zorana Pantić";
        this.radnoVreme="\nOrdinacija radi od 8:00h do 15:00h.";
    }
    OPH(){};
    
    public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}

