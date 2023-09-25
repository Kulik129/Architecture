package com.example.HW7.server;

import com.example.HW7.models.Employ;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployService {
    /**
     * Лист с работниками
     */
    List<Employ> employList = new ArrayList<>();

    /**
     * Метод извлечения работников
     *
     * @return лист работников
     */
    public List<Employ> listEmploy() {
        return employList;
    }

    /**
     * Метод добавления новых работников
     *
     * @return лист работников
     */
    public void add(String name, String grade, int age) {
        Employ employ = new Employ(name, grade, age);
        employList.add(employ);
    }

}
