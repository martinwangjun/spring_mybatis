package pojo;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class Pet implements Serializable{

    private static final long serialVersionUID = -3461779851209027011L;
    
    private String username;
    private MultipartFile image;
    
    public Pet() {

    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public MultipartFile getImage() {
        return image;
    }
    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
