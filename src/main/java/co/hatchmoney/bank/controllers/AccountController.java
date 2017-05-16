package co.hatchmoney.bank.controllers;

import co.hatchmoney.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Phil on 04/05/2017.
 */
@Controller
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService useAccountService ) {
        this.accountService = useAccountService;
    }

    @RequestMapping("/balance")
    @ResponseBody
    public String balance() {
        return accountService.getBalance();
    }

    @RequestMapping("/transactions")
    @ResponseBody
    public String transactions() {
        return accountService.getTransactions();
    }


}
