package controller;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Book;

@Controller
@RequestMapping("/json")
public class BookController {
    private static final Logger logger = Logger.getLogger(BookController.class);
    
    @RequestMapping("/testRequestBody")
    public void setJson1(@RequestBody Book book,
            HttpServletResponse response) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        logger.info(mapper.writeValueAsString(book));
        book.setId(1);
        book.setName("史上第一混乱");
        book.setAuthor("张小花");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(book));
    }
    
    // 显示发送json的页面
    @RequestMapping("/testJson1")
    public String jsonRequest1() {
        return "json/jsonRequest1";
    }
    
    @RequestMapping("/testRequestBody2")
    public void setJson2(@RequestBody Book book,
            HttpServletResponse response) throws IOException{
        logger.info(JSONObject.toJSONString(book));
        book.setId(12);
        book.setAuthor("码丁");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(JSONObject.toJSONString(book));
    }
    
    @RequestMapping("/testJson2")
    public String jsonRequest2() {
        return "json/jsonRequest2";
    }
    
    // 返回Json格式的数据
    @RequestMapping("/testResponseBody1")
    @ResponseBody
    public Object getJson1(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "静夜思", "李白"));
        bookList.add(new Book(2, "李尔王", "莎士比亚"));
        
        return bookList;
    }
    
    @RequestMapping("/testJsonResponse1")
    public String jsonResponse1() {
        return "json/jsonResponse1";
    }
   
}
