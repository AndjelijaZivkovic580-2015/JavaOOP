
package klinickicentar;

public class PH extends KlinickiCentar{
    PH (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Plastična hirurgija se nalazi na šestom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Plastična hirurgija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Bogdan Lazarević";
        this.radnoVreme="\nOrdinacija radi od 8:00h do 12:00h i od 14:00h do 17:00h. ";
    }
    PH(){};
    
    public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}