package springboot.fileupload.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Created by CTWLPC on 2017/8/1.
 */
public interface StorageService {
    void init();
    void store(MultipartFile file);
    Stream<Path> loadAll();
    Path load(String fileName);
    Resource loadAsResource(String fileName);
    void deleteAll();
}