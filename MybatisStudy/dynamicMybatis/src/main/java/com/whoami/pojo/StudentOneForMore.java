package com.whoami.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：WHOAMI
 * @date ：Created in 2021/12/23 10:19
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentOneForMore {
    private int id;
    private String name;
    private int sex;
    private int age;
    private int subjectId;
}
