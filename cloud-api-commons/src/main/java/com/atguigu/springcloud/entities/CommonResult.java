package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: csliuping@163.com
 * @date: 2020/11/17 14:10
 * @description:
 */
@Data
@AllArgsConstructor //全参构造
@NoArgsConstructor //空参构造
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
