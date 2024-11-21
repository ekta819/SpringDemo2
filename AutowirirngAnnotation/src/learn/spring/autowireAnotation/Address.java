package learn.spring.autowireAnotation;

public class Address {
	private String city;
	private String state;
	private int hnum;
	
	public void setCity(String city) {
		System.out.println("Only setter methods are defined.. No Getter methods defined");
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setHnum(int hnum) {
		this.hnum = hnum;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", hnum=" + hnum + "]";
	}



}
