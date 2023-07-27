

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
### Test using `curl`
#### Simple Request Example
- https://en.wikipedia.org/wiki/Cross-origin_resource_sharing#Simple_request_example
##### method `GET`
```shell
curl --request GET \
    --url http://localhost:8080/api/rest/hello \
    -i \
    -H 'Origin: http://test.127-0-0-0.nip.io' \
# end of command
```
```
HTTP/1.1 200 
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Thu, 27 Jul 2023 22:50:25 GMT

{"answer":"Hello World!"}
```
##### method `POST`
```shell
curl --request POST \
    --url http://localhost:8080/api/rest/hello \ 
    -i \
    -H 'Origin: http://test.127-0-0-0.nip.io' \
# end of command
```
```
HTTP/1.1 403 
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Access-Control-Allow-Origin: *
Set-Cookie: JSESSIONID=47009181B6946F5D2A9E33FF152EC373; Path=/; HttpOnly
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Thu, 27 Jul 2023 22:56:55 GMT

{"timestamp":"2023-07-27T22:56:55.536+00:00","status":403,"error":"Forbidden","path":"/api/rest/hello"}
```
##### method `DELETE`
```shell
curl --request PUT \
    --url http://localhost:8080/api/rest/hello \
    -i \
    -H 'Origin: http://test.127-0-0-0.nip.io' \
# end of command
```
```
HTTP/1.1 403 
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Transfer-Encoding: chunked
Date: Thu, 27 Jul 2023 22:58:40 GMT

Invalid CORS request
```
#### Preflight example
https://en.wikipedia.org/wiki/Cross-origin_resource_sharing#Preflight_example
##### for method `PUT`
```shell
curl --request OPTIONS \
    -- url http://localhost:8080/api/rest/hello \
    -i \
    -H 'Origin: test.127-0-0-0.nip.io' \
    -H 'Access-Control-Request-Method: PUT' \
# end of command
```

##### for method `POST`
```shell
curl --request OPTIONS \
    -- url http://localhost:8080/api/rest/hello \
    -i \
    -H 'Origin: test.127-0-0-0.nip.io' \
    -H 'Access-Control-Request-Method: POST' \
# end of command
```

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