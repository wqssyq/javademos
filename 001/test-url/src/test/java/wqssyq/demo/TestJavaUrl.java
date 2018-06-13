package wqssyq.demo;

import java.io.InputStream;
import java.net.URL;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

@Slf4j
public class TestJavaUrl {

  @Test
  public void testFileRead() throws Exception{
    URL url = new URL("file:/H:/wqssyq/javademos/001/test-url/src/test/java/wqssyq/demo/TestJavaUrl.java");
    InputStream is = url.openStream();
    log.info("url : {}", url);
    String str = IOUtils.toString(is, "utf-8");
    log.info("str : {}", str);
  }

  @Test
  public void testJarRead() throws Exception{
    String[] urls = {
//        "jar:file:/H:/wqssyq/javademos/001/test-url/target/test-url-0.1.1.SNAPSHOT.jar!/BOOT-INF/classes!/config/url.properties",
        "jar:file:/H:/wqssyq/javademos/001/test-url/target/test-url-0.1.1.SNAPSHOT.jar!/BOOT-INF/classes/config/url.properties",
//        "jar:file:/H:/wqssyq/javademos/001/test-url/target/test-url-0.1.1.SNAPSHOT.jar/BOOT-INF/classes/config/url.properties",
    };

    for (int i = 0; i < urls.length; i++) {
      try {
        URL url = new URL(urls[i]);
        log.info("url : {}", url);
        InputStream is = url.openStream();
        String str = IOUtils.toString(is, "utf-8");
        log.info("str : {}", str);

      } catch (Exception e) {
        log.error("err", e);
//        if (e.getCause() != null) {
//          log.error("cause", e.getCause());
//        }
      }
    }
  }

}
