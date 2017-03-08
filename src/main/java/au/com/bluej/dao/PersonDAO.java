package au.com.bluej.dao;

import java.util.List;

import au.com.bluej.model.Person;
 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
}