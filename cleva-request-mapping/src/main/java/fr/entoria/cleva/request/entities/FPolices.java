package fr.entoria.cleva.request.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "F_POLICES")
public class FPolices implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -5564052969998095928L;

    @Id
    @Column(name = "POL_IDENT")
    Integer polIdent;

    @Column(name = "POL_NUMPOL")
    String policyNumber;

    @Column(name = "POL_CODETAT")
    String polCodeEtat;

    public FPolices() {
	super();
    }

    public FPolices(Integer polIdent, String policyNumber, String polCodeEtat) {
	super();
	this.polIdent = polIdent;
	this.policyNumber = policyNumber;
	this.polCodeEtat = polCodeEtat;
    }

    public Integer getPolIdent() {
	return polIdent;
    }

    public void setPolIdent(Integer polIdent) {
	this.polIdent = polIdent;
    }

    public String getPolicyNumber() {
	return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
	this.policyNumber = policyNumber;
    }

    public String getPolCodeEtat() {
	return polCodeEtat;
    }

    public void setPolCodeEtat(String polCodeEtat) {
	this.polCodeEtat = polCodeEtat;
    }
}
