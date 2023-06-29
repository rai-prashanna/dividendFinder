package prai.brokerway;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "stockName",
        "exchange",
        "highestDividendAmountLast5Years",
        "lowestDividendAmountLast5Years",
        "averageDividendAmountLast5Years"
})
@Generated("jsonschema2pojo")
public class DividendInfoModel {

    @JsonProperty("stockName")
    private String stockName;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("highestDividendAmountLast5Years")
    private Double highestDividendAmountLast5Years;
    @JsonProperty("lowestDividendAmountLast5Years")
    private Double lowestDividendAmountLast5Years;
    @JsonProperty("averageDividendAmountLast5Years")
    private Double averageDividendAmountLast5Years;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public DividendInfoModel() {
    }

    /**
     * @param highestDividendAmountLast5Years
     * @param stockName
     * @param lowestDividendAmountLast5Years
     * @param averageDividendAmountLast5Years
     * @param exchange
     */
    public DividendInfoModel(String stockName, String exchange, Double highestDividendAmountLast5Years, Double lowestDividendAmountLast5Years, Double averageDividendAmountLast5Years) {
        super();
        this.stockName = stockName;
        this.exchange = exchange;
        this.highestDividendAmountLast5Years = highestDividendAmountLast5Years;
        this.lowestDividendAmountLast5Years = lowestDividendAmountLast5Years;
        this.averageDividendAmountLast5Years = averageDividendAmountLast5Years;
    }

    @JsonProperty("stockName")
    public String getStockName() {
        return stockName;
    }

    @JsonProperty("stockName")
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("highestDividendAmountLast5Years")
    public Double getHighestDividendAmountLast5Years() {
        return highestDividendAmountLast5Years;
    }

    @JsonProperty("highestDividendAmountLast5Years")
    public void setHighestDividendAmountLast5Years(Double highestDividendAmountLast5Years) {
        this.highestDividendAmountLast5Years = highestDividendAmountLast5Years;
    }

    @JsonProperty("lowestDividendAmountLast5Years")
    public Double getLowestDividendAmountLast5Years() {
        return lowestDividendAmountLast5Years;
    }

    @JsonProperty("lowestDividendAmountLast5Years")
    public void setLowestDividendAmountLast5Years(Double lowestDividendAmountLast5Years) {
        this.lowestDividendAmountLast5Years = lowestDividendAmountLast5Years;
    }

    @JsonProperty("averageDividendAmountLast5Years")
    public Double getAverageDividendAmountLast5Years() {
        return averageDividendAmountLast5Years;
    }

    @JsonProperty("averageDividendAmountLast5Years")
    public void setAverageDividendAmountLast5Years(Double averageDividendAmountLast5Years) {
        this.averageDividendAmountLast5Years = averageDividendAmountLast5Years;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DividendInfoModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stockName");
        sb.append('=');
        sb.append(((this.stockName == null) ? "<null>" : this.stockName));
        sb.append(',');
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null) ? "<null>" : this.exchange));
        sb.append(',');
        sb.append("highestDividendAmountLast5Years");
        sb.append('=');
        sb.append(((this.highestDividendAmountLast5Years == null) ? "<null>" : this.highestDividendAmountLast5Years));
        sb.append(',');
        sb.append("lowestDividendAmountLast5Years");
        sb.append('=');
        sb.append(((this.lowestDividendAmountLast5Years == null) ? "<null>" : this.lowestDividendAmountLast5Years));
        sb.append(',');
        sb.append("averageDividendAmountLast5Years");
        sb.append('=');
        sb.append(((this.averageDividendAmountLast5Years == null) ? "<null>" : this.averageDividendAmountLast5Years));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.highestDividendAmountLast5Years == null) ? 0 : this.highestDividendAmountLast5Years.hashCode()));
        result = ((result * 31) + ((this.stockName == null) ? 0 : this.stockName.hashCode()));
        result = ((result * 31) + ((this.lowestDividendAmountLast5Years == null) ? 0 : this.lowestDividendAmountLast5Years.hashCode()));
        result = ((result * 31) + ((this.averageDividendAmountLast5Years == null) ? 0 : this.averageDividendAmountLast5Years.hashCode()));
        result = ((result * 31) + ((this.exchange == null) ? 0 : this.exchange.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DividendInfoModel) == false) {
            return false;
        }
        DividendInfoModel rhs = ((DividendInfoModel) other);
        return (((((((this.highestDividendAmountLast5Years == rhs.highestDividendAmountLast5Years) || ((this.highestDividendAmountLast5Years != null) && this.highestDividendAmountLast5Years.equals(rhs.highestDividendAmountLast5Years))) && ((this.stockName == rhs.stockName) || ((this.stockName != null) && this.stockName.equals(rhs.stockName)))) && ((this.lowestDividendAmountLast5Years == rhs.lowestDividendAmountLast5Years) || ((this.lowestDividendAmountLast5Years != null) && this.lowestDividendAmountLast5Years.equals(rhs.lowestDividendAmountLast5Years)))) && ((this.averageDividendAmountLast5Years == rhs.averageDividendAmountLast5Years) || ((this.averageDividendAmountLast5Years != null) && this.averageDividendAmountLast5Years.equals(rhs.averageDividendAmountLast5Years)))) && ((this.exchange == rhs.exchange) || ((this.exchange != null) && this.exchange.equals(rhs.exchange)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}