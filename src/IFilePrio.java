
/**
 * Iterface definissant le TDA File de priorite.
 * Voir la description de ce TDA dans l'enonce du TP1.
 * 
 * @author Melanie Lord
 * @param <T> le type des elements dans cette file de priorite. Les elements
 *            doivente implementer l'interface ITachePrio.
 */
public interface IFilePrio <T extends ITachePrio> {

   /**
    * Enfile l'element (non null) dans cette file de priorite.
    * 
    * Exemples : 
    *    Soit la file de priorite suivante : 
    *       tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    *    - l'appel de enfiler(e7(5)) donne la file : 
    *          tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e7(5), e6(3) ] fin
    * 
    *    - l'appel de enfiler(e8(7)) donne la file : 
    *          tete [ e1(9), e2(9), e8(7), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    * @param element l'element a enfiler dans cette file de priorite.
    * @throws NullPointerException si l'element donne en parametre est null.
    */
   void enfiler(T element);
   
   /**
    * Enfile les elements de la file de priorite donnee en parametre, dans 
    * cette file de priorite. L'ordre d'enfilement des elements dans la file
    * de priorite donnee en parametre doit etre respecte lorsqu'ils sont enfiles
    * dans cette file de priorite. Apres l'appel de cette methode, la file de 
    * priorite donnee en parametre ne doit pas avoir ete modifiee.
    * 
    * Exemple : 
    *    Soit la file de priorite suivante : 
    *       tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    *    - l'appel de enfiler(tete [ e7(5), e10(5), e8(2) ] fin) donne la file : 
    *         tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e7(5), e10(5), e6(3), e8(2) ] fin
    * 
    * @param filePrio la file de priorite dont les elements sont a ajouter dans
    *        cette file de priorite.
    * @throws NullPointerException si le parametre filePrio null.
    */
   void enfilerTous(IFilePrio<T> filePrio);  
   
   /**
    * Enfile les elements de la file de priorite donnee en parametre ET qui ont
    * la priorite donnee, dans cette file de priorite. L'ordre d'enfilement des 
    * elements dans la file de priorite donnee en parametre doit etre respecte 
    * lorsqu'ils sont enfiles dans cette file de priorite. Apres l'appel de cette 
    * methode, la file de priorite donnee en parametre ne doit pas avoir ete 
    * modifiee. Si aucun element de la priorite donne n'existe dans la file de
    * priorite donnee, cette file de priorite demeure inchangee.
    * 
    * Exemples : 
    *    Soit la file de priorite suivante : 
    *       tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    *    - l'appel de enfiler(5, tete [ e7(5), e10(5), e8(2) ] fin) donne la file : 
    *         tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e7(5), e10(5), e6(3) ] fin
    * 
    *    - l'appel de enfiler(2, tete [ e7(5), e10(5), e8(2) ] fin) donne la file : 
    *         tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e6(3), e8(2) ] fin
    * 
    *    - l'appel de enfiler(6, tete [ e7(5), e10(5), e8(2) ] fin) laisse la file
    *      inchangee.
    * 
    * 
    * @param priorite la priorite des elements a enfiler dans cette file de 
    *                 priorite.
    * @param filePrio la file de priorite dont certains elements sont a ajouter 
    *                 dans cette file de priorite.
    * @throws NullPointerException si le parametre filePrio est null.
    */
   void enfilerTous(int priorite, IFilePrio<T> filePrio);

   /**
    * Defile l'element le plus prioritaire (premier arrivee de la plus grande 
    * priorite) de cette file de priorite.
    * 
    * Exemple : 
    *    Soit la file de priorite suivante : 
    *       tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    *    - l'appel de defiler() retourne e1(9), et la file resultante est : 
    *         tete [ e2(9), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    * @return l'element defile.
    * @throws FileVideException si cette file de priorite est vide avant l'appel 
    *         de cette methode.
    */
   T defiler() throws FileVideException;
   
   /**
    * Defile l'element le plus prioritaire de la priorite donnee en parametre. 
    * Si aucun element de la priorite donnee n'existe dans cette file de priorite, 
    * la methode retourne null et cette file de priorite n'est pas modifiee.
    * 
    * Exemples : 
    *    Soit la file de priorite suivante : 
    *       tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    *    - l'appel de defiler(5) retourne e3(5), et la file resultante est : 
    *         tete [ e1(9), e2(9), e4(5), e5(5), e6(3) ] fin
    * 
    *    - l'appel de defiler(9) retourne e1(9), et la file resultante est : 
    *         tete [ e2(9), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    *    - l'appel de defiler(4) retourne null, et la file reste inchangee. 
    * 
    * @param priorite la priorite de l'element a defiler.
    * @return l'element defile ou null si aucun element de la priorite donnee
    *         en parametre n'existe dans cette file de priorite.
    * @throws FileVideException si cette file de priorite est vide avant qu'on 
    *         ne tente de defiler l'element. 
    */
   T defiler(int priorite) throws FileVideException;
   
