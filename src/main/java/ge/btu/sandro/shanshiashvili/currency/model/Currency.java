package ge.btu.sandro.shanshiashvili.currency.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Currency {

    public Currency(String title, Double buy, Double sell) {
        this.title = title;
        this.buy = buy;
        this.sell = sell;
    }

    private String title;
    private Double buy;
    private Double sell;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getBuy() {
        return buy;
    }

    public void setBuy(Double buy) {
        this.buy = buy;
    }

    public Double getSell() {
        return sell;
    }

    public void setSell(Double sell) {
        this.sell = sell;
    }
}
