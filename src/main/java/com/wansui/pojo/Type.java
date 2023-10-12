package com.wansui.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * @author wansui
 * @TableName news_type
 * @date 2023/10/12
 */

@Data
public class Type implements Serializable {
    private Integer tid;

    private String tname;
    @Version
    private Integer version;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}