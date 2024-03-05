package dao;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import dto.Aadhaar;
import dto.Person;

public class AadhaarDao 
{
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("persistence").createEntityManager();
	}
	
	public void saveAadhar(int personId,Aadhaar aadhaar)
	{
		EntityManager entityManager=getEntityManager();
		Person dbPerson=entityManager.find(Person.class,personId);
		if(dbPerson!=null)
		{
			entityManager.getTransaction().begin();
			dbPerson.setAadhaar(aadhaar);
			entityManager.persist(aadhaar);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Person Id");
		}
	}
	public void updateAadhar(int aadhharId,Aadhaar aadhaar)
	{
		EntityManager entityManager=getEntityManager();
		Aadhaar dbAadhaar=entityManager.find(Aadhaar.class, aadhharId);
		if(dbAadhaar!=null)
		{
			entityManager.getTransaction().begin();
			aadhaar.setAadhaarNo(aadhharId);
			entityManager.merge(aadhaar);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Aadhar Id");
		}
	}
	public void deleteAadhar(int aadharId)
	{
		EntityManager entityManager=getEntityManager();
		Aadhaar dbAadhaar=entityManager.find(Aadhaar.class,aadharId);
		if(dbAadhaar!=null)
		{
			entityManager.getTransaction().begin();
			entityManager.remove(dbAadhaar);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Aadhaar");
		}
	}
	public void fetchAadhar(int aadharId)
	{
		EntityManager entityManager=getEntityManager();
		Aadhaar dbAadhaar=entityManager.find(Aadhaar.class,aadharId);
		if(dbAadhaar!=null)
		{
			 System.out.println(dbAadhaar);
		}
		else
		{
			System.out.println("Invalid Aadhaar");
		}
	}
}
