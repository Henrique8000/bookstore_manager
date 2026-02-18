package com.henriqueguimaraes.bookstoremanager.mapper;

import com.henriqueguimaraes.bookstoremanager.dto.BookDTO;
import com.henriqueguimaraes.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
