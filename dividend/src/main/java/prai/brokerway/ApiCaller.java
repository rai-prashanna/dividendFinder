package prai.brokerway;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCaller {
    String marketEndPoint = "https://morning-star.p.rapidapi.com/market/v2/auto-complete?q=";
    String dividendEndPoint = "https://morning-star.p.rapidapi.com/stock/v2/get-dividends?performanceId=" + "applePerformanceId";


    private HttpClient httpClient;

    public ApiCaller() {

    }

    public String doGetRequest(String endPoint) throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(endPoint))
                .header("X-RapidAPI-Key", "f56909dc08mshc050a5493f5247bp1389e5jsna2c1114008cf")
                .header("X-RapidAPI-Host", "morning-star.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public String getPerformanceId(String stockName, String stockFullName) throws IOException, InterruptedException {
    var endPoint=marketEndPoint+stockName;
    var rawResponse=doGetRequest(endPoint);
        return Utility.findPerformanceId(rawResponse,stockName,stockFullName);
    }


}

