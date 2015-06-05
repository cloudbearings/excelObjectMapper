package com.hugodesmarques.excelobjectmapper.entities;

import com.hugodesmarques.excelobjectmapper.annotations.Column;
import lombok.Data;

/**
 * Created by hugomarques on 4/6/15.
 */
@Data
public class Person {

    @Column(name="NAME")
    private String name;

    @Column(name="ID")
    private String id;
}
