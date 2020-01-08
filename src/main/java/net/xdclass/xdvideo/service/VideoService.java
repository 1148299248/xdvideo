package net.xdclass.xdvideo.service;

import net.xdclass.xdvideo.doman.Video;

import java.util.List;

public interface VideoService {

    List find();
    List findById(int id);
    int update(Video video);
    int del(int id );
    int insert(Video video);
}
