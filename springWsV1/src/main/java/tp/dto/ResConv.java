package tp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@ToString @Getter @Setter @NoArgsConstructor
public class ResConv {
    private String src; //ex: "EUR"
    private String target;//ex: "USD"
    private Double amount; //ex: 200.0
    private Double result;//ex: 210.0
    
	public ResConv() {
		super();
	}

	@Override
	public String toString() {
		return "ResConv [src=" + src + ", target=" + target + ", amount=" + amount + ", result=" + result + "]";
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
    
    
}
