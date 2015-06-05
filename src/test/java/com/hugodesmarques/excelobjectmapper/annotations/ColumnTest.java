package com.hugodesmarques.excelobjectmapper.annotations;

import com.hugodesmarques.excelobjectmapper.entities.Person;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;


/**
 * Created by hugomarques on 4/6/15.
 */
public class ColumnTest {

    @Before
    public void setup() {

    }

    @Test
    public void testGetColumnNames() {
        final Field[] personFields = Person.class.getDeclaredFields();
        final List<String> columnNames = Arrays.asList(personFields).stream()
                .map(field -> field.getAnnotation(Column.class).name())
                .collect(Collectors.toList());
        assertThat(columnNames, contains("NAME", "ID"));
    }

}
