package net.xdclass.xdvideo.controller;

import net.xdclass.xdvideo.config.WeChatConfig;
import net.xdclass.xdvideo.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private WeChatConfig weChatConfig;

    @RequestMapping("/app")
    public String test(){
        return weChatConfig.getAppid();
    }
    @Autowired
    private VideoMapper videoMapper;
    @RequestMapping("find")
    public Object find(){
        return videoMapper.findAll();
    }
}
