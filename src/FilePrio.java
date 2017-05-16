
import java.util.ArrayList;
/**
 *
  * Classe qui implémente l'interface IFilePrio
 * @author Leopold, Quenum
 * code permanent : QUEL16107105
 * @version hiver 2017
 * @param <T> le type des elements dans cette file de priorite. Les elements
 */
public class FilePrio<T extends ITachePrio> implements IFilePrio<T> {

    //Attribut d'instance
    private ArrayList<T> elements;

    /**
     *Constructeur sans parametres qui initialise l'attribut d'instance
     * elements à une liste vide
     */
    public FilePrio() {
        elements = new ArrayList<>();
    }
    
    @Override
    public void enfiler(T element) {
        int i = 0;
        boolean insererElem = false;
        
        lanceExceptNullPointer(element);
        
        if (estVide()) {
            elements.add(element);
        } else {
            while (i < elements.size() && !insererElem) {                
                if (element.getPriorite() <= elements.get(i).getPriorite()) {
                    i++;
                } else {
                    insererElem = true;
                }
            }
            elements.add(i, element);
        }
    }

    @Override
    public void enfilerTous(IFilePrio<T> filePrio) {
        IFilePrio<T> filePrioSauvegarde = new FilePrio<T>();
        T elemDefile = null;
        
        lanceExceptNullPointer(filePrio);
        
        while (!filePrio.estVide()) {
            try {
                elemDefile = filePrio.defiler();
            } catch (FileVideException ex) {
                
            }
            enfiler(elemDefile);
            filePrioSauvegarde.enfiler(elemDefile);
        }
        
        while (!filePrioSauvegarde.estVide()) {            
            try {
                filePrio.enfiler(filePrioSauvegarde.defiler());
            } catch (FileVideException ex) {
                
            }
        }     
    }

    @Override
    public void enfilerTous(int priorite, IFilePrio<T> filePrio) {
        enfilerTous(filePrio.sousFilePrio(priorite));
        
    }

    @Override
    public T defiler() throws FileVideException {
        lanceExceptFileVide();
        return elements.remove(0);
    }

    @Override
    public T defiler(int priorite) throws FileVideException {
        T elemPrioDefile = premier(priorite);
        
        if (prioriteExiste(priorite)) {
            elements.remove(premier(priorite));
        }
        return elemPrioDefile;
    }

    @Override
    public IFilePrio<T> defilerTous(int priorite) throws FileVideException {
        IFilePrio<T> ssFilePrioDefilee = new FilePrio<>();
        
        lanceExceptFileVide();
        
        while (prioriteExiste(priorite)) {            
            ssFilePrioDefilee.enfiler(defiler(priorite));
        }
        return ssFilePrioDefilee;
    }

    @Override
    public boolean prioriteExiste(int priorite) {
        return taille(priorite) != 0;
    }

    @Override
    public boolean estVide() {
        return elements.isEmpty();
    }

    @Override
    public int taille() {
        return elements.size();
    }

    @Override
    public int taille(int priorite) {
        return sousFilePrio(priorite).taille();
    }

    @Override
    public T premier() throws FileVideException {
        lanceExceptFileVide();
        return elements.get(0);
    }

    @Override
    public T premier(int priorite) throws FileVideException {
        T premPrio = null;
        
        lanceExceptFileVide();
        
        if (prioriteExiste(priorite)) {
            premPrio = sousFilePrio(priorite).premier();
        }
        return premPrio;
    }

    @Override
    public void vider() {
        elements.clear();
    }

    @Override
    public IFilePrio<T> sousFilePrio(int priorite) {
        IFilePrio<T> ssFilePrio = new FilePrio<T>();
        
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getPriorite() == priorite) {
                ssFilePrio.enfiler(elements.get(i));
            }
        }
        return ssFilePrio;
    }
    
    /**
     * Construit une representation sous forme de chaine de caracteres de cette
     * file de priorite.
     * @return une representation sous forme de chaine de caracteres de cette
     *         file de priorite.
     */
    @Override
    public String toString() {
            return "tete " + elements.toString() + " fin";
    }
    
    private void lanceExceptFileVide() throws FileVideException {
        if (estVide()) {
            throw new FileVideException();
        }
    }
    
    private void lanceExceptNullPointer(Object obj){
        if (obj == null) {
            throw new NullPointerException();
        }
    }
    
}
