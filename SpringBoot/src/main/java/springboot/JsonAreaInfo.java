package springboot;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.Serializable;

/**
 * Created by CTWLPC on 2017/8/1.
 */
public class JsonAreaInfo implements Serializable{
    private Boolean status;
    private Integer code;
    private String message;
    private String data;

    public JsonAreaInfo() {
    }

    public JsonAreaInfo(Boolean status, Integer code, String message, String data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "springboot.JsonAreaInfo{" +
                "status=" + status +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
