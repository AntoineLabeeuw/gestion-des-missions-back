package dev.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * classe conceptualisant une nature
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
public class Nature extends EntiteModifiable {
	/** libelle */
	private String libelle;
	/** payee */
	private Boolean payee;
	/** versementPrime */
	private Boolean versementPrime;
	/** pourcentagePrime */
	private BigDecimal pourcentagePrime;
	/** debutValidite */
	private LocalDate debutValidite;
	/** finValidite */
	private LocalDate finValidite;
	/** plafondFrais */
	private BigDecimal plafondFrais;
	/** depassementFrais */
	private BigDecimal depassementFrais;
	
	/**
	 * Constructeur
	 * 
	 * @param signatureNumerique
	 */
	public Nature(SignatureNumerique signatureNumerique) {
		super(signatureNumerique);
	}

	/**
	 * Constructeur
	 * 
	 * @param signatureNumerique
	 * @param libelle
	 * @param payee
	 * @param versementPrime
	 * @param pourcentagePrime
	 * @param debutValidite
	 * @param finValidite
	 * @param plafondFrais
	 * @param depassementFrais
	 * @param missions
	 */
	public Nature(SignatureNumerique signatureNumerique, String libelle, Boolean payee, Boolean versementPrime,
			BigDecimal pourcentagePrime, LocalDate debutValidite, LocalDate finValidite, BigDecimal plafondFrais,
			BigDecimal depassementFrais) {
		super(signatureNumerique);
		this.libelle = libelle;
		this.payee = payee;
		this.versementPrime = versementPrime;
		this.pourcentagePrime = pourcentagePrime;
		this.debutValidite = debutValidite;
		this.finValidite = finValidite;
		this.plafondFrais = plafondFrais;
		this.depassementFrais = depassementFrais;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the payee
	 */
	public Boolean getPayee() {
		return payee;
	}

	/**
	 * Setter
	 * 
	 * @param payee the payee to set
	 */
	public void setPayee(Boolean payee) {
		this.payee = payee;
	}

	/**
	 * Getter
	 * 
	 * @return the versementPrime
	 */
	public Boolean getVersementPrime() {
		return versementPrime;
	}

	/**
	 * Setter
	 * 
	 * @param versementPrime the versementPrime to set
	 */
	public void setVersementPrime(Boolean versementPrime) {
		this.versementPrime = versementPrime;
	}

	/**
	 * Getter
	 * 
	 * @return the pourcentagePrime
	 */
	public BigDecimal getPourcentagePrime() {
		return pourcentagePrime;
	}

	/**
	 * Setter
	 * 
	 * @param pourcentagePrime the pourcentagePrime to set
	 */
	public void setPourcentagePrime(BigDecimal pourcentagePrime) {
		this.pourcentagePrime = pourcentagePrime;
	}

	/**
	 * Getter
	 * 
	 * @return the debutValidite
	 */
	public LocalDate getDebutValidite() {
		return debutValidite;
	}

	/**
	 * Setter
	 * 
	 * @param debutValidite the debutValidite to set
	 */
	public void setDebutValidite(LocalDate debutValidite) {
		this.debutValidite = debutValidite;
	}

	/**
	 * Getter
	 * 
	 * @return the finValidite
	 */
	public LocalDate getFinValidite() {
		return finValidite;
	}

	/**
	 * Setter
	 * 
	 * @param finValidite the finValidite to set
	 */
	public void setFinValidite(LocalDate finValidite) {
		this.finValidite = finValidite;
	}

	/**
	 * Getter
	 * 
	 * @return the plafondFrais
	 */
	public BigDecimal getPlafondFrais() {
		return plafondFrais;
	}

	/**
	 * Setter
	 * 
	 * @param plafondFrais the plafondFrais to set
	 */
	public void setPlafondFrais(BigDecimal plafondFrais) {
		this.plafondFrais = plafondFrais;
	}

	/**
	 * Getter
	 * 
	 * @return the depassementFrais
	 */
	public BigDecimal getDepassementFrais() {
		return depassementFrais;
	}

	/**
	 * Setter
	 * 
	 * @param depassementFrais the depassementFrais to set
	 */
	public void setDepassementFrais(BigDecimal depassementFrais) {
		this.depassementFrais = depassementFrais;
	}

}