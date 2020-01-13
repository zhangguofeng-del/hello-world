package com.colin.controller;

import com.colin.bean.MyFile;
import com.colin.service.FileServie;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/file")
public class FileController
{
    @Autowired
    FileServie fileServie;

    @RequestMapping("/selectFile")
    public String selectFile(Integer id, Model model)
    {
        List<MyFile> list = fileServie.selectFile(id);
        List<String> list1 = new ArrayList<>();//名字
        for (MyFile param : list) {
            list1.add(new File(param.getFileName()).getName());
        }
        if (list.size() != 0)
        {
            model.addAttribute("list1",list1);
            model.addAttribute("list",list);
        }
        return "wjsc";
    }

    @RequestMapping("/uploadFile")
    public String uploadFile(HttpServletRequest req, MultipartFile myFile, Integer id) throws IOException, ServletException
    {
        String savePath = "D:\\idea\\myblog2\\web\\upload\\";
        String path = savePath + myFile.getOriginalFilename();
        fileServie.insertFile(path, id);
        if (!myFile.isEmpty()) {
            FileUtils.copyInputStreamToFile(myFile.getInputStream(), new File("D:\\idea\\myblog2\\web\\upload", myFile.getOriginalFilename()));
        }
        return "forward:/file/selectFile?id=" + id;
    }

    @RequestMapping("/deleteFile")
    public String deleteFile(Integer fileId, Integer id)
    {
        String path = fileServie.selectFile2(fileId);
        new File(path).delete();
        fileServie.deleteFile(fileId);
        return "forward:/file/selectFile?id=" + id;
    }
}
