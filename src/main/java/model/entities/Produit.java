package model.entities;

public class Produit {
private int id;
private double prix;
private int quantite;
private String designation;

public Produit() {

}
public Produit(double prix, int quantite, String designation) {
	//super();
	this.prix = prix;
	this.quantite = quantite;
	this.designation = designation;
}
public Produit(int id, double prix, int quantite, String designation) {
	//super();
	this.id = id;
	this.prix = prix;
	this.quantite = quantite;
	this.designation = designation;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
}
