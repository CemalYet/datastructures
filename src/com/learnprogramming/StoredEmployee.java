package com.learnprogramming;

public class StoredEmployee {
    private Employee storedEmployee;
    private String key;

    public StoredEmployee(Employee storedEmployee, String key) {
        this.storedEmployee = storedEmployee;
        this.key = key;
    }

    public Employee getStoredEmployee() {
        return storedEmployee;
    }

    public String getKey() {
        return key;
    }
}
