
import java.util.*;

public class CreateAccount {

    public static void main(String[] args) {
    	
    	// Créer les instances des classes.
        AccountMain account1 = new AccountMain();
        AccountMain account2 = new AccountMain();
        
        // Initialiser les différentes valeurs.
        account1.setTitulaire("Pierre");
        account1.setSolde(2000d); // Le d minuscule spécifie le double.
        account1.setNumeroCompte(25678801);
        
        account2.setTitulaire("Aurélia");
        account2.setSolde(2000d);
        account2.setNumeroCompte(46777902);
        
        // Appeler les méthodes.
        account1.retirerArgent(200);
        account2.retirerArgent(150);
    }
    
}