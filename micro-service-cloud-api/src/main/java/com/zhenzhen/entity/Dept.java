package com.zhenzhen.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor  //无参构造
@Data // 提供类的get、set、equals、hashCode、canEqual、toString 方法
@Accessors(chain = true) //链式访问，该注解设置chain=true，生成setter方法返回this（也就是返回的是对象），代替了默认的返回void。
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}
