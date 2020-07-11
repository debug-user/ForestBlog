package com.liuyanzhao.ssm.blog.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author liuyanzhao
 */
@Data
public class Article implements Serializable{

    private static final long serialVersionUID = 5207865247400761539L;

    private Integer articleId;

    private Integer articleUserId;

    private String articleTitle;

    private Integer articleViewCount;

    private Integer articleCommentCount;

    private Integer articleLikeCount;

    private Date articleCreateTime;

    private Date articleUpdateTime;

    private Integer articleIsComment;

    private Integer articleStatus;

    private Integer articleOrder;

    private String articleContent;

    private String articleSummary;

    private Integer articleTop;

    private transient User user;

    private transient List<Tag> tagList;

    private transient List<Category> categoryList;
}