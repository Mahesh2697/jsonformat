package com.employees.jsonformat.model;

import java.util.List;

public class EmployeeModel {
    private int id;
    private String name;
    private List<AddressModel> addressModel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddressModel> getAddressModel() {
        return addressModel;
    }

    public void setAddressModel(List<AddressModel> addressModel) {
        this.addressModel = addressModel;
    }
}
