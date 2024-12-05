package homework6.CountryManager.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        testOriginalData();
        System.out.println();

        testSortIncreasingByPopulation();

        testSortDecreasingByPopulation();

        testSortIncreasingByArea();

        testSortDecreasingByArea();

        testSortIncreasingByGdp();

        testSortDecreasingByGdp();

        testFilterAfricaCountry();

        testFilterAsiaCountry();

        testFilterEuropeCountry();

        testFilterNorthAmericaCountry();

        testFilterOceaniaCountry();

        testFilterSouthAmericaCountry();

        testFilterMostPopulousCountries();

        testFilterLeastPopulousCountries();

        testFilterLargestAreaCountries();

        testFilterSmallestAreaCountries();

        testFilterHighestGdpCountries();

        testFilterLowestGdpCountries();
        /* TODO: write code to test program */
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);
                switch (continent) {
                    case "Africa" -> countryManager.append(new AfricaCountry(code, name, population, area, gdp));
                    case "South America" ->
                            countryManager.append(new SouthAmericaCountry(code, name, population, area, gdp));
                    case "Europe" -> countryManager.append(new EuropeCountry(code, name, population, area, gdp));
                    case "Asia" -> countryManager.append(new AsiaCountry(code, name, population, area, gdp));
                    case "North America" ->
                            countryManager.append(new NorthAmericaCountry(code, name, population, area, gdp));
                    case "Oceania" -> countryManager.append(new OceaniaCountry(code, name, population, area, gdp));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            Collections.addAll(result, splitData);
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "homework6/CountryManager/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAfricaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAsiaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        Country[] countries = countryManager.filterEuropeCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterNorthAmericaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterOceaniaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterSouthAmericaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
