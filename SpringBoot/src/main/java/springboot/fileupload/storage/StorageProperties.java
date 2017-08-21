package springboot.fileupload.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by CTWLPC on 2017/8/1.
 */
@ConfigurationProperties("storage")
public class StorageProperties {
    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
