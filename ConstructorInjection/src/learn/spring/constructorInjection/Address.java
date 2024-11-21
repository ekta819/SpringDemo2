package learn.spring.constructorInjection;

public class Address {
	private String city;
	private String state;
	private int hnum;
	
	
	
	public Address(String city, String state, int hnum) {
		this.city = city;
		this.state = state;
		this.hnum = hnum;
	}



	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", hnum=" + hnum + "]";
	}



}
