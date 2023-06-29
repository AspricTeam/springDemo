package com.aistar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data//自动写getset方法
@AllArgsConstructor//自动构造方法
//@Setter,@Getter只写一种get或set方法
public class Hero {
    String name;
    int hp,atk;
}
