package au.com.bluej.service;

import java.util.List;

import au.com.bluej.model.Person;
 
public interface PersonService {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
     
}