package klinickicentar;
import java.util.Scanner;

public class NacinRada {
    
    NacinRada (){};
       
public void metodaRada(){
  
    KlinickiCentar kc = new KlinickiCentar();
    
    Scanner in= new Scanner(System.in);
    
    System.out.println ("Dobro došli na InfoKC.\nMolimo Vas da pažljivo pratite "
            + "sledeće korake koji će vam pomoći radi lakšeg i efikasnijeg snalaženja\nu "
            + "našem kliničkom centru.\n" );

    System.out.println ("-Za unošenje broja odeljenja i nivoa hitnosti koje vam je "
            + "lekar opšte prakse dodelio na uputu izaberite Opciju 1.");
    System.out.println ( "-Za dodatne informacije o odeljenju izaberite Opciju 2.");  
    
int i = in.nextInt();

if(i==1){   
    
    System.out.println ("\nIzabrali ste "+kc.odeljenje()+"."+"\nVaš broj hitnosti je "+kc.hitnost());
} 
else if(i==2){
    System.out.println ("\nUnesite broj za koje odeljenje želite dodatnu informaciju (broj od 1 do 15):");
    int i1 = in.nextInt();
    
        switch (i1) {
            case 1:  UGC ug = new UGC("1","2","3","4");
            System.out.print (ug.info());
            System.out.println("\n");
                     break;
            case 2:  ONK on = new ONK("1","2","3","4");
            System.out.print (on.info());
            System.out.println("\n");
                     break;
            case 3:  NRO nr = new NRO("1","2","3","4");
            System.out.print (nr.info());
            System.out.println("\n");
                     break;
            case 4:  URL ur = new URL("1","2","3","4");
            System.out.print (ur.info());
            System.out.println("\n");
                     break;
            case 5:  GAKP gp = new GAKP("1","2","3","4");
            System.out.print (gp.info());
            System.out.println("\n");
                     break;
            case 6:  GAKG gg = new GAKG("1","2","3","4");
            System.out.print (gg.info());
            System.out.println("\n");
                     break;
            case 7:  GH gh = new GH("1","2","3","4");
            System.out.print (gh.info());
            System.out.println("\n");
                     break;
            case 8:  OPH oh = new OPH("1","2","3","4");
            System.out.print (oh.info());
            System.out.println("\n");
                     break;
            case 9:  VH vh = new VH("1","2","3","4");
            System.out.print (vh.info());
            System.out.println("\n");
                     break;
            case 10:  NH nh = new NH("1","2","3","4");
            System.out.print (nh.info());
            System.out.println("\n");
                     break;
            case 11:  PH ph = new PH("1","2","3","4");
            System.out.print (ph.info());
            System.out.println("\n");
                     break;
            case 12:  LH lh = new LH("1","2","3","4");
            System.out.print (lh.info());
            System.out.println("\n");
                     break;
            case 13:  ORT ort = new ORT("1","2","3","4");
            System.out.print (ort.info());
            System.out.println("\n");
                     break;
            case 14:  OFT oft = new OFT("1","2","3","4");
            System.out.print (oft.info());
            System.out.println("\n");
                     break;
            case 15:  MAKS m = new MAKS("1","2","3","4");
            System.out.print (m.info());
            System.out.println("\n");
                     break;
            default:
            System.out.println("\nIzabrali ste nepostojeći broj iz Opcije 2."
                    + " Molimo Vas pokušajte ponovo.\n");
                     break;
        }                            
        }
else{
    System.out.println ("\nUneli ste nepostojeću opciju. Molimo Vas, pokušajte ponovo.\n");
}
    }

}





