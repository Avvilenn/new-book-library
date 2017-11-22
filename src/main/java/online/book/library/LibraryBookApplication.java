package online.book.library;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@PropertySource("bookLibrary.properties")
public class LibraryBookApplication {

    public static void main(String[] args) throws Exception {
        run(LibraryBookApplication.class, args);
    }
}
