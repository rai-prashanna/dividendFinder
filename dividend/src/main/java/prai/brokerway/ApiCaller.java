package prai.brokerway;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCaller {
    static String marketEndPoint = "https://morning-star.p.rapidapi.com/market/v2/auto-complete?q=";
    static String dividendEndPoint = "https://morning-star.p.rapidapi.com/stock/v2/get-dividends?performanceId=";

    static String apiKey = "f56909dc08mshc050a5493f5247bp1389e5jsna2c1114008cf";

    public static String doGetRequest(String endPoint) throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(endPoint))
                .header("X-RapidAPI-Key", apiKey)
                .header("X-RapidAPI-Host", "morning-star.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public static String getPerformanceId(String query, String stockName, String stockFullName) throws IOException, InterruptedException {
        var endPoint = marketEndPoint + query;
        var rawResponse = doGetRequest(endPoint);
        return Utility.findPerformanceId(rawResponse, stockName, stockFullName);
    }

    public static String findDividendsByStockName(String query, String stockName, String stockFullName) throws IOException, InterruptedException {
        var pID = getPerformanceId(query, stockName, stockFullName);
        var endpoint = dividendEndPoint + pID;
        var rawResponse = ApiCaller.doGetRequest(endpoint);
        return rawResponse;
    }


}

