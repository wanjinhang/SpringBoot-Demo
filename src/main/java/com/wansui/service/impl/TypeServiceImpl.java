package com.wansui.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wansui.pojo.Type;
import com.wansui.service.TypeService;
import com.wansui.mapper.TypeMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2023-10-12 14:26:39
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

}




