package com.alisimsek.LibraryManagementProject.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookBorrowingRequest {

    private String borrowerName;
    private String borrowerMail;
    private LocalDate borrowingDate;
    private BookForBorrowingRequest bookForBorrowingRequest;
}
