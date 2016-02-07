package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Garma on 07/02/2016.
 */


@Controller
@RequestMapping("/list")
public class ControllerBook {

    private BookRepository bookRepository;

    @Autowired
    public ControllerBook(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String modelBook(@PathVariable("reader") String reader, Model model) {
        List<Book> list = bookRepository.findByReader(reader);

        if (list != null) {
            model.addAttribute("books", list);
        }
        return "list";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addElement(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        bookRepository.save(book);
        return "redirect:/list/{reader}";
    }

}
