package klinickicentar;

import java.util.Scanner;

public class KlinickiCentar{
    public String sprat;
    public String imeOdeljenja;
    public String imeGlvnogLekara;
    public String radnoVreme;
   
    
    public String hitnost(){    //metoda hitnosti
        
        String[] hitnost;
        hitnost = new String[3];
        
        hitnost[0] = "mali: Idite na šalter radi zakazivanja vašeg pregleda.\n"; //mala hitnost
        hitnost[1] = "srednji: Javite se na šalter radi što bržeg zakazivanja termina pregleda.\n"; //srednja hitnost
        hitnost[2] = "veliki: Hitno se javite na šalter, bićete odmah primljeni i pregledani.\n";    //velika hitnost
        
        Scanner in= new Scanner(System.in);

        System.out.print ("\nUnesite broj hitnosti koji vam je lekar opšte prakse dodelio na uputu (broj od 1 do 3): \n");
        int h = in.nextInt();
        if (h<4 && h!=0){return (hitnost[h-1]);}
        else {
        return "pogresno unet. Molimo Vas pokušajte ponovo.\n";}
        
    }
    
    public String odeljenje(){   //metoda odeljenje
        
        String[] odeljenje;
        odeljenje = new String[15];
        
        odeljenje[0] = "odeljenje: Urgentni centar";
        odeljenje[1] = "odeljenje: Onkologija";
        odeljenje[2] = "odeljenje: Neurologija";
        odeljenje[3] = "odeljenje: Urologija";
        odeljenje[4] = "odeljenje: Porodilište";
        odeljenje[5] = "odeljenje: Ginekologija";
        odeljenje[6] = "odeljenje: Grudna hirurgija";
        odeljenje[7] = "odeljenje: Opšta hirurgija";
        odeljenje[8] = "odeljenje: Vaskularna hirurgija";
        odeljenje[9] = "odeljenje: Neurohirurgija";
        odeljenje[10] = "odeljenje: Plastična hirurgija";
        odeljenje[11] = "odeljenje: Laserska hirurgija";
        odeljenje[12] = "odeljenje: Ortopedija";
        odeljenje[13] = "odeljenje: Oftamologija";
        odeljenje[14] = "odeljenje: Maksiofacialna hirurgija";
        
        Scanner in= new Scanner(System.in);
        System.out.println ("\nUnesite broj odeljenja koji vam je lekar opšte prakse dodelio na uputu (broj od 1 do 15): ");
        int o = in.nextInt();
        if (o<16 && o!=0) {
            return (odeljenje[o-1]) ;
                   }
        else {
        return "pogrešan broj odeljenja. Molimo vas pokušajte ponovo";}
    }
    
KlinickiCentar (String sprat, String imeOdeljenja, String imeGlvnogLekara, String radnoVreme) {
    this.sprat = "s";
    this.imeOdeljenja = "io";
    this.imeGlvnogLekara = "il";  //Konstruktor za pozivanje podklasa
    this.radnoVreme = "rv";
};

KlinickiCentar(){};   //Prazan konstruktor





}

