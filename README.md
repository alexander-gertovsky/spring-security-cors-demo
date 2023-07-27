

## See also (Tools and libs)
- About CORS
  - https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS
  - https://en.wikipedia.org/wiki/Cross-origin_resource_sharing
  - http://www.w3.org/TR/cors/
  - https://cors-test.codehappy.dev
- spring-security latest
  - https://docs.spring.io/spring-security/reference/current/index.html
  - https://docs.spring.io/spring-security/reference/current/servlet/integrations/cors.html
  - https://docs.spring.io/spring-security/reference/current/migration-7/configuration.html
- spring-security 6.1.2
  - https://docs.spring.io/spring-security/reference/6.1.2/index.html
  - https://docs.spring.io/spring-security/reference/6.1.2/servlet/integrations/cors.html
  - https://docs.spring.io/spring-security/reference/6.1.2/migration-7/configuration.html
- markdown
  - https://www.markdownguide.org/
  - https://bookdown.org/yihui/rmarkdown-cookbook/
  - https://bookdown.org/yihui/rmarkdown-cookbook/html-tabs.html
### Gradle Commands
#### run the application locally
```shell
./gradlew bootRun
```
#### print the project's dependencies
```shell
./gradlew dependencies
```

#### print the compileClasspath
```shell
./gradlew dependencies --configuration compileClasspath
```

#### Print the help of the task "dependencies"
```shell
./gradlew help --task dependencies
```


## Tasks
- [X] Create an empty application with a hello-world method.
- Write the general documentation of the project
  - [ ] Write the description of the project
  - [ ] Write the instructions to start the project
  - [ ] Write the boundary of the project
  - [ ] Write see also
- [X] Configure the spring-security 
  - [X] with enabled CORS configuration
  - [X] and disabled authentication
- Test and demo
  - [X] ~~Check with https://cors-test.codehappy.dev~~
    * https://cors-test.codehappy.dev tested on the server-side (backend) so at least I need to have a public ip.
  - [ ] Create the local cross-domain test
    - [ ] Write the instruction

## Open questions
- How to disable the initialization of the AuthenticationManager and the UserDetails when I do not need them?