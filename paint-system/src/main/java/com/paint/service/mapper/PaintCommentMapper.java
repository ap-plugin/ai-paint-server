package com.paint.service.mapper;

import com.paint.service.domain.PaintComment;

import java.util.List;

/**
 * 绘图评论Mapper接口
 *
 * @author story-x
 * @date 2023-02-26
 */
public interface PaintCommentMapper {
    /**
     * 查询绘图评论
     *
     * @param id 绘图评论主键
     * @return 绘图评论
     */
    public PaintComment selectPaintCommentById(String id);

    /**
     * 查询绘图评论列表
     *
     * @param paintComment 绘图评论
     * @return 绘图评论集合
     */
    public List<PaintComment> selectPaintCommentList(PaintComment paintComment);

    /**
     * 新增绘图评论
     *
     * @param paintComment 绘图评论
     * @return 结果
     */
    public int insertPaintComment(PaintComment paintComment);

    /**
     * 修改绘图评论
     *
     * @param paintComment 绘图评论
     * @return 结果
     */
    public int updatePaintComment(PaintComment paintComment);

    /**
     * 删除绘图评论
     *
     * @param id 绘图评论主键
     * @return 结果
     */
    public int deletePaintCommentById(String id);

    /**
     * 批量删除绘图评论
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePaintCommentByIds(String[] ids);
}