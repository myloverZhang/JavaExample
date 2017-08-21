package springboot.fileupload.storage;

/**
 * Created by CTWLPC on 2017/8/1.
 */
public class StorageException extends RuntimeException{
    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }

}
