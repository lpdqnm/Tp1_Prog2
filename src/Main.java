
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leopold
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IFilePrio<ITachePrio>  fp = creerFP();
        affFilTailVid(fp);
        
        //premier()
        /*try {
            System.out.println("\npremier()\n" + fp.premier());
            fp.vider();
            affFilTailVid(fp);
            System.out.println("\npremier()\n" + fp.premier());
        } catch (FileVideException ex) {
            System.out.println("premier() exp :La file estvide");
        }*/
        
        
        //defiler()
        /*try {
            System.out.println("\ndefiler()\n" + fp.defiler());
            fp.vider();
            affFilTailVid(fp);
            System.out.println("\npremier()\n" + fp.defiler());
        } catch (FileVideException ex) {
            System.out.println("defiler() exp :La file estvide");
        }*/

        //enfiler( e7(5) )
        /*fp.enfiler(new TachePrio(5, "e7"));
        affFilTailVid(fp);*/
        

        //enfiler( e8(7) )
        /*fp.enfiler(new TachePrio(7, "e8"));
        affFilTailVid(fp);*/
        
        //enfiler( e9(2) )
        /*fp.enfiler(new TachePrio(2, "e9"));
        affFilTailVid(fp);*/
        
        //enfiler( null )
//        fp.enfiler(null);
//        affFilTailVid(fp);
        
        //enfiler( null )
//        try {
//            fp.enfiler(null);
//            affFilTailVid(fp);
//        } catch (NullPointerException e) {
//            System.out.println("Pas de null dans cette file prio");
//        }
        
        //sousFilePrio(1)
//        IFilePrio<ITachePrio>  sfp1 = fp.sousFilePrio(1);
//        affFilTailVid(sfp1);
//       //taille(1)/prioriteExiste(1)/premier(1)/defiler(1)/defilerTous(1)
//        System.out.println("taille(1) " + fp.taille(1));
//        System.out.println("prioriteExiste(1) " + fp.prioriteExiste(1));
//       try {
//            System.out.println("premier(1) " + fp.premier(1));
//            //System.out.println("defiler(1) " + fp.defiler(1));
//            System.out.println("defilerTous(1) " + fp.defilerTous(1));
//            affFilTailVid(fp);
//        } catch (FileVideException ex) {
//            System.out.println("premier(1) ex : File vide");
//        }
       
         //sousFilePrio(9)
//        IFilePrio<ITachePrio>  sfp9 = fp.sousFilePrio(9);
//        affFilTailVid(sfp9);
//        //taille(9) /prioriteExiste(9)/premier(9) vs defiler(9)defilerTous(9)
//        System.out.println("taille(9) " + fp.taille(9));
//        System.out.println("prioriteExiste(9) " + fp.prioriteExiste(9));
//        try {
//            System.out.println("premier(9) " + fp.premier(9));
////            System.out.println("defiler(9) " + fp.defiler(9));
//            System.out.println("defilerTous(9) " + fp.defilerTous(9));
//            affFilTailVid(fp);
//        } catch (FileVideException ex) {
//            System.out.println("premier(9) ex : File vide");
//        }
        
        //sousFilePrio(5)
//        IFilePrio<ITachePrio>  sfp5 = fp.sousFilePrio(5);
//        affFilTailVid(sfp5);
//        //taille(5) /prioriteExiste(5)/premier(5)/ defiler(5)/defilerTous(5)
//        System.out.println("taille(5) " + fp.taille(5));
//        System.out.println("prioriteExiste(5) " + fp.prioriteExiste(5));
//        try {
//            System.out.println("premier(5) " + fp.premier(5));
//            //System.out.println("defiler(5) " + fp.defiler(5));
//            System.out.println("defilerTous(5) " + fp.defilerTous(5));
//            affFilTailVid(fp);
//            System.out.println("vider()");
//            fp.vider();
//            //System.out.println("premier(5) " + fp.premier(5));            
//            System.out.println("defilerTous(5) " + fp.defilerTous(5));            
//        } catch (FileVideException ex) {
//            //System.out.println("premier(5) ex : File vide");
//            System.out.println("defilerTous(5) ex : File vide");
//        }

//        affFilTailVid(fp);
        
            IFilePrio<ITachePrio>  fp1 = creerFP1();
            IFilePrio<ITachePrio>  fp2 = new FilePrio<>();
//            affFilTailVid(fp1);
//            affFilTailVid(fp2);
//            
            //enfilerTous( fp1 )
//            System.out.println("\nenfilerTous(fp1)");
//            fp.enfilerTous(fp1);
//            affFilTailVid(fp);
//            affFilTailVid(fp1);

           //enfilerTous( null )
//            System.out.println("\nenfilerTous(null)");
//            fp.enfilerTous(null);
//            affFilTailVid(fp);
//            
            //enfilerTous( null )
//            System.out.println("\nenfilerTous(null) avec try - catch");
//            try {
//                fp.enfilerTous(null);
//            } catch (Exception e) {
//                System.out.println("La file est null");
//            }
//            affFilTailVid(fp);

            //enfilerTous( 5,null )
            System.out.println("\nenfilerTous(5,null) avec try - catch");
            try {
                fp.enfilerTous(5,null);
            } catch (Exception e) {
                System.out.println("La file est null");
            }
            affFilTailVid(fp);


            //enfilerTous( 5,fp1 )
//            System.out.println("\nenfilerTous(5,fp1)");
//            fp.enfilerTous(5,fp1);
//            affFilTailVid(fp);
//            affFilTailVid(fp1);
            
            //enfilerTous( 1,fp1 )
//            System.out.println("\nenfilerTous(1,fp1)");
//            fp.enfilerTous(1,fp1);
//            affFilTailVid(fp);
//            affFilTailVid(fp1);

            //enfilerTous( fp2 )
//            System.out.println("\nenfilerTous(fp2)");
//            fp.enfilerTous(fp2);
//            affFilTailVid(fp);
//            affFilTailVid(fp2);

           //enfilerTous( 5 ,fp2 )
//            System.out.println("\nenfilerTous(5 ,fp2)");
//            fp.enfilerTous(5 ,fp2);
//            affFilTailVid(fp);
//            affFilTailVid(fp2);

    }
    
    public static IFilePrio<ITachePrio> creerFP() {
        IFilePrio<ITachePrio>  fp = new FilePrio<ITachePrio>();
        
        fp.enfiler(new TachePrio(9, "e1"));
        fp.enfiler(new TachePrio(9, "e2"));
        fp.enfiler(new TachePrio(5, "e3"));
        fp.enfiler(new TachePrio(5, "e4"));
        fp.enfiler(new TachePrio(5, "e5"));
        fp.enfiler(new TachePrio(3, "e6"));

        return fp;
    }

    public static IFilePrio<ITachePrio> creerFP1() {
        IFilePrio<ITachePrio>  fp = new FilePrio<ITachePrio>();
        
        fp.enfiler(new TachePrio(5, "e7"));
        fp.enfiler(new TachePrio(5, "e10"));
        fp.enfiler(new TachePrio(2, "e8"));

        return fp;
    }
    
    public static void affFilTailVid(IFilePrio<ITachePrio>  fp){
        System.out.println("\nFP\n" + fp 
                + "\ntaille() " + fp.taille()
                + " estVide() " + fp.estVide());
    }
    
}
