package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lirenxiang
 * @date 2020/5/3 18:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;
    private String message;
    private T data;
    
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }


}
