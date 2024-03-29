dataSource {
	pooled=true
	driverClassName='org.h2.Driver'
	username='sa'
	password=''
}
hibernate {
	cache {
		use_second_level_cache=true
		use_query_cache=false
		region.factory_class='net.sf.ehcache.hibernate.EhCacheRegionFactory'
	}
}
dataSource {
	pooled=true
	dbCreate='update'
	url='jdbc:mysql://localhost/zeroddbname?useUnicode=yes&characterEncoding=UTF-8'
	driverClassName='com.mysql.jdbc.Driver'
	dialect='org.hibernate.dialect.MySQL5InnoDBDialect'
	username='zerodusername'
	password='zerodpassword'
	properties {
		maxActive=50
		maxIdle=25
		minIdle=5
		initialSize=5
		minEvictableIdleTimeMillis=60000
		timeBetweenEvictionRunsMillis=60000
		maxWait=10000
		validationQuery='SELECT 1'
	}
}
