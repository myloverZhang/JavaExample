package springboot.fileupload.storage;

/**
 * Created by CTWLPC on 2017/8/1.
 */
public class StorageFileNotFoundException extends StorageException{

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
