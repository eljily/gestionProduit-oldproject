package model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.entities.Produit;

public class ProduitDAOimp implements produitDAO{

	@Override
	public List<Produit> getALLProduits() {
		Connection con = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Produit> Liste = new ArrayList <Produit>(); 
		
		try {
			ps = con.prepareStatement("SELECT * FROM gproduit");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Produit p = new Produit();
				p.setId(rs.getInt("id"));
				p.setDesignation(rs.getString("designation"));
				p.setPrix(rs.getDouble("prix"));
				p.setQuantite(rs.getInt("quantite"));
				Liste.add(p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Liste;
	}

	@Override
	public List<Produit> getProduitParMC(String MC) {
		Connection con = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Produit> Liste = new ArrayList <Produit>(); 
		
		try {
			ps = con.prepareStatement("SELECT * FROM gproduit WHERE designation LIKE ?");
			ps.setString(1, "%" + MC + "%");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Produit p = new Produit();
				p.setId(rs.getInt("id"));
				p.setDesignation(rs.getString("designation"));
				p.setPrix(rs.getDouble("prix"));
				p.setQuantite(rs.getInt("quantite"));
				Liste.add(p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Liste;
	}

	

	@Override
	public void ajouterProduit(Produit p) {
		Connection con = SingletonConnection.getConnection();
		PreparedStatement ps;
		
		try {
			ps = con.prepareStatement("INSERT INTO gproduit (designation,quantite,prix) VALUES (?,?,?)");
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void supprimerProduit(int id) {
		Connection con = SingletonConnection.getConnection();
		PreparedStatement ps;
		
		try {
			ps = con.prepareStatement("DELETE FROM gproduit WHERE id = ? ");
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
