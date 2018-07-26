
package klinickicentar;


public class ONK extends KlinickiCentar{
    ONK (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme){
        super(sprat,imeOdeljenja,imeGlvnogLekara, radnoVreme);
        this.sprat = "\n-Onkologija se nalazi na prizemlju.";
        this.imeOdeljenja = "\n-Izabrali ste odeljenje: Onkologija";
        this.imeGlvnogLekara = "\n-Ime glavnog lekara:\ndr. Aleksandar Cvetanović";
        this.radnoVreme="\nOrdinacija radi od 12:00h do 15:00h i od 17:00h do 19:00h";
    }
    ONK(){};
    
    public String info(){
        String s = this.sprat;
        String o = this.imeOdeljenja;
        String i = this.imeGlvnogLekara;
        String r = this.radnoVreme;
     return (o+s+i+r); 
     }}
    

