package learn.spring.javaBasedConfig;

public class Address {
	private String city;
	private String state;
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
