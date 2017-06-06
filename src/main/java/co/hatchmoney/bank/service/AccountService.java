package co.hatchmoney.bank.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;
import org.json.simple.parser.JSONParser;

/**
 * Created by Phil on 04/05/2017.
 */
@Component
public class AccountService {

    public AccountService() {

    }

    public String getBalance() {
        String strDummyBalance = "{ \"balance\": \"875.95\" }";
        return getValidatedJsonString(strDummyBalance, true);
    }

    public String getTransactions() {
        String strDummyTransactions = "{ \"transactions\": [ { \"date\": \"2017-04-12\", \"payee\": \"Costa\", \"amount\": \"-3.61\" }, { \"date\": \"2017-05-04\", \"payee\": \"TFL\", \"amount\": \"-7.09\" }, { \"date\": \"2017-05-10\", \"payee\": \"Hola Guacamole\", \"amount\": \"-7.00\" } ] }";
        return getValidatedJsonString(strDummyTransactions, true);
    }

    protected String getValidatedJsonString( String chkJson, boolean bPretty ) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject transactions = (JSONObject)parser.parse(chkJson);
            if ( bPretty ) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                JsonParser jp = new JsonParser();
                JsonElement je = jp.parse(transactions.toJSONString());
                String prettyJsonString = gson.toJson(je);
                return prettyJsonString;
            } else {
                return transactions.toJSONString();
            }
        } catch (ParseException pEx) {
            return "JSON ParseException on this: " + chkJson;
        }
    }
}