   /**
    * Defile tous les elements de la priorite donnee. Si aucun element de cette
    * priorite n'existe dans cette file de priorite, celle-ci n'est pas modifiee.
    * La methode retourne une file de priorite contenant tous les elements 
    * defiles, dans le meme ordre que lorsqu'ils se trouvaient dans cette file
    * de priorite. Si aucun element n'est defile, la file retournee est vide.
    * 
    * Exemples : 
    *    Soit la file de priorite suivante : 
    *       tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    *    - l'appel de defilerTous(5) retourne la file suivante : 
    *          tete [ e3(5), e4(5), e5(5) ] fin
    * 
    *          et la file resultante modifiee est : 
    *          tete [ e1(9), e2(9), e6(3) ] fin
    * 
    *    - l'appel de defilerTous(4) retourne une file vide et la file resultante
    *      reste inchangee.
    * 
    * @param priorite la priorite des elements a defiler de cette file de 
    *                 priorite.
    * @return Une file de priorite contenant tous les elements defiles, dans 
    *         le meme ordre.
    * @throws FileVideException si cette file de priorite est vide avant
    *         l'appel de cette methode.
    */
   IFilePrio<T> defilerTous(int priorite) throws FileVideException;
   
   /**
    * Verifie si cette file de priorite contient au moins un element ayant la 
    * priorite donnee en parametre.
    * @param priorite la priorite dont on veut verifier l'existence dans cette
    *                 file de priorite.
    * @return true si au moins un element ayant la priorite donnee en parametre
    *         existe dans cette file de priorite, false sinon.
    */
   boolean prioriteExiste(int priorite);
   
   /**
    * Verifie si cette file de priorite contient des elements ou non.
    * @return true si cette file de priorite ne contient aucun element, false
    *         sinon.
    */
   boolean estVide();
   
   /**
    * Permet d'obtenir le nombre d'elements contenus dans cette file de priorite.
    * @return le nombre d'elements dans cette file de priorite.
    */
   int taille();
   
   /**
    * Permet d'obtenir le nombre d'elements ayant la priorite donnee en parametre
    * qui sont contenus dans cette file de priorite.
    * @param priorite la priorite des elements dont on veut le nombre.
    * @return le nombre d'elements ayant la priorite donnee en parametre qui sont 
    *         contenus dans cette file de priorite.
    */
   int taille(int priorite);
   
   /**
    * Permet de consulter l'element en tete de cette file de priorite, sans 
    * modifier celle-ci. L'element en tete de file est toujours l'element 
    * le plus ancien parmis ceux ayant la priorite la plus forte.
    * @return l'element en tete de cette file de priorite.
    * @throws FileVideException si cette file de priorite est vide avant l'appel
    *         de cette methode.
    */
   T premier() throws FileVideException;
   
   /**
    * Permet de consulter l'element le plus prioritaire de la priorite donnee
    * en parametre, sans modifier cette file de priorite. Si aucun element 
    * de la priorite donnee existe dans cette file de priorite, la methode 
    * retourne null.
    * @param priorite la priorite de l'element le plus prioritaire que l'on veut
    *                 consulter.
    * @return l'element le plus prioritaire de la priorite donnee en parametre.
    * @throws FileVideException si cette file de priorite est vide avant l'appel
    *         de cette methode.
    */
   T premier(int priorite) throws FileVideException;
   
   /**
    * Retire tous les elements de cette file de priorite. Apres l'appel de cette
    * methode, l'appel de la methode estVide() retourne true.
    */
   void vider();  
 
   /**
    * Retourne une file de priorite contenant tous les elements ayant la priorite 
    * donnee en parametre se trouvant dans cette file de priorite. Les elements
    * dans la file de priorite a retourner doivent conserver l'ordre dans lequel
    * ils apparaissent dans cette file de priorite. Apres l'appel de cette methode,
    * cette file de priorite ne doit pas avoir ete modifiee. De plus, si aucun 
    * element ayant la priorite donnee ne se trouve dans cette file de priorite,
    * la methode retourne une file de priorite vide.
    * 
    * Exemples : 
    *    Soit la file de priorite suivante : 
    *       tete [ e1(9), e2(9), e3(5), e4(5), e5(5), e6(3) ] fin
    * 
    *    - l'appel de sousFilePrio(5) retourne la file suivante : 
    *          tete [ e3(5), e4(5), e5(5) ] fin
    * 
    *    - l'appel de sousFilePrio(4) retourne une file vide
    * 
    * @param priorite la priorite des elements de la file de priorite a retourner.
    * @return une file de priorite contenant tous les elements ayant la priorite 
    *         donnee en parametre se trouvant dans cette file de priorite.
    */
   IFilePrio<T> sousFilePrio(int priorite);
    
}
