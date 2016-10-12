package com.guxingke.kblog.portal.api;

import com.guxingke.kblog.model.Option;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/option/")
public class OptionApi {

    @GetMapping("{id}/")
    public String findOption(@PathVariable int id) {
        log.debug("api option get id: {}", id);
        return id + "value";
    }

    @PostMapping
    @ApiOperation(notes="add option",value="add option",httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name", paramType="query",dataType="string"),
            @ApiImplicitParam(name="value",paramType="query",dataType="string")
    })
    public int addOption(Option option) {
        return option.getName().length();
    }
}
