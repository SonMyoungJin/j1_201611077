package com.sd.dao.v1;

import java.util.List;

//define fuction : create read1,2 select update delete
public interface PersonDao {  //여러건(read)
  public List<Person> getAllPersons();
  public Person getPerson(int id); //단건(read) id is primary key
  public void updatePerson(Person p);
  public void deletePerson(Person p);

}