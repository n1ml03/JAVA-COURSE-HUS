package com.countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        try (BufferedReader dataReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                
                if (dataList.size() != 6 || dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData.CountryDataBuilder(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .build();
  
                AbstractCountry country = CountryFactory.getInstance().createCountry(dataList.get(5), newCountryData);
                CountryListManager.getInstance().append(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        testOriginalData();
        testSortPopulationIncreasing();
        testSortPopulationDecreasing();
        testSortAreaIncreasing();
        testSortAreaDecreasing();
        testSortGdpIncreasing();
        testSortGdpDecreasing();
        testFilterContinent();
        testFilterCountriesMostPopulous();
        testFilterCountriesLeastPopulous();
        testFilterCountriesLargestArea();
        testFilterCountriesSmallestArea();
        testFilterCountriesHighestGdp();
        testFilterCountriesLowestGdp();
    }

    public static void init() {
        String filePath = "data/countries2.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        String codes = CountryListManager.getInstance().codeOfCountriesToString(CountryListManager.getInstance().getCountryList());
        System.out.print(codes);
    }

    public static void testSortPopulationIncreasing() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortPopulationIncreasing();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testSortPopulationIncreasing: " + codeString);
    }

    public static void testSortPopulationDecreasing() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortPopulationDecreasing();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testSortPopulationDecreasing: " + codeString);
    }

    public static void testSortAreaIncreasing() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortAreaIncreasing();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testSortAreaIncreasing: " + codeString);
    }

    public static void testSortAreaDecreasing() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortAreaDecreasing();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testSortAreaDecreasing: " + codeString);
    }

    public static void testSortGdpIncreasing() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortGdpIncreasing();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testSortGdpIncreasing: " + codeString);
    }

    public static void testSortGdpDecreasing() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortGdpDecreasing();
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testSortGdpDecreasing: " + codeString);
    }

    public static void testFilterContinent() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterContinent("Asia");
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testFilterContinent (Asia): " + codeString);
    }

    public static void testFilterCountriesMostPopulous() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortPopulationDecreasing();
        List<AbstractCountry> nMostPopulousCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nMostPopulousCountries.add(countries.get(i));
        }
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(nMostPopulousCountries);
        System.out.print(codeString);
    }

    public static void testFilterCountriesLeastPopulous() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortPopulationIncreasing();
        List<AbstractCountry> nLeastPopulousCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLeastPopulousCountries.add(countries.get(i));
        }

        String codeString = CountryListManager.getInstance().codeOfCountriesToString(nLeastPopulousCountries);
        System.out.print(codeString);
    }

    public static void testFilterCountriesLargestArea() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterCountriesLargestArea(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testFilterCountriesLargestArea: " + codeString);
    }

    public static void testFilterCountriesSmallestArea() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterCountriesSmallestArea(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testFilterCountriesSmallestArea: " + codeString);
    }

    public static void testFilterCountriesHighestGdp() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterCountriesHighestGdp(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testFilterCountriesHighestGdp: " + codeString);
    }

    public static void testFilterCountriesLowestGdp() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterCountriesLowestGdp(5);
        String codeString = CountryListManager.codeOfCountriesToString(countries);
        System.out.println("testFilterCountriesLowestGdp: " + codeString);
    }

}
