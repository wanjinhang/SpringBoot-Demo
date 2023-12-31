package com.wansui.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author wansui
 * @TableName news_headline
 * @date 2023/10/12
 */

@Data
public class Headline implements Serializable {
    private Integer hid;

    private String title;

    private String article;

    private Integer type;

    private Integer publisher;

    private Integer pageViews;

    private Date createTime;

    private Date updateTime;
    @Version
    private Integer version;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}