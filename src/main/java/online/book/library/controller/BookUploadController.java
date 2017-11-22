package online.book.library.controller;

import online.book.library.dao.BookUploadUploadDAOImpl;
import online.book.library.domain.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class BookUploadController {
    private static final Logger LOG = LoggerFactory.getLogger(BookUploadController .class);
@Autowired
private BookUploadUploadDAOImpl dao;

    @RequestMapping(value="/upload", method= RequestMethod.POST)
    public @ResponseBody String handleBookUpload(@RequestParam("name") String name,
                            @RequestParam("file") MultipartFile file){
        if (!file.isEmpty()) {
            try {
                LOG.info("Starting download the book:  {}", name);
                byte[] bytes = file.getBytes();
                LOG.info("Received bytes :  {}", bytes.length);
                final Book book = new Book(name, bytes);
                dao.save(book);
                return "book downloaded " + name;
            } catch (Exception e) {
                return "Error" + name + " => " + e.getMessage();
            }
        } else {
            return "There is no file " + name + "uploaded";
        }
    }
}
