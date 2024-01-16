package model.dao;
import java.util.List;
import model.entities.Produit;

public interface produitDAO {
	List <Produit> getALLProduits();
	List <Produit> getProduitParMC(String MC);
	void ajouterProduit(Produit p);
	void supprimerProduit(int id);
	
	
	

}
