package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "person")
public class Person 
{
	@Id
	private int p_id;
	private String name;
	private String address;
	
	@OneToOne
	private Aadhaar aadhaar;
	
	public Aadhaar getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(Aadhaar aadhaar) {
		this.aadhaar = aadhaar;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", name=" + name + ", address=" + address + ", aadhaar=" + aadhaar + "]";
	}	
}
