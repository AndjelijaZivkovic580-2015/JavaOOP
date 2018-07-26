
package klinickicentar;

public class GAKG extends KlinickiCentar{
    GAKG (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Ginekološko odeljenje se nalazi na trećem spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Ginekologija.";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara: dr. Nikola Lazić";
        this.radnoVreme = "\nOrdinacija radi od 8:00h do 13:00h.";
    }
    GAKG(){};
    
     public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}


