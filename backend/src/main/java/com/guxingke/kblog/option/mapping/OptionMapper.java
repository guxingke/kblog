package com.guxingke.kblog.option.mapping;

import com.guxingke.kblog.option.model.Option;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OptionMapper {

    @Select({
            "select *",
            "from options limit 1000"
    })
    List<Option> queryAllOption();
}
