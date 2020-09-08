package tp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Getter @Setter @ToString @NoArgsConstructor
@Table(name="devise")
public class Devise {
    @Id
    private String code; //"EUR" , "USD"
    private String name; // "euro" , "dollar"
    @Column(name="e_change")
    private double change; //nb unite pour 1 dollar

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "devise")
    @JsonIgnore //pour limiter la serialisation "java" --> "json"
    private List<Pays> pays;

    public void addPays(Pays p){
        if(this.pays==null){
            pays = new ArrayList<>();
        }
        this.pays.add(p);
    }

    public Devise(String code,String name,double change ) {
        this.code = code;
        this.name = name;
        this.change = change;
    }
    

	public Devise() {
		super();
	}

	@Override
	public String toString() {
		return "Devise [code=" + code + ", name=" + name + ", change=" + change + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public List<Pays> getPays() {
		return pays;
	}

	public void setPays(List<Pays> pays) {
		this.pays = pays;
	}
    
    
}
