package com.cts.jpa.demo5;

import java.util.List;

public interface CustomerRepository {
	 List<Customer> findByLastName(String lastName);
	  Customer findById(long id);
}
