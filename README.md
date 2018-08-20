# spring-helloworld

TODO: implement logback

TODO: set logging level via configurationproperties
I borrowed the starting point for this project from:  https://www.youtube.com/watch?v=27I1M5RLplE


It's meant to be a basic spring boot rest project with configuration and logging compatible with docker.  I think I have  a runtime configuration example working now but I'd like to make sure that the approach is a good one.

Open problems to solve:


1) I want to figure out logging before I get to far into the real project. In the end, I'll be logging within a docker environment. I think spring boot logs to STDOUT by default, but I really want to test this to understand how , for example, multi-line log entries get converted to log objects by the docker driver(). 

Is this a good approach?  If so, how to I make the confgi file a part of my jar in the build process?  ANd then I think I need to be able to override the logging level at runtime.
https://www.baeldung.com/spring-boot-logging


2) when trying to do that, I ran gradlew build, which fails unless I force it to ignore :test failures by putting this in the gradle.build
```
test {
	ignoreFailures = true
}
```

I'd reall ylike to figure out how that's supposed to work and actually solve the problem
