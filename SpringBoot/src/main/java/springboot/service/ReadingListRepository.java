package springboot.service;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import springboot.model.Book;

import java.util.List;

/**
 * Created by CTWLPC on 2017/8/10.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long>{
    List<Book> findByReader(String reader);
}
