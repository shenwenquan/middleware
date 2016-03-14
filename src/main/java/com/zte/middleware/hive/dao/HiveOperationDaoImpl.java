package com.zte.middleware.hive.dao;

import com.zte.common.dao.BaseSupportDao;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by apple on 16/2/28.
 */
@Repository
public class HiveOperationDaoImpl extends BaseSupportDao implements HiveOperationDao {
    @Override
    public List<String> queryTables(String schema) {


        try {
            jdbcTemplate.execute("show tables");
        } catch (DataAccessException e) {
            e.printStackTrace();

            if (e instanceof CannotGetJdbcConnectionException) {
                System.out.println("e:......iiiiii." + e.getClass());

            }
            throw e;
        }

        return null;
    }
}
