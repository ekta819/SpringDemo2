package learn.spring.AnnotationBasedConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Kankinada")
	private String city;
	
	@Value("Andhra")
	private String state;
	
	@Value("50505")
	private int hnum;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getHnum() {
		return hnum;
	}
	public void setHnum(int hnum) {
		this.hnum = hnum;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", hnum=" + hnum + "]";
	}
	
	

}
