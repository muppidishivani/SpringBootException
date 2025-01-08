package com.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exception.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
