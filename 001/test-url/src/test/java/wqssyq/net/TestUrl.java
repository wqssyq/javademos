package wqssyq.net;

import java.net.URLStreamHandler;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class TestUrl {

  @Test
  public void test01() {
    URLStreamHandler handler = URL.getMyURLStreamHandler("file");
    log.info("handler : {}", handler);

    handler = URL.getMyURLStreamHandler("jar");
    log.info("handler : {}", handler);
  }

  @Test
  public void test02() {
    wqssyq.net.URLStreamHandler handler = URL.getURLStreamHandler("file");
    log.info("handler : {}", handler);
  }

}



















