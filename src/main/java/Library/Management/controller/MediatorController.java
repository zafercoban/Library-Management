package Library.Management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MediatorController {

    @RequestMapping
    public String getHomePage() {
        return "redirect:/books";
    }

    @RequestMapping("books")
    public String getBooksPage() {
        return "books";
    }

}
