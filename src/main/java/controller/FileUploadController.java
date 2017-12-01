package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import pojo.Pet;

@Controller
@RequestMapping("/file")
public class FileUploadController {
    
    private static final Logger logger = 
            Logger.getLogger(FileUploadController.class);
    
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName){
        // 动态跳转页面
        return "file/" + formName;
    }
    
    // 上传文件的处理
    @RequestMapping(value="/upload", method=RequestMethod.POST)
    public String upload(HttpServletRequest request,
            @RequestParam("description") String description,
            @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
        logger.info("上传的文件描述" + description);
        logger.info("上传的文件对象" + file);
        if(file.isEmpty()){
            return "file/error";
        }
        String path = request.getServletContext().getRealPath("/images/");
        String fileName = file.getOriginalFilename();
        File filepath = new File(path,fileName);
        if (!filepath.getParentFile().exists()) { 
            filepath.getParentFile().mkdirs();
        }
        file.transferTo(new File(path + fileName));
        return "file/success";
    }
    
    
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String register2(HttpServletRequest request,
            @ModelAttribute Pet pet,
            Model model) throws IllegalStateException, IOException {
        logger.info("User name: " + pet.getUsername());
        if(pet.getImage().isEmpty()) {
            return "file/register";
        }
        String path = request.getServletContext().getRealPath(
                "/images/");
        String fileName = pet.getImage().getOriginalFilename();
        File filepath = new File(path,fileName);
        if (!filepath.getParentFile().exists()) { 
            filepath.getParentFile().mkdirs();
        }
        pet.getImage().transferTo(new File(path + fileName));
        model.addAttribute("pet", pet);
        return "file/petInfo";
    }

    @RequestMapping(value="/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam("filename") String filename,
            Model model) throws Exception{
        String path = request.getServletContext().getRealPath(
                "/images/");
        File file = new File(path+File.separator+ filename);
        HttpHeaders headers = new HttpHeaders();  
        String downloadFielName = new String(filename.getBytes("UTF-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment", downloadFielName); 
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                headers, HttpStatus.CREATED); 
    }
}
