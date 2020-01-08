package net.xdclass.xdvideo.controller.admin;

import net.xdclass.xdvideo.doman.Video;
import net.xdclass.xdvideo.service.impl.VideoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vi/admin")
public class VideoAdminController {

    @Autowired
    private VideoServiceImpl videoService;

    @GetMapping("find")
    public Object hello(@RequestParam(value = "page",defaultValue = "1") int page,
                        @RequestParam(value = "size",defaultValue = "10") int size
                        ){
        return videoService.find();

    }
    @GetMapping("find_by_id")
    public Object findById(@RequestParam(value = "video_id",required = true) int videoId){
        return videoService.findById(videoId);

    }
    @PutMapping("update")
    public int up(@RequestBody Video video){

        return videoService.update(video);
    }
    @PostMapping("insert")
    public int in(@RequestBody Video video){
        return videoService.insert(video);
    }
    @DeleteMapping("dele")
    public int dle(@RequestParam(value = "video_id",required = true) int videoId) {
        return videoService.del(videoId);
    }

}
