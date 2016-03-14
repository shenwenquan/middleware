package com.zte.middleware.hive.dao;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.naming.NamingException;

/**
 * Created by apple on 16/3/2.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:mvc-dispatcher-servlet.xml")
public class HiveOperationDaoTest {

    @Autowired
    HiveOperationDao dao;

    @Test
    public void testTables() {
        System.out.println(dao.queryTables(""));
    }


    @BeforeClass
    public static void setUpBeforeClass() throws NamingException {
        System.out.println("BeforeClass..............");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass................");
    }


    @Before
    public void setUp() {
        System.out.println("setUp...............");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown.............");
    }


}