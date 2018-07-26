
package klinickicentar;

public class LH extends KlinickiCentar{
    LH (String sprat, String imeOdeljenja, String imeGlvnogLekara,String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Laserska hirurgija se nalazi na šestom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Laserska hirurgija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Mirjana Tošić";
        this.radnoVreme= "\nOrdinacija radi od 12:00h do 16:30h.";
    }
    LH(){};
    
    public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}
