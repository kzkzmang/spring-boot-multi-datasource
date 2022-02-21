package kr.co.test.config.database;

public class DataSourceManager {
    private static ThreadLocal<SetDataSource.DataSourceType> currentDataSourceName = new ThreadLocal<>();

    public static void setCurrentDataSourceName(SetDataSource.DataSourceType dataSourceType) {
        currentDataSourceName.set(dataSourceType);
    }

    public static SetDataSource.DataSourceType getCurrentDataSourceName() {
        return currentDataSourceName.get();
    }

    public static void removeCurrentDataSourceName() {
        currentDataSourceName.remove();
    }

}
