# java demos

parent
		<groupId>wqssyq</groupId>
		<artifactId>demos-parent</artifactId>
		<version>0.1.1.SNAPSHOT</version>

```
mvn install
```

## 001

### test-url

java.net.URL how to get URLStreamHandler.

run:
```
  @Test
  public void test01() {
    URLStreamHandler handler = URL.getMyURLStreamHandler("file");
    log.info("handler : {}", handler);

    handler = URL.getMyURLStreamHandler("jar");
    log.info("handler : {}", handler);
  }
```

result:
```
19:03:03.869 [main] INFO wqssyq.net.TestUrl - handler : sun.net.www.protocol.file.Handler@42f30e0a
19:03:03.875 [main] INFO wqssyq.net.TestUrl - handler : sun.net.www.protocol.jar.Handler@769c9116
```

