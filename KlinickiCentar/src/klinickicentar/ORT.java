
package klinickicentar;

public class ORT extends KlinickiCentar{
    ORT (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara,radnoVreme);
        this.sprat = "\n-Ortopedija se nalazi na petom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Ortopedija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Kristina Mitić";
        this.radnoVreme="\nOrdinacija radi od 8:00h do 14:00h.";
    }
  
    
    public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}
