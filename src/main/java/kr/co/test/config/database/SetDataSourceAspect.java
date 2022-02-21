package kr.co.test.config.database;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SetDataSourceAspect {

    @Before("@annotation(kr.co.test.config.database.SetDataSource) && @annotation(target)")
    public void setDataSource(SetDataSource target) {
        if(
            target.dataSourceType() == SetDataSource.DataSourceType.MASTER
            || target.dataSourceType() == SetDataSource.DataSourceType.SLAVE
            || target.dataSourceType() == SetDataSource.DataSourceType.PGSQL
        ) {
            DataSourceManager.setCurrentDataSourceName(target.dataSourceType());
        }
    }
}
