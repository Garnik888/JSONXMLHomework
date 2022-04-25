package model;

import java.util.Objects;

public class PhoneNumber {
    private String phoneNumberType;
    private String phone;

    public PhoneNumber() {

    }

    public PhoneNumber(String phoneNumberType, String phone) {
        this.phoneNumberType = phoneNumberType;
        this.phone = phone;
    }

    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(phoneNumberType, that.phoneNumberType) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumberType, phone);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumberType='" + phoneNumberType + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
