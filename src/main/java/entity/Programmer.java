package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Programmer {
    private String firstName;
    private String lastName;
    private String country;
    private Map<String, String> countyOptions = new LinkedHashMap<>();
    private String favoriteLanguage;
    private List<String> favoriteLanguageList = new ArrayList<>();

    public Programmer() {
        constructCountryOptions();
        constructFavoriteLanguageList();
    }

    private void constructCountryOptions(){
        countyOptions.put("CAN", "Canada");
        countyOptions.put("NL", "Netherlands");
    }
    private void constructFavoriteLanguageList(){
        favoriteLanguageList.add("Java");
        favoriteLanguageList.add("C#");
        favoriteLanguageList.add("Python");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Map<String, String> getCountryOptions() {
        return countyOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getFavoriteLanguageList(){
        return favoriteLanguageList;
    }
}
