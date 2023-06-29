package prai.brokerway;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;


/**
 * Dividend finder!
 */
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        ;
        String rawSecurities = "{\n" +
                "    \"count\": 7,\n" +
                "    \"pages\": 2,\n" +
                "    \"results\": [\n" +
                "      {\n" +
                "        \"id\": \"us_security-0P000000GY\",\n" +
                "        \"name\": \"Apple Inc\",\n" +
                "        \"description\": null,\n" +
                "        \"exchange\": \"XNAS\",\n" +
                "        \"performanceId\": \"0P000000GY\",\n" +
                "        \"securityType\": \"ST\",\n" +
                "        \"ticker\": \"AAPL\",\n" +
                "        \"type\": \"us_security\",\n" +
                "        \"url\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"us_security-0P000162G2\",\n" +
                "        \"name\": \"Apple Hospitality REIT Inc\",\n" +
                "        \"description\": null,\n" +
                "        \"exchange\": \"XNYS\",\n" +
                "        \"performanceId\": \"0P000162G2\",\n" +
                "        \"securityType\": \"ST\",\n" +
                "        \"ticker\": \"APLE\",\n" +
                "        \"type\": \"us_security\",\n" +
                "        \"url\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"us_security-0P0000AHDO\",\n" +
                "        \"name\": \"Apple Rush Co Inc\",\n" +
                "        \"description\": null,\n" +
                "        \"exchange\": \"PINX\",\n" +
                "        \"performanceId\": \"0P0000AHDO\",\n" +
                "        \"securityType\": \"ST\",\n" +
                "        \"ticker\": \"APRU\",\n" +
                "        \"type\": \"us_security\",\n" +
                "        \"url\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"us_security-0P0000AGHZ\",\n" +
                "        \"name\": \"Golden Apple Oil and Gas Inc\",\n" +
                "        \"description\": null,\n" +
                "        \"exchange\": \"PINX\",\n" +
                "        \"performanceId\": \"0P0000AGHZ\",\n" +
                "        \"securityType\": \"ST\",\n" +
                "        \"ticker\": \"GAPJ\",\n" +
                "        \"type\": \"us_security\",\n" +
                "        \"url\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"com_page-asset_management_companies_bn00000bx0\",\n" +
                "        \"name\": \"Appleseed\",\n" +
                "        \"description\": \"Asset Management Companies\",\n" +
                "        \"exchange\": null,\n" +
                "        \"performanceId\": null,\n" +
                "        \"securityType\": null,\n" +
                "        \"ticker\": null,\n" +
                "        \"type\": \"com_page\",\n" +
                "        \"url\": \"https://www.morningstar.com/asset-management-companies/BN00000BX0\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"us_security-0P00006EMQ\",\n" +
                "        \"name\": \"Appleseed Investor\",\n" +
                "        \"description\": null,\n" +
                "        \"exchange\": \"XNAS\",\n" +
                "        \"performanceId\": \"0P00006EMQ\",\n" +
                "        \"securityType\": \"FO\",\n" +
                "        \"ticker\": \"APPLX\",\n" +
                "        \"type\": \"us_security\",\n" +
                "        \"url\": null\n" +
                "      }\n" +
                "    ]\n" +
                "  }";
        String rawDividends = "{\n" +
                "  \"rows\": [\n" +
                "    {\n" +
                "      \"label\": \"Dividend Per Share\",\n" +
                "      \"salDataId\": \"dividends.per.share.label\",\n" +
                "      \"datum\": [\n" +
                "        \"0.4214285713\",\n" +
                "        \"0.4614285714\",\n" +
                "        \"0.5075000000000001\",\n" +
                "        \"0.5574999999999999\",\n" +
                "        \"0.615\",\n" +
                "        \"0.705\",\n" +
                "        \"0.76\",\n" +
                "        \"0.8074999999999999\",\n" +
                "        \"0.865\",\n" +
                "        \"0.91\",\n" +
                "        \"0.96\",\n" +
                "        \"0.96\",\n" +
                "        \"0.806833\"\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"label\": \"Trailing Dividend Yield %\",\n" +
                "      \"salDataId\": \"trailing.dividends.yield.label\",\n" +
                "      \"datum\": [\n" +
                "        \"2.10\",\n" +
                "        \"1.67\",\n" +
                "        \"1.93\",\n" +
                "        \"1.93\",\n" +
                "        \"1.45\",\n" +
                "        \"1.79\",\n" +
                "        \"1.04\",\n" +
                "        \"0.61\",\n" +
                "        \"0.49\",\n" +
                "        \"0.70\",\n" +
                "        \"0.49\",\n" +
                "        \"0.49\",\n" +
                "        \"0.90\"\n" +
                "      ],\n" +
                "      \"percentage\": true\n" +
                "    },\n" +
                "    {\n" +
                "      \"label\": \"Buyback Yield %\",\n" +
                "      \"salDataId\": \"buyback.yield.label\",\n" +
                "      \"datum\": [\n" +
                "        \"4.46\",\n" +
                "        \"6.88\",\n" +
                "        \"5.95\",\n" +
                "        \"4.80\",\n" +
                "        \"3.76\",\n" +
                "        \"9.66\",\n" +
                "        \"5.13\",\n" +
                "        \"3.20\",\n" +
                "        \"2.92\",\n" +
                "        null,\n" +
                "        \"2.89\",\n" +
                "        \"2.89\",\n" +
                "        \"4.85\"\n" +
                "      ],\n" +
                "      \"percentage\": true\n" +
                "    },\n" +
                "    {\n" +
                "      \"label\": \"Total Yield %\",\n" +
                "      \"salDataId\": \"total.yield.label\",\n" +
                "      \"datum\": [\n" +
                "        \"6.56\",\n" +
                "        \"8.55\",\n" +
                "        \"7.88\",\n" +
                "        \"6.73\",\n" +
                "        \"5.21\",\n" +
                "        \"11.45\",\n" +
                "        \"6.17\",\n" +
                "        \"3.81\",\n" +
                "        \"3.41\",\n" +
                "        \"0.70\",\n" +
                "        \"3.38\",\n" +
                "        \"3.38\",\n" +
                "        \"4.94\"\n" +
                "      ],\n" +
                "      \"percentage\": true\n" +
                "    },\n" +
                "    {\n" +
                "      \"label\": \"Payout Ratio %\",\n" +
                "      \"salDataId\": \"payout.ratio.label\",\n" +
                "      \"datum\": [\n" +
                "        \"28.68\",\n" +
                "        \"28.08\",\n" +
                "        \"21.48\",\n" +
                "        \"26.23\",\n" +
                "        \"26.06\",\n" +
                "        \"22.84\",\n" +
                "        \"25.23\",\n" +
                "        \"24.24\",\n" +
                "        \"15.15\",\n" +
                "        \"14.73\",\n" +
                "        \"15.59\",\n" +
                "        \"15.59\",\n" +
                "        \"20.20\"\n" +
                "      ],\n" +
                "      \"percentage\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"columnDefs_labels\": [\n" +
                "    \"tabular.data.label.column.year\",\n" +
                "    \"2013\",\n" +
                "    \"2014\",\n" +
                "    \"2015\",\n" +
                "    \"2016\",\n" +
                "    \"2017\",\n" +
                "    \"2018\",\n" +
                "    \"2019\",\n" +
                "    \"2020\",\n" +
                "    \"2021\",\n" +
                "    \"2022\",\n" +
                "    \"dividends.headers.current\",\n" +
                "    \"dividends.headers.oneyearttm\",\n" +
                "    \"dividends.headers.fiveyear\"\n" +
                "  ],\n" +
                "  \"dividendData\": {\n" +
                "    \"label\": [\n" +
                "      \"exdividend.date.label\",\n" +
                "      \"declaration.date.label\",\n" +
                "      \"record.date.label\",\n" +
                "      \"payable.date.label\",\n" +
                "      \"dividend.type.label\",\n" +
                "      \"dividend.amount.label\"\n" +
                "    ],\n" +
                "    \"upcomingData\": [],\n" +
                "    \"dividendHistory\": [\n" +
                "      {\n" +
                "        \"year\": \"2023\",\n" +
                "        \"datum\": [\n" +
                "          [\n" +
                "            \"2023-05-12T00:00:00.000\",\n" +
                "            \"2023-05-04T00:00:00.000\",\n" +
                "            \"2023-05-15T00:00:00.000\",\n" +
                "            \"2023-05-18T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.24\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2023-02-10T00:00:00.000\",\n" +
                "            \"2023-02-01T00:00:00.000\",\n" +
                "            \"2023-02-13T00:00:00.000\",\n" +
                "            \"2023-02-16T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.23\"\n" +
                "          ]\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"year\": \"2022\",\n" +
                "        \"datum\": [\n" +
                "          [\n" +
                "            \"2022-11-04T00:00:00.000\",\n" +
                "            \"2022-10-27T00:00:00.000\",\n" +
                "            \"2022-11-07T00:00:00.000\",\n" +
                "            \"2022-11-10T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.23\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2022-08-05T00:00:00.000\",\n" +
                "            \"2022-07-28T00:00:00.000\",\n" +
                "            \"2022-08-08T00:00:00.000\",\n" +
                "            \"2022-08-11T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.23\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2022-05-06T00:00:00.000\",\n" +
                "            \"2022-04-28T00:00:00.000\",\n" +
                "            \"2022-05-09T00:00:00.000\",\n" +
                "            \"2022-05-12T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.23\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2022-02-04T00:00:00.000\",\n" +
                "            \"2022-01-27T00:00:00.000\",\n" +
                "            \"2022-02-07T00:00:00.000\",\n" +
                "            \"2022-02-10T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.22\"\n" +
                "          ]\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"year\": \"2021\",\n" +
                "        \"datum\": [\n" +
                "          [\n" +
                "            \"2021-11-05T00:00:00.000\",\n" +
                "            \"2021-10-28T00:00:00.000\",\n" +
                "            \"2021-11-08T00:00:00.000\",\n" +
                "            \"2021-11-11T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.22\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2021-08-06T00:00:00.000\",\n" +
                "            \"2021-07-27T00:00:00.000\",\n" +
                "            \"2021-08-09T00:00:00.000\",\n" +
                "            \"2021-08-12T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.22\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2021-05-07T00:00:00.000\",\n" +
                "            \"2021-04-28T00:00:00.000\",\n" +
                "            \"2021-05-10T00:00:00.000\",\n" +
                "            \"2021-05-13T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.22\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2021-02-05T00:00:00.000\",\n" +
                "            \"2021-01-27T00:00:00.000\",\n" +
                "            \"2021-02-08T00:00:00.000\",\n" +
                "            \"2021-02-11T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.205\"\n" +
                "          ]\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"year\": \"2020\",\n" +
                "        \"datum\": [\n" +
                "          [\n" +
                "            \"2020-11-06T00:00:00.000\",\n" +
                "            \"2020-10-29T00:00:00.000\",\n" +
                "            \"2020-11-09T00:00:00.000\",\n" +
                "            \"2020-11-12T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.205\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2020-08-07T00:00:00.000\",\n" +
                "            \"2020-07-30T00:00:00.000\",\n" +
                "            \"2020-08-10T00:00:00.000\",\n" +
                "            \"2020-08-13T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.205\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2020-05-08T00:00:00.000\",\n" +
                "            \"2020-04-30T00:00:00.000\",\n" +
                "            \"2020-05-11T00:00:00.000\",\n" +
                "            \"2020-05-14T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.205\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2020-02-07T00:00:00.000\",\n" +
                "            \"2020-01-28T00:00:00.000\",\n" +
                "            \"2020-02-10T00:00:00.000\",\n" +
                "            \"2020-02-13T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.1925\"\n" +
                "          ]\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"year\": \"2019\",\n" +
                "        \"datum\": [\n" +
                "          [\n" +
                "            \"2019-11-07T00:00:00.000\",\n" +
                "            \"2019-10-30T00:00:00.000\",\n" +
                "            \"2019-11-11T00:00:00.000\",\n" +
                "            \"2019-11-14T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.1925\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2019-08-09T00:00:00.000\",\n" +
                "            \"2019-07-30T00:00:00.000\",\n" +
                "            \"2019-08-12T00:00:00.000\",\n" +
                "            \"2019-08-15T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.1925\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2019-05-10T00:00:00.000\",\n" +
                "            \"2019-04-30T00:00:00.000\",\n" +
                "            \"2019-05-13T00:00:00.000\",\n" +
                "            \"2019-05-16T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.1925\"\n" +
                "          ],\n" +
                "          [\n" +
                "            \"2019-02-08T00:00:00.000\",\n" +
                "            \"2019-01-29T00:00:00.000\",\n" +
                "            \"2019-02-11T00:00:00.000\",\n" +
                "            \"2019-02-14T00:00:00.000\",\n" +
                "            \"Cash Dividend\",\n" +
                "            \"0.1825\"\n" +
                "          ]\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"quoteData\": [\n" +
                "    {\n" +
                "      \"name\": \"dividendYield\",\n" +
                "      \"label\": \"Dividend Yield\",\n" +
                "      \"salDataId\": \"dividend.yield.label\",\n" +
                "      \"date\": \"2023-06-27T00:00:00.000\",\n" +
                "      \"value\": \"0.0049\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"divReinvestmentPlan\",\n" +
                "      \"label\": \"Div Reinvestment Plan\",\n" +
                "      \"salDataId\": \"div.reinvestment.plan.label\",\n" +
                "      \"date\": \"2023-05-12T00:00:00.000\",\n" +
                "      \"value\": \"No\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"footer\": {\n" +
                "    \"asOfLabel\": \"As of\",\n" +
                "    \"distributionCurrency\": \"USD\",\n" +
                "    \"asOfDate\": \"2023-06-27T00:00:00.000\"\n" +
                "  }\n" +
                "}";

        String stockName = "apple";
        String marketEndPoint = "https://morning-star.p.rapidapi.com/market/v2/auto-complete?q=" + stockName;

        Utility utility = new Utility();
        var applePerformanceId = utility.findPerformanceId(rawSecurities,"XNAS","Apple Inc");

        String dividendEndPoint = "https://morning-star.p.rapidapi.com/stock/v2/get-dividends?performanceId=" + applePerformanceId;

        var dividends = objectMapper.readValue(rawDividends, Dividend.class);

        System.out.println("The minimum dividend amount the five last years (for Apple Inc) " + utility.getMiniumDividend(dividends));
        System.out.println("The maximum dividend amount the five last years (for Apple Inc) " + utility.getMaxDividend(dividends));
        System.out.println("The average dividend amount the five last years (for Apple Inc) " + utility.getAvgDividend(dividends));



    }
}
