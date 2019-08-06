package properties;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class dbConFig {
	@Bean(name="DataSourcee")
public DataSource getH2Datasource() {
		DriveManagerDataSource ds=new DriveManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp//localhost/~/testbala");
		ds.setusername("bala");
		ds.setpassword("1234");
		
		System.out.println("data source object");
		return (DataSource) ds;
	}


@Bean(name="sessionFactory")
public void SessionFactory() {
	properties hibernateproperties=new properties();
	hibernateproperties.put("hibernate.hbm2dd1.auto","update");
	hibernateproperties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
}
}