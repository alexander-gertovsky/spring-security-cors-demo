

## See also (Tools and libs)
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
```shell
# run the application locally
./gradlew bootRun
```

```shell
# Print out dependencies:
./gradlew dependencies
```

```shell
# Print out dependencies:
./gradlew dependencies --configuration compileClasspath
```

## Tasks
- [X] Create an empty application with a hello-world method.
- Write the general documentation of the project
  - [ ] Write the description of the project
  - [ ] Write the instructions to start the project
  - [ ] Write the boundary of the project
  - [ ] Write sea also
- [X] Configure the spring-security 
  - [X] with enabled CORS configuration
  - [X] and disabled authentication
- Test and demo
  - [ ] Check on https://cors-test.codehappy.dev
  - [ ] Create the local cross-domain test
    - [ ] Write the instruction

## Open questions
- How to disable the initialization of the AuthenticationManager and the UserDetails when I do not need them?