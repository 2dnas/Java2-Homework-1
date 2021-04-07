package ge.btu.sandro.shanshiashvili.currency.service;

import ge.btu.sandro.shanshiashvili.currency.model.Currency;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/currencyManager")
public class currencyController {


    @GET
    @Path("/currency")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> getCurrencies() {
        List<Currency> currencyList=new ArrayList<>();
        currencyList.add(new Currency("USD",3.16, 3.2));
        currencyList.add(new Currency("EUR",3.425, 3.475));
        currencyList.add(new Currency("GBP",3.84, 3.94));
        currencyList.add(new Currency("RUB",4.12, 4.3));
        currencyList.add(new Currency("TRY",0.4, 0.47));
        currencyList.add(new Currency("AZN",1.6, 1.84));
        return currencyList;
    }

    @GET
    @Path("/getCurrency/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public Currency getCurrency(@PathParam("title") String title) {

        for (int i = 0; i < getCurrencies().size();i++){
            if(getCurrencies().get(i).getTitle().equals(title)){
                return getCurrencies().get(i);
            }
        }
        return null;
    }



}