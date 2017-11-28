package pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book2 implements Serializable{
    private static final long serialVersionUID = -6804048533938807996L;
    private Integer id;
    private String name;
    private String author;
    
    public Book2() {
        
    }
    
    public Book2(Integer id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }
    
    @XmlElement
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    
    @XmlElement
    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
    public String toString() {
        return "Book [id = " + id + ", name = " + name + ", author = " + author + "]";
    }
}
