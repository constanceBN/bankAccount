
import java.util.*;

public class AccountMain extends Account {

    public void retirerArgent(double retrait) {
    	System.out.println(getTitulaire() + ", votre solde est de: " + getSolde() + ".");
    	solde = getSolde() - retrait;
        System.out.println("Aprés retrait de " + retrait + " euros, votre nouveau solde est de: " + getSolde() + ".");
    }

    public void virerArgent() {
        
    }

}