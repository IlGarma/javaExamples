package com.pensieridatester.example.repository;

import com.pensieridatester.example.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Garma on 20/02/2016.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long>{

    public List<Book> findByReader(String reader);

}
