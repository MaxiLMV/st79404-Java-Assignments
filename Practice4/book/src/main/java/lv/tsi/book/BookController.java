package lv.tsi.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class BookController {
    BookRepository br;

    @Autowired
    BookController(BookRepository br) {
        this.br = br;
    }

    @GetMapping("/getBooks")
    public ResponseEntity<Book> findBooks(@RequestParam(value = "id") Long id) {
        return new ResponseEntity<>(OK);
    }

    @GetMapping("/getBook")
    public ResponseEntity<Book> findBook(@RequestParam(value = "id") Long id) {
        return new ResponseEntity<>(OK);
    }
}
