package com.qianfeng.upload;

import com.oracle.webservices.internal.api.message.PropertySet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile){
        String originalFilename = uploadFile.getOriginalFilename();
        System.out.println(originalFilename);
        return "success.jsp";
    }
}
