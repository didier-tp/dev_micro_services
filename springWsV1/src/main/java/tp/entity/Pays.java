package tp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
//@Getter @Setter @ToString @NoArgsConstructor
@Table(name="pays")
public class Pays {
    @Id
    private String code;
    private String nom;
    private String capitale;

    @ManyToOne(fetch = FetchType.LAZY)
    //@JsonIgnore
    @JoinColumn(name="devise") //colonne clef etrangère
                               //de la table pays référencant une devise
    private Devise devise;
    //...
    public Pays(String code,String nom,String capitale ) {
        this.code = code;
        this.nom = nom;
        this.capitale = capitale;
    }
    
	public Pays() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCapitale() {
		return capitale;
	}

	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}

	public Devise getDevise() {
		return devise;
	}

	public void setDevise(Devise devise) {
		this.devise = devise;
	}

	@Override
	public String toString() {
		return "Pays [code=" + code + ", nom=" + nom + ", capitale=" + capitale + "]";
	}
	
	
    
    

}
