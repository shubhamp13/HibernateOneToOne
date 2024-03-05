package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="aadhar")
public class Aadhaar 
{
	@Id
	private int aadhaarNo;
	private String name;
	private String address;
	private int age;
	public int getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(int aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Aadhaar [aadhaarNo=" + aadhaarNo + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
}
