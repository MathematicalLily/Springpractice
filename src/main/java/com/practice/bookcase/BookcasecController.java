package com.practice.bookcase;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class BookcasecController {

    private static int count =0;


    private void init() {
        if (count < 1) {
            Book.addNewBook(new Book(1, "To kill a mocking bird", "Harper Lee", "1960"));
            Book.addNewBook(new Book(2, "Pride and prejudice", "Jane Austen", "1813"));
            Book.addNewBook(new Book(3, "Of Mice and Men", "John Steinbeck", "1937"));
            count++;


        }
    }
        @GetMapping("/viewBooks")
                public String viewBooks(Model model){
            init();
            model.addAttribute("book",Book.books);
            return "viewBooks";
        }

    }


