package address;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeAddress {
    private String country;
    private String zipCode;
    private String road;
    private String houseNumber;

    List<String> cimlista = new ArrayList<>();

    public EmployeeAddress(String country, String zipCode, String road, String houseNumber) {
        this.country = country;
        this.zipCode = zipCode;
        this.road = road;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void addAddress(EmployeeAddress employeeAddress) {
        this.cimlista.add(employeeAddress.toString());
    }
}
