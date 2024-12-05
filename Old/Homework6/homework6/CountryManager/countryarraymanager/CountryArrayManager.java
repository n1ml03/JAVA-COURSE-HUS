package homework6.CountryManager.countryarraymanager;

import java.util.ArrayList;

public class CountryArrayManager {
    private final int increment;
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (Country country : countries) {
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (Country country : countries) {
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        if (this.length - index >= 0)
            System.arraycopy(this.countries, index, this.countries, index + 1, this.length - index);

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        if (length - 1 - index >= 0)
            System.arraycopy(this.countries, index + 1, this.countries, index, length - 1 - index);

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[minIndex].getPopulation() > newArray[j].getPopulation()) {
                    minIndex = j;
                }
            }
            Country temp = newArray[minIndex];
            newArray[minIndex] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[maxIndex].getPopulation()) {
                    maxIndex = j;
                }
            }
            Country temp = newArray[maxIndex];
            newArray[maxIndex] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < newArray.length; i++) {
            double key = newArray[i].getGdp();
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = newArray[i];

        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < newArray.length; i++) {
            double key = newArray[i].getGdp();
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = newArray[i];

        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        AfricaCountry[] africaCountries = new AfricaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries[index] = (AfricaCountry) country;
                index++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        AsiaCountry[] asiaCountries = new AsiaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries[index] = (AsiaCountry) country;
                index++;
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        EuropeCountry[] europeCountries = new EuropeCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries[index] = (EuropeCountry) country;
                index++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries[index] = (NorthAmericaCountry) country;
                index++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries[index] = (OceaniaCountry) country;
                index++;
            }
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries[index] = (SouthAmericaCountry) country;
                index++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] mostPopulationCountries = new Country[howMany];
        Country[] newArray = sortByDecreasingPopulation();
        System.arraycopy(newArray, 0, mostPopulationCountries, 0, mostPopulationCountries.length);
        return mostPopulationCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] leastPopulationCountries = new Country[howMany];
        Country[] newArray = sortByIncreasingPopulation();
        System.arraycopy(newArray, 0, leastPopulationCountries, 0, leastPopulationCountries.length);
        return leastPopulationCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] largestAreaCountries = new Country[howMany];
        Country[] newArray = sortByDecreasingArea();
        System.arraycopy(newArray, 0, largestAreaCountries, 0, largestAreaCountries.length);
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] smallestAreaCountries = new Country[howMany];
        Country[] newArray = sortByIncreasingArea();
        System.arraycopy(newArray, 0, smallestAreaCountries, 0, smallestAreaCountries.length);
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] highestGdpCountries = new Country[howMany];
        Country[] newArray = sortByDecreasingGdp();
        System.arraycopy(newArray, 0, highestGdpCountries, 0, highestGdpCountries.length);
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] lowestGdpCountries = new Country[howMany];
        Country[] newArray = sortByIncreasingGdp();
        System.arraycopy(newArray, 0, lowestGdpCountries, 0, lowestGdpCountries.length);
        return lowestGdpCountries;
    }
}
