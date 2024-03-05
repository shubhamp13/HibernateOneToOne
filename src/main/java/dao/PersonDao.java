package dao;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import dto.Person;

public class PersonDao 
{
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("persistence").createEntityManager();
	}
	public void savePerson(Person person)
	{
		EntityManager entityManager=getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
	}
	public void updatePerson(int id,Person person)
	{
		EntityManager entityManager=getEntityManager();
		Person dbPerson=entityManager.find(Person.class,id);
		if(dbPerson!=null)
		{
			entityManager.getTransaction().begin();
			person.setP_id(id);
			person.setAadhaar(dbPerson.getAadhaar());
			entityManager.merge(person);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Person Not Found In records");
		}
	}
	public void deletePerson(int id)
	{
		EntityManager entityManager=getEntityManager();
	   Person dbPerson=	entityManager.find(Person.class,id);
	   if(dbPerson!=null)
	   {
		   entityManager.getTransaction().begin();
		   entityManager.remove(dbPerson);
		   entityManager.getTransaction().commit();
	   }
	   else
	   {
		   System.out.println("Invalid Person Id");
	   }
	}
	public void fetchPerson(int id)
	{
		EntityManager entityManager=getEntityManager();
		   Person dbPerson=	entityManager.find(Person.class,id);
		   if(dbPerson!=null)
		   {
			   System.out.println(dbPerson);
		   }
		   else
		   {
			   System.out.println("Invalid Person Id");
		   }
	}
}
