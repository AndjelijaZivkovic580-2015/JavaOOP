
package klinickicentar;

public class OFT extends KlinickiCentar{
    OFT (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Oftamologija se nalazi na sedmom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Oftamologija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Lazar Tomić";
        this.radnoVreme="\nOrdinacija radi od 13:00h do 18:00h.";
    }
    OFT(){};
    
    public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}
