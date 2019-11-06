package wqssyq.demo;


/**
 * @author Liuhao
 * @mail liuhao_8199@163.com
 * @date 18/01/30
 * @copyright ©2018 刘浩 All Rights Reserved
 * @desc 企业代扣签约类型
 */
public enum DeyDKPaySignType implements BaseEnum {
    DEYDC("电e盈代充"),
    DC("代充"),
    DK("代扣");

    private String key;

    DeyDKPaySignType(String key){
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
