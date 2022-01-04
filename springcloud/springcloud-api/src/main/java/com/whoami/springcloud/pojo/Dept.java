package com.whoami.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@NoArgsConstructor
@Accessors( chain = true)//链式写法
public class Dept implements Serializable { //实体类， orm  对于数据库dept表 类表关系映射
    private Long deptno; //主键
    private String dname; //名字

//    这个数据存在哪个数据库的字段  微服务，一个服务对于一个数据库，同一个信息存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    /*
    链式写法
    Dept dept = new Dept();
    dept.setDname();
    dept.setDeptNo();

    det.setDname().setDeptNo;
     */
}
