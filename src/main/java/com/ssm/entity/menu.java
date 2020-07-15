package com.ssm.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class menu implements Serializable {
    private Integer menu_id;
    private String  name;
    private List<sub> subs;

}
