package com.petsupplies.product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderConfirmationRepository extends MongoRepository<OrderInformation, String> {

	

}
