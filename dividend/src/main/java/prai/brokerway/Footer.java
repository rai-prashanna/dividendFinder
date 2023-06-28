
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
    "asOfLabel",
    "distributionCurrency",
    "asOfDate"
})
@Generated("jsonschema2pojo")
public class Footer {

    @JsonProperty("asOfLabel")
    private String asOfLabel;
    @JsonProperty("distributionCurrency")
    private String distributionCurrency;
    @JsonProperty("asOfDate")
    private String asOfDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Footer() {
    }

    /**
     * 
     * @param asOfLabel
     * @param distributionCurrency
     * @param asOfDate
     */
    public Footer(String asOfLabel, String distributionCurrency, String asOfDate) {
        super();
        this.asOfLabel = asOfLabel;
        this.distributionCurrency = distributionCurrency;
        this.asOfDate = asOfDate;
    }

    @JsonProperty("asOfLabel")
    public String getAsOfLabel() {
        return asOfLabel;
    }

    @JsonProperty("asOfLabel")
    public void setAsOfLabel(String asOfLabel) {
        this.asOfLabel = asOfLabel;
    }

    @JsonProperty("distributionCurrency")
    public String getDistributionCurrency() {
        return distributionCurrency;
    }

    @JsonProperty("distributionCurrency")
    public void setDistributionCurrency(String distributionCurrency) {
        this.distributionCurrency = distributionCurrency;
    }

    @JsonProperty("asOfDate")
    public String getAsOfDate() {
        return asOfDate;
    }

    @JsonProperty("asOfDate")
    public void setAsOfDate(String asOfDate) {
        this.asOfDate = asOfDate;
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
        sb.append(Footer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("asOfLabel");
        sb.append('=');
        sb.append(((this.asOfLabel == null)?"<null>":this.asOfLabel));
        sb.append(',');
        sb.append("distributionCurrency");
        sb.append('=');
        sb.append(((this.distributionCurrency == null)?"<null>":this.distributionCurrency));
        sb.append(',');
        sb.append("asOfDate");
        sb.append('=');
        sb.append(((this.asOfDate == null)?"<null>":this.asOfDate));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.distributionCurrency == null)? 0 :this.distributionCurrency.hashCode()));
        result = ((result* 31)+((this.asOfDate == null)? 0 :this.asOfDate.hashCode()));
        result = ((result* 31)+((this.asOfLabel == null)? 0 :this.asOfLabel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Footer) == false) {
            return false;
        }
        Footer rhs = ((Footer) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.distributionCurrency == rhs.distributionCurrency)||((this.distributionCurrency!= null)&&this.distributionCurrency.equals(rhs.distributionCurrency))))&&((this.asOfDate == rhs.asOfDate)||((this.asOfDate!= null)&&this.asOfDate.equals(rhs.asOfDate))))&&((this.asOfLabel == rhs.asOfLabel)||((this.asOfLabel!= null)&&this.asOfLabel.equals(rhs.asOfLabel))));
    }

}
