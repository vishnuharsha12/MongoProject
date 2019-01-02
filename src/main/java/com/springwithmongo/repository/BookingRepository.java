package com.springwithmongo.repository;
import com.springwithmongo.document.Booking;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.Transactional;

public interface BookingRepository extends MongoRepository<Booking,Integer> {


}


        /**
         * This method will find an Boooking instance in the database by its departure.
         * Note that this method is not implemented and its working code will be
         * automatically generated from its signature by Spring Data JPA.
         */
    /*    public Booking findByDeparture(String departure);
    }
*/
