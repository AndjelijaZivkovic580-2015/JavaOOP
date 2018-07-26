
package klinickicentar;

public class NH extends KlinickiCentar{
    NH (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Neurohirurgija se nalayi na šestom spratu.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Neurohirurgija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Miroslav Ranković";
        this.radnoVreme="\n Ordinacija radi od 9:00h do 15:00h i od 17:00h do 19:00h.";
    }
    NH(){};
    
     public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}

