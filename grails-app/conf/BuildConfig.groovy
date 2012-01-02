grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
	// inherit Grails' default dependencies
	inherits("global") {
		// uncomment to disable ehcache
		// excludes 'ehcache'
	}
	log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	repositories {
		grailsCentral()
		// uncomment the below to enable remote dependency resolution
		// from public Maven repositories
		//mavenCentral()
		//mavenLocal()
		//mavenRepo "http://snapshots.repository.codehaus.org"
		//mavenRepo "http://repository.codehaus.org"
		//mavenRepo "http://download.java.net/maven/2/"
		//mavenRepo "http://repository.jboss.com/maven2/"
	}
	dependencies {
		// specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
		compile 'com.restfb:restfb:1.6.9'
		compile 'commons-codec:commons-codec:1.5'
		// runtime 'mysql:mysql-connector-java:5.1.5'
	}

	plugins {
		build(":tomcat:$grailsVersion",
			  ":release:1.0.0.RC3") {
			export = false
		}
		// Twitter bootstrap and resources plugins (only for development)
		provided ":twitter-bootstrap:1.4.0.13",
				 ":resources:1.1.5"
	}
}