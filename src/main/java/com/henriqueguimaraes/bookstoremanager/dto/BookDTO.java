package com.henriqueguimaraes.bookstoremanager.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotNull
    private Integer pages;

    @NotNull
    private Integer chapters;

    @NotBlank
    @Size(max = 100)

    @NotBlank
    @Size(max = 100)
    @Pattern(
            regexp = "^(?:ISBN(?:-1[03])?:?\\s*)?(?:(?=.{10,17}$)\\d{1,5}[-\\s]?\\d{1,7}[-\\s]?\\d{1,7}[-\\s]?[\\dX]|(?=.{13,19}$)97[89][-\\s]?\\d{1,5}[-\\s]?\\d{1,7}[-\\s]?\\d{1,7}[-\\s]?\\d)$",
            message = "ISBN must be a valid ISBN-10 or ISBN-13 format"
    )
    private String isbn;

    @NotBlank
    @Size(max  = 200)
    private String publisherName;

    @Valid
    @NotNull
    private AuthorDTO author;
}
