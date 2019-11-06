package wqssyq.demo;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class TestDKPaySignType {

    @Test
    public void test01() {
        String dc = "DC";
        log.info("DC : {}", dc.equals(DeyDKPaySignType.DC.name()));
        String dk = "DK";
        log.info("dk : {}", dk.equals(DeyDKPaySignType.DC.name()));
    }

    @Test
    public void test02() {
        DeyPaySignInfo signInfo = new DeyPaySignInfo();
        signInfo.paySignType = DeyDKPaySignType.DC;
        log.info("DC : {}", (signInfo.paySignType ==DeyDKPaySignType.DC));
        log.info("DK : {}", (signInfo.paySignType ==DeyDKPaySignType.DK));
    }

}
