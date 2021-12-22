package com.whoami.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDyanmic {
    private int id;
    private String name;
    private int sex;
    private int age;
    private SubjectDyanmic subjcet;
}
