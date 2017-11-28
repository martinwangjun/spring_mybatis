package controller;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Book2;

@Controller
@RequestMapping("/xml")
public class Book2Controller {
    private static final Logger logger = 
            Logger.getLogger(Book2Controller.class);
    
    @RequestMapping(value="/sendxml", method=RequestMethod.POST)
    public void sendXML(@RequestBody Book2 book) {
        logger.info(book);
        logger.info("接收XML文件成功");
    }
    
    @RequestMapping(value="/readxml", method=RequestMethod.POST)
    public @ResponseBody Book2 readXML() throws Exception{
        JAXBContext context = JAXBContext.newInstance(Book2.class);
        Unmarshaller unmar = context.createUnmarshaller();
        InputStream is = this.getClass().getResourceAsStream("/spring_mybatis/src/main/resources/book.xml");
        Book2 book = (Book2) unmar.unmarshal(is);
        logger.info(book);
        return book;
    }
    
    @RequestMapping("/sendxmlpage")
    public String sendXMLPage() {
        return "xml/sendxml";
    }
    
    @RequestMapping("/readxmlpage")
    public String readXMLPage() {
        return "xml/readxml";
    }
    
}
