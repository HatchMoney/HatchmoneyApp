package co.hatchmoney.bank;

import co.hatchmoney.bank.service.AccountService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Created by Phil on 11/05/2017.
 */
public class AccountServiceTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AccountServiceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AccountServiceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAccountBalance() {
        AccountService accountService = new AccountService();
        String balanceStr = accountService.getBalance();

        assertTrue( balanceStr.replace(" ", "").contains("\"balance\":\"875.95\"") );
    }
}
