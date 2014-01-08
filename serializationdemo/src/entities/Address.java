package entities;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: kanishka
 * Date: 1/7/14
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Address implements Serializable{
    private String postBox;
    private String street;
    private String town;
    private String countryCode;

    public Address() {

    }

    public Address(String postBox, String street, String town, String countryCode) {
        this.postBox = postBox;
        this.street = street;
        this.town = town;
        this.countryCode = countryCode;
    }

    public String getPostBox() {
        return postBox;
    }

    public void setPostBox(String postBox) {
        this.postBox = postBox;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postBox='" + postBox + '\'' +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
