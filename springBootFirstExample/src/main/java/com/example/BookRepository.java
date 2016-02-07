package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Garma on 07/02/2016.
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);

}
