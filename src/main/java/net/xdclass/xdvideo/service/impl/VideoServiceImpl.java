package net.xdclass.xdvideo.service.impl;

import net.xdclass.xdvideo.doman.Video;
import net.xdclass.xdvideo.mapper.VideoMapper;
import net.xdclass.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List find() {
        return videoMapper.findAll();
    }

    @Override
    public List findById(int id) {
        return videoMapper.findById(id);
    }

    @Override
    public int update(Video video) {
        return videoMapper.update(video);
    }

    @Override
    public int del(int id) {
        return videoMapper.dele(id);
    }

    @Override
    public int insert(Video video) {
        return videoMapper.inset(video);
    }
}
