package com.revature.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.*;


public interface ApplicationHibernate  {


	public List<Application> findByPet(Integer pid);
	
	public List<Application> findByCustomer(Customer customer);

}
