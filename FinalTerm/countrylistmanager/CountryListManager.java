package com.countrylistmanager;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListManager {
    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        if (instance == null) {
            instance = new CountryListManager();
        }
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        countryList.add(country);
    }

    public void add(AbstractCountry country, int index) {
        countryList.add(index, country);
    }

    public void remove(int index) {
        countryList.remove(index);
    }

    public void remove(AbstractCountry country) {
        countryList.remove(country);
    }

    public AbstractCountry countryAt(int index) {
        return countryList.get(index);
    }

    public List<AbstractCountry> sortPopulationIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(Comparator.comparingInt(AbstractCountry::getPopulation));
        return newList;
    }

    public List<AbstractCountry> sortPopulationDecreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(Comparator.comparingInt(AbstractCountry::getPopulation).reversed());
        return newList;
    }

    public List<AbstractCountry> sortAreaIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(Comparator.comparingDouble(AbstractCountry::getArea));
        return newList;
    }

    public List<AbstractCountry> sortAreaDecreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(Comparator.comparingDouble(AbstractCountry::getArea).reversed());
        return newList;
    }

    public List<AbstractCountry> sortGdpIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(Comparator.comparingDouble(AbstractCountry::getGdp));
        return newList;
    }

    public List<AbstractCountry> sortGdpDecreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        newList.sort(Comparator.comparingDouble(AbstractCountry::getGdp).reversed());
        return newList;
    }

    public List<AbstractCountry> filterContinent(String continent) {
        List<AbstractCountry> result = new LinkedList<>();
        for (AbstractCountry country : countryList) {
            if (country.getContinent().equalsIgnoreCase(continent)) {
                result.add(country);
            }
        }
        return result;
    }

    public List<AbstractCountry> filterCountriesMostPopulous(int howMany) {
        List<AbstractCountry> sortedList = sortPopulationDecreasing();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterCountriesLeastPopulous(int howMany) {
        List<AbstractCountry> sortedList = sortPopulationIncreasing();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterCountriesLargestArea(int howMany) {
        List<AbstractCountry> sortedList = sortAreaDecreasing();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterCountriesSmallestArea(int howMany) {
        List<AbstractCountry> sortedList = sortAreaIncreasing();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterCountriesHighestGdp(int howMany) {
        List<AbstractCountry> sortedList = sortGdpDecreasing();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public List<AbstractCountry> filterCountriesLowestGdp(int howMany) {
        List<AbstractCountry> sortedList = sortGdpIncreasing();
        return sortedList.subList(0, Math.min(howMany, sortedList.size()));
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
