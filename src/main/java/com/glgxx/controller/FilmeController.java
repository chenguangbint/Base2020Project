package com.glgxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname FilmeController
 * @Description TODO
 * @Date 2019-3-5 13:45
 * @Created by CrazyStone
 */
/*
@RestController
url输入： http://localhost:8080/detail/myType/myPath
在页面输出：detail/myType/myPath
* */
@Controller
//url输入：http://localhost:8080/，默认打开index.html页面
public class FilmeController {
    //  影片详情页
    @GetMapping("/detail/{type}/{path}")
    public String toDetail(@PathVariable("type")String type, @PathVariable("path")String path) {
        return "detail/"+type+"/"+path;
    }
}

