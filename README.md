# Spring boot Multi DataSource Setting

스프링 부트 멀티 데이터 소스입니다.
기본적으로 Mysql master-slave로 구성되어 있으며 Transaction의 read-only가 true이면 slave의 DataSource를 
가져오고 false(기본값)일 때 master의 DataSource를 가져옵니다.

추가적으로 다른 DataSource를 추가할 수 있습니다.

해당 프로젝트에는 2개의 mysql (master, slave)와 postgresql로 구성되어 있습니다.

# DataSource Select
DataSource를 선택해서 가져오고 싶다면 @SetDataSource Annotation으로 가져올 수 있습니다.
SetDataSource.java를 참고해주세요.
```java
@SetDataSource(dataSourceType = DataSourceType.MASTER)
public void testRepository() {}
```
위와 같이 사용시 master에 해당하는 DataSource를 통해 쿼리문이 실행됩니다.


