package com.colin.controller;

import com.colin.bean.BlogClass;
import com.colin.service.ClassifyAndLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/classifyAndLabel")
public class ClassifyAndLabelController
{
    @Autowired
    ClassifyAndLabelService classifyAndLabelService;
    @RequestMapping("/selectClassifyAndLabel")
    public String selectClassifyAndLabel(Integer id, Model model)
    {
        int labelCount = classifyAndLabelService.selectLabelCount(id);
        List<BlogClass> list = classifyAndLabelService.selectCountOfClass(id);
        int c = 0;
        for (BlogClass param : list) {
            if (param.getBlogClass().equals("默认分类")) {
                c = param.getSelfCount();
            }
        }
        model.addAttribute("labelCount", labelCount);
        model.addAttribute("list", list);
        model.addAttribute("c", c);
        return "flbq";
    }

    @RequestMapping("/deleteClassify")
    public String deleteClassify(String className, Integer id)
    {
        classifyAndLabelService.deleteClassify(className, id);
        return "forward:/classifyAndLabel/selectClassifyAndLabel";
    }

    @RequestMapping("/insertClassify")
    public String insertClassify(Integer id, String flmc)
    {
        classifyAndLabelService.insertClassify(flmc, id);
        return "forward:/classifyAndLabel/selectClassifyAndLabel";
    }
}
