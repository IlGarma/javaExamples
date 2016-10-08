package com.pensieridatester.example;

import com.pensieridatester.example.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Garma on 21/02/2016.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private ReaderRepository readerRepository;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void getPage() {

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String setUserPage(Reader reader){
        readerRepository.save(reader);
        return "redirect:/readingList/giovanni";
    }
}
