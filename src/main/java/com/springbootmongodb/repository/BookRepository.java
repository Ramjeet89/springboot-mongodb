package com.springbootmongodb.repository;

import com.springbootmongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, Integer> {

}
