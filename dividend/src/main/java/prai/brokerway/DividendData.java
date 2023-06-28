
package prai.brokerway;

import java.util.LinkedHashMap;
import java.util.List;
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
    "label",
    "upcomingData",
    "dividendHistory"
})
@Generated("jsonschema2pojo")
public class DividendData {

    @JsonProperty("label")
    private List<String> label;
    @JsonProperty("upcomingData")
    private List<Object> upcomingData;
    @JsonProperty("dividendHistory")
    private List<DividendHistory> dividendHistory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DividendData() {
    }

    /**
     * 
     * @param dividendHistory
     * @param upcomingData
     * @param label
     */
    public DividendData(List<String> label, List<Object> upcomingData, List<DividendHistory> dividendHistory) {
        super();
        this.label = label;
        this.upcomingData = upcomingData;
        this.dividendHistory = dividendHistory;
    }

    @JsonProperty("label")
    public List<String> getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(List<String> label) {
        this.label = label;
    }

    @JsonProperty("upcomingData")
    public List<Object> getUpcomingData() {
        return upcomingData;
    }

    @JsonProperty("upcomingData")
    public void setUpcomingData(List<Object> upcomingData) {
        this.upcomingData = upcomingData;
    }

    @JsonProperty("dividendHistory")
    public List<DividendHistory> getDividendHistory() {
        return dividendHistory;
    }

    @JsonProperty("dividendHistory")
    public void setDividendHistory(List<DividendHistory> dividendHistory) {
        this.dividendHistory = dividendHistory;
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
        sb.append(DividendData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("upcomingData");
        sb.append('=');
        sb.append(((this.upcomingData == null)?"<null>":this.upcomingData));
        sb.append(',');
        sb.append("dividendHistory");
        sb.append('=');
        sb.append(((this.dividendHistory == null)?"<null>":this.dividendHistory));
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
        result = ((result* 31)+((this.dividendHistory == null)? 0 :this.dividendHistory.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.upcomingData == null)? 0 :this.upcomingData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DividendData) == false) {
            return false;
        }
        DividendData rhs = ((DividendData) other);
        return (((((this.dividendHistory == rhs.dividendHistory)||((this.dividendHistory!= null)&&this.dividendHistory.equals(rhs.dividendHistory)))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.upcomingData == rhs.upcomingData)||((this.upcomingData!= null)&&this.upcomingData.equals(rhs.upcomingData))));
    }

}
