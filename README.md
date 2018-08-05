# spring-helloworld
I borrowed the starting point for this project from:  https://www.youtube.com/watch?v=27I1M5RLplE


It's menat to be basic spring boot rest project with configuration and logging compatible with docker.  I think I have  a runtime configuration example working now but I'd like to make sure that the approach is a good one.

Open problems to solve:
1) gradle build from the IDE works well enough for testing by creating .class files, but I need to figure out how to create a single container jar file 

2) when trying to do that, I ran gradlew build, which fails unless I force it to ignore :test failures by putting this in the gradle.build
```
test {
	ignoreFailures = true
}
```

I'd reall ylike to figure out how that's supposed to work and actually solve the problem

3) logging: In the end, I'll be logging within a docker environment. I thing spring boot logs to STDOUT by default, but I really want to tests this to understand how , for examle, muytli-line log entries get converted to log objects by the docker driver().
