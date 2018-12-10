package demo;

import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void testCompare(){
        DemoModle test = new DemoModle();
        test.setDebitId("111");
        test.setDocNo("test1");
        test.setDebitName("test2");
        test.setLoginname("123");
        test.setMount("9.99");
        test.setPayNo("2333");
        test.setPayDate("2018-10-18");
        test.setStoreNo("nanchang");
        test.setStoreName("南昌");
        test.setTicketRebateNo("255");
        DemoModle test2 = new DemoModle();
        test2.setDebitId("111");
        test2.setDocNo("test1");
        test2.setDebitName("test2");
        test2.setLoginname("123");
        test2.setMount("9.99");
        test2.setPayNo("2333");
        test2.setPayDate("2018-10-18");
        test2.setStoreNo("nanchang");
        test2.setStoreName("南昌");
        test2.setTicketRebateNo("255");
        assert test.compare(test2);
    }
}
