
package klinickicentar;

public class MAKS extends KlinickiCentar{
    MAKS (String sprat, String imeOdeljenja, String imeGlvnogLekara,String radnoVreme ){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Maksiofacialna hirurgija se nalazi na sedmom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Maksiofacialna hirurgija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. dr. Milica Simić";
        this.radnoVreme="\nOrdinacija radi od 11:00h do 16:30h.";
    }
    MAKS(){};
    
     public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}

