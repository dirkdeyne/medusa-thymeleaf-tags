# medusa-thymeleaf-tags
Thymeleaf custom dialect

POC usage custom Thymeleaf tag ...Work in progress...

- [hello](http://localhost:8080/hello/Dirk)

Given
```html
<m:medusa/> Hello, <span m:item="who">World</span>
```

Result for [localhost:8080/hello/Dirk](http://localhost:8080/hello/Dirk)
```html
🦑 Hello, <span m:item="who">Dirk</span>
```
