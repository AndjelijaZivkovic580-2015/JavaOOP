
package klinickicentar;

public class VH extends KlinickiCentar{
    VH (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara,radnoVreme);
        this.sprat = "\n-Vaskularna hirurgija se nalazi na šestom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Vaskularna hirurgija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Nikola Marić";
        this.radnoVreme="\nOrdinacija radi od 9:00h do 15:00h.";
    }
    VH(){};
    
    public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}

