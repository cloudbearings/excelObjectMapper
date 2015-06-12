package com.hugodesmarques.excelobjectmapper.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by hugomarques on 4/6/15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Cell {

    String row();
    String column();

}
