package online.book.library;

import online.book.library.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static online.book.library.UtilsForTest.compareActualResult;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
//@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT, classes = LibraryBookApplication.class)
@TestPropertySource("classpath:test.properties")
@ActiveProfiles("dev")
public class BookLibraryIntegrationTest {
    @Autowired
    private HelloController helloController;


    @Test
    public void shouldLoadContext() {
        // GIVEN the system configured

        // WHEN loading

        // THEN the controllers should load normally
        compareActualResult(helloController, t -> t != null, actual -> "Should be not null");
    }


}