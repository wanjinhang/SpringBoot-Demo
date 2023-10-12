package com.wansui.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * @author wansui
 * @TableName news_user
 * @date 2023/10/12
 */

@Data
public class User implements Serializable {
    private Integer uid;

    private String username;

    private String userPwd;

    private String nickName;
    @Version
    private Integer version;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}