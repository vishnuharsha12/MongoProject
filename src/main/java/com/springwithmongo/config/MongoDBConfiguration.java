package com.springwithmongo.config;

import com.springwithmongo.document.Booking;
import com.springwithmongo.repository.BookingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Date;

@EnableMongoRepositories(basePackages="com.springwithmongo.repository")
@Configuration
public class MongoDBConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(BookingRepository bookingRepository){
        return  strings -> { bookingRepository.save(new Booking("1001","Vishnu","Hyderabad","USA",new Date()));
            bookingRepository.save(new Booking("1002","Lenin","Hyderabad","USA",new Date()));
            bookingRepository.save(new Booking("1003","Sai","Hyderabad","USA",new Date()));};
            }
}
