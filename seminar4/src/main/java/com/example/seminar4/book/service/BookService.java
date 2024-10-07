package com.example.seminar4.book.service;

import com.example.seminar4.book.dto.BookRequest;
import com.example.seminar4.book.dto.BookResponse;
import com.example.seminar4.book.entity.Book;
import com.example.seminar4.book.repository.BookRepository;
import com.example.seminar4.user.entity.User;
import com.example.seminar4.user.reposityory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    public void createBook(Long userId, BookRequest.BookCreateRequest req){
        Optional<User> u = userRepository.findById(userId);
        //데이터가 없는데 findbyId 찾으면 에러 떠서 실행이 중지 되니까 일단 없으면 없는대로 다음코드 진행하라는 의미
        User user = u.get();
        Book book = Book.form(req.getTitle(), user);
        bookRepository.save(book);
    }

    public BookResponse.BookReadResponse readBook(Long bookId){
        Optional<Book> b = bookRepository.findById(bookId);
        Book book = b.get();
        return new BookResponse.BookReadResponse(bookId, book.getTitle());
    }
}
