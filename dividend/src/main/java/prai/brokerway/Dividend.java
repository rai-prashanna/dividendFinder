
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
    "rows",
    "columnDefs_labels",
    "dividendData",
    "quoteData",
    "footer"
})
@Generated("jsonschema2pojo")
public class Dividend {

    @JsonProperty("rows")
    private List<Row> rows;
    @JsonProperty("columnDefs_labels")
    private List<String> columnDefsLabels;
    @JsonProperty("dividendData")
    private DividendData dividendData;
    @JsonProperty("quoteData")
    private List<QuoteDatum> quoteData;
    @JsonProperty("footer")
    private Footer footer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dividend() {
    }

    /**
     * 
     * @param columnDefsLabels
     * @param quoteData
     * @param footer
     * @param dividendData
     * @param rows
     */
    public Dividend(List<Row> rows, List<String> columnDefsLabels, DividendData dividendData, List<QuoteDatum> quoteData, Footer footer) {
        super();
        this.rows = rows;
        this.columnDefsLabels = columnDefsLabels;
        this.dividendData = dividendData;
        this.quoteData = quoteData;
        this.footer = footer;
    }

    @JsonProperty("rows")
    public List<Row> getRows() {
        return rows;
    }

    @JsonProperty("rows")
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    @JsonProperty("columnDefs_labels")
    public List<String> getColumnDefsLabels() {
        return columnDefsLabels;
    }

    @JsonProperty("columnDefs_labels")
    public void setColumnDefsLabels(List<String> columnDefsLabels) {
        this.columnDefsLabels = columnDefsLabels;
    }

    @JsonProperty("dividendData")
    public DividendData getDividendData() {
        return dividendData;
    }

    @JsonProperty("dividendData")
    public void setDividendData(DividendData dividendData) {
        this.dividendData = dividendData;
    }

    @JsonProperty("quoteData")
    public List<QuoteDatum> getQuoteData() {
        return quoteData;
    }

    @JsonProperty("quoteData")
    public void setQuoteData(List<QuoteDatum> quoteData) {
        this.quoteData = quoteData;
    }

    @JsonProperty("footer")
    public Footer getFooter() {
        return footer;
    }

    @JsonProperty("footer")
    public void setFooter(Footer footer) {
        this.footer = footer;
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
        sb.append(Dividend.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rows");
        sb.append('=');
        sb.append(((this.rows == null)?"<null>":this.rows));
        sb.append(',');
        sb.append("columnDefsLabels");
        sb.append('=');
        sb.append(((this.columnDefsLabels == null)?"<null>":this.columnDefsLabels));
        sb.append(',');
        sb.append("dividendData");
        sb.append('=');
        sb.append(((this.dividendData == null)?"<null>":this.dividendData));
        sb.append(',');
        sb.append("quoteData");
        sb.append('=');
        sb.append(((this.quoteData == null)?"<null>":this.quoteData));
        sb.append(',');
        sb.append("footer");
        sb.append('=');
        sb.append(((this.footer == null)?"<null>":this.footer));
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
        result = ((result* 31)+((this.columnDefsLabels == null)? 0 :this.columnDefsLabels.hashCode()));
        result = ((result* 31)+((this.quoteData == null)? 0 :this.quoteData.hashCode()));
        result = ((result* 31)+((this.footer == null)? 0 :this.footer.hashCode()));
        result = ((result* 31)+((this.dividendData == null)? 0 :this.dividendData.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rows == null)? 0 :this.rows.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dividend) == false) {
            return false;
        }
        Dividend rhs = ((Dividend) other);
        return (((((((this.columnDefsLabels == rhs.columnDefsLabels)||((this.columnDefsLabels!= null)&&this.columnDefsLabels.equals(rhs.columnDefsLabels)))&&((this.quoteData == rhs.quoteData)||((this.quoteData!= null)&&this.quoteData.equals(rhs.quoteData))))&&((this.footer == rhs.footer)||((this.footer!= null)&&this.footer.equals(rhs.footer))))&&((this.dividendData == rhs.dividendData)||((this.dividendData!= null)&&this.dividendData.equals(rhs.dividendData))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rows == rhs.rows)||((this.rows!= null)&&this.rows.equals(rhs.rows))));
    }

}
