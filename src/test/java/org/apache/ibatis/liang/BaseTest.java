package org.apache.ibatis.liang;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;


public class BaseTest {

    @Test
    public void test1() throws IOException {
        Reader reader = Resources
                .getResourceAsReader("org/apache/ibatis/submitted/sqlprovider/mybatis-config.xml");

        SqlSessionFactory sqlSessionFactoryForDerby = new SqlSessionFactoryBuilder().build(reader, "development-derby");

    }
}
