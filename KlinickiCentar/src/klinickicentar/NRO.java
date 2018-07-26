
package klinickicentar;

public class NRO extends KlinickiCentar{
    NRO (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Neurologija se nalazi na prizemlju.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Neurologija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Miroljub Nikolić";
        this.radnoVreme="\nOrdinacija radi od 9:00h do 18:00h.";
    }
    NRO(){};
    
    public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}

