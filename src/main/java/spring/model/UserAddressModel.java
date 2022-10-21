package spring.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class UserAddressModel {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "city_name")
    String cityName;

    @Column(name = "street_name")
    String streetName;

    @Column(name = "state_name")
    String stateName;

    @Column(name = "zip_code")
    String zipCode;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    UserModel user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
}
