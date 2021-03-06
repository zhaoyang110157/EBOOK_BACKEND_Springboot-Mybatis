package com.zhaoyang.serviceImpl;

import com.zhaoyang.dao.BookDAO;
import com.zhaoyang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhaoyang.entity.Book;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDAO bookDAO;

    @Override
    public void addBook(Book book){
        bookDAO.addBook(book);
    }

    @Override
    public void modifyBook(Book newBook,int bid){
        bookDAO.modifyBook(newBook, bid);
    }

    @Override
    public Book getOne(int bid){
        return bookDAO.getOne(bid);
    }

    @Override
    public List<Book> getAll(){
        return bookDAO.getAll();
    }

    @Override
    public void deleteBook(int bid){
        bookDAO.deleteBook(bid);
    }
}
