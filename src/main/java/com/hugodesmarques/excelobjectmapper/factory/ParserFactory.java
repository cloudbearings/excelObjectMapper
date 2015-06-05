package com.hugodesmarques.excelobjectmapper.factory;

import com.hugodesmarques.excelobjectmapper.parser.ExcelParser;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

/**
 * Created by hugomarques on 4/6/15.
 */
public enum ParserFactory {

    INSTANCE;

    public ParserFactory getInstance() {
        return this;
    }

    public ExcelParser getParser(File file) {
        final String fileExtension = FilenameUtils.getExtension(file.getPath());
        return null;
    }
}
