# actuator

为 Spring Boot 整合 Actuator

## actuator

- http://127.0.0.1:181/actuator

```
{
  "_links": {
    "self": {
      "href": "http://127.0.0.1:181/actuator",
      "templated": false
    },
    "health": {
      "href": "http://127.0.0.1:181/actuator/health",
      "templated": false
    },
    "health-path": {
      "href": "http://127.0.0.1:181/actuator/health/{*path}",
      "templated": true
    },
    "info": {
      "href": "http://127.0.0.1:181/actuator/info",
      "templated": false
    }
  }
}
```

- http://127.0.0.1:181/actuator/health

```
{
  "status": "UP"
}
```

- http://127.0.0.1:181/actuator/health/{*path}

- http://127.0.0.1:181/actuator/info

```
{
  
}
```