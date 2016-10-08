package com.pensieridatester.example;

import com.pensieridatester.example.repository.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Garma on 20/02/2016.
 */

@Controller
@RequestMapping("/readingList")
public class ReadingListController {

    private ReadingListRepository readingListRepository;

    @Autowired
    ReadingListController(ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String getBooks(@PathVariable("reader") String reader, Model model){

        String view = null;

        List<Book> bookList = readingListRepository.findByReader(reader);
        if (bookList != null) {
            model.addAttribute("books", bookList);
        }

        return "readingList";

    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String saveBook(@PathVariable("reader") String reader, Book book) {

        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/readingList/{reader}";
    }

}
