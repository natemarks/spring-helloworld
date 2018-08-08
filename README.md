# spring-helloworld
I borrowed the starting point for this project from:  https://www.youtube.com/watch?v=27I1M5RLplE


It's meant to be a basic spring boot rest project with configuration and logging compatible with docker.  I think I have  a runtime configuration example working now but I'd like to make sure that the approach is a good one.

Open problems to solve:
1) I have the gradlew build working. it creates the container jar file in build/libs.  I Tried to follow some examples to get it to run in docker but I'm getting java errors. Maybe you can help me fix them.
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'helloWorld': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'RESPONSE_STRING' in value "${RESPONSE_STRING}"
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:378) ~[spring-beans-5.0.8.RELEASE.jar!/:5.0.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1341) ~[spring-beans-5.0.8.RELEASE.jar!/:5.0.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:572) ~[spring-beans-5.0.8.RELEASE.jar!/:5.0.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:495) ~[spring-beans-5.0.8.RELEASE.jar!/:5.0.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:317) ~[spring-beans-5.0.8.RELEASE.jar!/:5.0.8.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.0.8.RELEASE.jar!/:5.0.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:315) ~[spring-beans-5.0.8.RELEASE.jar!/:5.0.8.RELEASE]

2) when trying to do that, I ran gradlew build, which fails unless I force it to ignore :test failures by putting this in the gradle.build
```
test {
	ignoreFailures = true
}
```

I'd reall ylike to figure out how that's supposed to work and actually solve the problem

3) logging: In the end, I'll be logging within a docker environment. I thing spring boot logs to STDOUT by default, but I really want to tests this to understand how , for examle, muytli-line log entries get converted to log objects by the docker driver().

