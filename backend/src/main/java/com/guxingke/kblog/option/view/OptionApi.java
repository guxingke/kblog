package com.guxingke.kblog.option.view;

import com.guxingke.kblog.option.mapping.OptionMapper;
import com.guxingke.kblog.option.model.Option;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/option/")
public class OptionApi {

    @Resource
    private OptionMapper optionMapper;

    @GetMapping("{id}/")
    public String findOption(@PathVariable int id) {
        log.debug("api option get id: {}", id);
        return id + "value";
    }

    @GetMapping("/")
    public List<Option> listAll() {
        log.debug("list all option");
        return optionMapper.queryAllOption();
    }

    @PostMapping
    @ApiOperation(notes="add option",value="add option",httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="item", paramType="query",dataType="string"),
            @ApiImplicitParam(name="value",paramType="query",dataType="string")
    })
    public int addOption(Option option) {
        return option.getItem().length();
    }
}
