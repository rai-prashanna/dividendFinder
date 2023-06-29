package prai.brokerway;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class Utility {
    static ObjectMapper objectMapper = new ObjectMapper();


    public static String findPerformanceId(String rawSecurities, String stockName, String fullName) throws JsonProcessingException {
        var securities = objectMapper.readValue(rawSecurities, StockMarket.class);
        var stockCompany = securities.getResults().stream().filter(e -> stockName.equals(e.getExchange())).filter(e -> fullName.equals(e.getName())).findAny().orElse(null);
        var performanceId = stockCompany.getPerformanceId();
        return performanceId;
    }

    public static Double getMiniumDividend(Dividend rawDividendData) throws JsonProcessingException {
        List<Double> yearlyDividends = new ArrayList<>();
        // find minimum within 1-year period
        for (DividendHistory dividendHistory : rawDividendData.getDividendData().getDividendHistory()) {
            OptionalDouble min = dividendHistory.getDatum().stream().mapToDouble(e -> Double.parseDouble(e.get(5))).min();
            yearlyDividends.add(min.getAsDouble());
        }
        // find minimum with in 5 years period
        Double min = yearlyDividends.stream().mapToDouble(v -> v).min().orElseThrow(NoSuchElementException::new);
        return min;
    }

    public static Double getMaxDividend(Dividend rawDividendData) throws JsonProcessingException {
        List<Double> yearlyDividends = new ArrayList<>();
        // find maximum within 1-year period
        for (DividendHistory dividendHistory : rawDividendData.getDividendData().getDividendHistory()) {
            OptionalDouble max = dividendHistory.getDatum().stream().mapToDouble(e -> Double.parseDouble(e.get(5))).max();
            yearlyDividends.add(max.getAsDouble());
        }
        // find maximum with in 5 years period
        Double max = yearlyDividends.stream().mapToDouble(v -> v).max().orElseThrow(NoSuchElementException::new);
        return max;
    }

    public static Double getAvgDividend(Dividend rawDividendData) throws JsonProcessingException {
        List<Double> yearlyDividends = new ArrayList<>();
        // find avg within 1-year period
        for (DividendHistory dividendHistory : rawDividendData.getDividendData().getDividendHistory()) {
            OptionalDouble avg = dividendHistory.getDatum().stream().mapToDouble(e -> Double.parseDouble(e.get(5))).average();
            yearlyDividends.add(avg.getAsDouble());
        }
        // find avg with in 5 years period
        Double avg = yearlyDividends.stream().mapToDouble(v -> v).average().orElseThrow(NoSuchElementException::new);
        return avg;
    }
}
