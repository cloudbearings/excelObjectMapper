package com.hugodesmarques.excelobjectmapper.parser;

/**
 * Created by hugomarques on 4/6/15.
 */
public interface ExcelParser {

    public <T extends Object> T getObjects(T entity);

}
