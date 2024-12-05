package com.countrylistmanager;

public class CountryFactory {
    public static CountryFactory instance;

    private CountryFactory() {

    }

    public static CountryFactory getInstance() {
        if (instance == null) {
            instance = new CountryFactory();
        }
        return instance;
    }

    public AbstractCountry createCountry(String type, CountryData data) {
        switch (type) {
            case "Asia":
                return new AsiaCountry(data);
            case "North America":
                return new NorthAmericaCountry(data);
            case "South America":
                return new SouthAmericaCountry(data);
            case "Oceania":
                return new OceaniaCountry(data);
            case "Africa":
                return new AfricaCountry(data);
            default:
                return new EuropeCountry(data);
        }
    }
}
