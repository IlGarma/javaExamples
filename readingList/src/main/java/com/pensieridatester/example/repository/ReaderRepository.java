package com.pensieridatester.example.repository;

import com.pensieridatester.example.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Garma on 21/02/2016.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
