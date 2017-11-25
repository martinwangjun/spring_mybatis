package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/item")
public class DataBindingController {
    private static final Logger logger = Logger.getLogger(DataBindingController.class);    
    // 前台会出错，会显示404，但是后台还是得到了这个数据，别慌
    // 调试了2个小时才发现，真tmd的失败！
    @RequestMapping(value="/detail/{id}")
    public void detail(@PathVariable("id") Integer id) {
        logger.debug("通过@PathVariable获得数据： " + id);
        System.out.println(id);
        // return "item/detail";
    }
    
    // 前台会出错，会显示404错误，不过别慌，正常现象
    @RequestMapping(value="/requestHeaderTest")
    public void requestHeaderTest(
            @RequestHeader("User-Agent") String userAgent,  
            @RequestHeader(value="Accept") String[] accepts) {
        logger.info("通过@requestHeaderTest获得数据： " + userAgent);
        for(String accept : accepts){
            logger.info(accept);
        }
    }
    
    @RequestMapping(value="cookieTest")
    public void cookieTest(
            @CookieValue(value="JSESSIONID", defaultValue="") String sessionId) {
        logger.info("获得的SessionID:" + sessionId);
    }
    
    
}
