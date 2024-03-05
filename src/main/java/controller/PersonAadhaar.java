package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import dao.AadhaarDao;
import dao.PersonDao;
import dto.Aadhaar;
import dto.Person;

public class PersonAadhaar 
{
	public static void main(String[] args) 
	{
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter Choice");
			System.out.println("1.Save The Person");
			System.out.println("2.Save The Aadhar Card Deatils");
			System.out.println("3.Update The Person Details");
			System.out.println("4.Update The Aadhar Card Details");
			System.out.println("5.Delete the Person Details");
			System.out.println("6.Delete The Aadhar Card Details");
			System.out.println("7.Fetch The Person Details");
			System.out.println("8.Fetch The Aadhar card details");
			int choice=Integer.parseInt(bufferedReader.readLine());
			Person person=new Person();
			Aadhaar aadhaar=new Aadhaar();
			PersonDao personDao=new PersonDao();
			AadhaarDao aadhaarDao=new AadhaarDao();
			
			switch(choice)
			{
			case 1:
				{
					System.out.println("Enter The Id Of The person");
					int id=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Name Of The Person");
					String name=bufferedReader.readLine();
					System.out.println("Enter Address Of The Person");
					String address=bufferedReader.readLine();
					person.setP_id(id);
					person.setAddress(address);
					person.setName(name);
					personDao.savePerson(person);
					System.out.println("Person Saved Successfully");
				}
				break;
			case 2:
				{
					System.out.println("Enter Person Id To Check For aadhar enroll");
					int personId=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter The Id Of The Aadhar Card");
					int aadharId=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Name Of The Person On Aadhar Card");
					String aadhaarName=bufferedReader.readLine();
					System.out.println("Enter Address Of The Person On Aadhar");
					String aadhaarAddress=bufferedReader.readLine();
					System.out.println("Enter Age Of Person");
					int age=Integer.parseInt(bufferedReader.readLine());
					aadhaar.setAadhaarNo(aadharId);
					aadhaar.setName(aadhaarName);
					aadhaar.setAddress(aadhaarAddress);
					aadhaar.setAge(age);
					aadhaarDao.saveAadhar(personId, aadhaar);
					System.out.println("Aadhar Saved Successfully");
				 
				}
				break;
			case 3:
				{
					System.out.println("Enter The Id Of The person To Be update");
					int id=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Name Of The Person");
					String name=bufferedReader.readLine();
					System.out.println("Enter Address Of The Person");
					String address=bufferedReader.readLine();
					person.setAddress(address);
					person.setName(name);
					personDao.updatePerson(id, person);
					System.out.println("Person Updated Successfully");
				}
				break;
			case 4:
				{
					System.out.println("Enter The Id Of The Aadhar Card to update");
					int aadharId=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Name Of The Person On Aadhar Card");
					String aadhaarName=bufferedReader.readLine();
					System.out.println("Enter Address Of The Person On Aadhar");
					String aadhaarAddress=bufferedReader.readLine();
					System.out.println("Enter Age Of Person");
					int age=Integer.parseInt(bufferedReader.readLine());
					aadhaar.setName(aadhaarName);
					aadhaar.setAddress(aadhaarAddress);
					aadhaar.setAge(age);
					aadhaarDao.updateAadhar(aadharId, aadhaar);
					System.out.println("Aadhar Updated Successfully");
				}
				break;
			case 5:
				{
					System.out.println("Enter Id Of Person To be deleted");
					int personId=Integer.parseInt(bufferedReader.readLine());
					personDao.deletePerson(personId);
					System.out.println("Deleted Sucessfully");
				}
				break;
			case 6:
				{
						System.out.println("Enter  Aadhar Id Of Person To be deleted");
						int aadhaarId=Integer.parseInt(bufferedReader.readLine());
						aadhaarDao.deleteAadhar(aadhaarId);
						System.out.println("Deleted Sucessfully");
				}
				break;
			case 7:
				{
					System.out.println("Enter Id Of Person To be fetched");
					int personId=Integer.parseInt(bufferedReader.readLine());
					personDao.fetchPerson(personId);
				}
				break;
			case 8:
			{
				System.out.println("Enter  Aadhar Id Of Person To be fetched");
				int aadhaarId=Integer.parseInt(bufferedReader.readLine());
				aadhaarDao.fetchAadhar(aadhaarId);
			}
			break;
				
			}
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}
