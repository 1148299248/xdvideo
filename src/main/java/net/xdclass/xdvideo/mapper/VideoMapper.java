package net.xdclass.xdvideo.mapper;

import net.xdclass.xdvideo.doman.Video;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface VideoMapper {
    @Select("select * from video")
    List<Video> findAll();
    @Select("SELECT * FROM video where id = #{id}")
    List<Video> findById(int id);
    @Update("UPDATE VIDEO SET title = #{title} WHERE id = #{id}")
    int update(Video video);
    @Delete("DELETE FROM video WHERE id = #{id}")
    int dele( int id );
    @Insert("INSERT INTO `video` ( `title`, `summary`, " +
            "`cover_img`, `view_num`, `price`, `create_time`," +
            " `online`, `point`)" +
            "VALUES" +
            "(#{title}, #{summary}, #{coverImg}, #{viewNum}, #{price},#{createTime}" +
            ",#{online},#{point});")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int inset(Video video);
}