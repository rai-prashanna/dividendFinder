
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
    "salDataId",
    "datum",
    "percentage"
})
@Generated("jsonschema2pojo")
public class Row {

    @JsonProperty("label")
    private String label;
    @JsonProperty("salDataId")
    private String salDataId;
    @JsonProperty("datum")
    private List<String> datum;
    @JsonProperty("percentage")
    private Boolean percentage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Row() {
    }

    /**
     * 
     * @param datum
     * @param salDataId
     * @param percentage
     * @param label
     */
    public Row(String label, String salDataId, List<String> datum, Boolean percentage) {
        super();
        this.label = label;
        this.salDataId = salDataId;
        this.datum = datum;
        this.percentage = percentage;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("salDataId")
    public String getSalDataId() {
        return salDataId;
    }

    @JsonProperty("salDataId")
    public void setSalDataId(String salDataId) {
        this.salDataId = salDataId;
    }

    @JsonProperty("datum")
    public List<String> getDatum() {
        return datum;
    }

    @JsonProperty("datum")
    public void setDatum(List<String> datum) {
        this.datum = datum;
    }

    @JsonProperty("percentage")
    public Boolean getPercentage() {
        return percentage;
    }

    @JsonProperty("percentage")
    public void setPercentage(Boolean percentage) {
        this.percentage = percentage;
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
        sb.append(Row.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("salDataId");
        sb.append('=');
        sb.append(((this.salDataId == null)?"<null>":this.salDataId));
        sb.append(',');
        sb.append("datum");
        sb.append('=');
        sb.append(((this.datum == null)?"<null>":this.datum));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
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
        result = ((result* 31)+((this.datum == null)? 0 :this.datum.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.salDataId == null)? 0 :this.salDataId.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Row) == false) {
            return false;
        }
        Row rhs = ((Row) other);
        return ((((((this.datum == rhs.datum)||((this.datum!= null)&&this.datum.equals(rhs.datum)))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.salDataId == rhs.salDataId)||((this.salDataId!= null)&&this.salDataId.equals(rhs.salDataId))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))));
    }

}
