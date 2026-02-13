package com.henriqueguimaraes.bookstoremanager.repository;

import com.henriqueguimaraes.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
