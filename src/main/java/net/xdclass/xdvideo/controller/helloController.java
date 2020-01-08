package net.xdclass.xdvideo.controller;

import net.xdclass.xdvideo.doman.Video;
import net.xdclass.xdvideo.service.impl.VideoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vi")
public class helloController {

    @Autowired
    private VideoServiceImpl videoService;

    @GetMapping("find")
    public Object hello(@RequestParam(value = "page",defaultValue = "1") int page,
                        @RequestParam(value = "size",defaultValue = "10") int size
                        ){
        return videoService.find();

    }
    @GetMapping("find_by_id")
    public Object findById(@RequestParam(value = "video_id",required = true) int videoId) {
        return videoService.findById(videoId);

    }

}
