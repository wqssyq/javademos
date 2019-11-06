package wqssyq.demo;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import wqssyq.net.URL;

@Slf4j
public class TestBigDecimal {

    @Test
    public void test01() {
        BigDecimal d1 = new BigDecimal(100);
        log.info("d1 : {}", d1);
    }

    @Test
    public void test02() {
        BigDecimal d1 = new BigDecimal(100);
        log.info("d1 : {}", d1.toPlainString());
//        d1.
    }

    @Test
    public void test03() {
        BigDecimal d1 = new BigDecimal("1E11");
        log.info("toPlainString : {}", d1.toPlainString());
        log.info("toEngineeringString : {}", d1.toEngineeringString());
        log.info("toString : {}", d1.toString());
    }

    @Test
    public void test04() {
//        BigDecimal d1 = new BigDecimal("1E11");
//        BigDecimal d1 = new BigDecimal("123456789012345678901234567890");
        BigDecimal d1 = new BigDecimal("1.23456789012345678901234567890E50");
        log.info("toPlainString : {}", d1.toPlainString());
        log.info("toEngineeringString : {}", d1.toEngineeringString());
        log.info("toString : {}", d1.toString());
    }

}
