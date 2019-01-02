//package com.springwithmongo.config;
//
//import com.springwithmongo.document.UserDetails;
//import com.springwithmongo.repository.UserDetailsRepo;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//@EnableMongoRepositories(basePackageClasses = UserDetailsRepo.class)
//@Configuration
//public class MongoConf {
//
//
//
//        @Bean
//        CommandLineRunner commandLineRunner(UserDetailsRepo userRepository){
//            return  strings -> { userRepository.insert(UserDetails<>)};
//        }
//    }
//
//
