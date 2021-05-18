package com.cbs.java_essential.ruslan.homework.lesson8.task2;

import lombok.Getter;
/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework 8 task2
 */
@Getter
public class Worker {

    private String initials;
    private String position;
    private String year;

    Worker(String initials, String position, String year) {
        this.initials = initials;
        this.position = position;
        this.year = year;
    }

    Worker() {
    }

    void setInitials(String initials) throws IllegalArgumentException {
        assert initials != null;
        if (initials.length() == 0) {
            throw new IllegalArgumentException(
                    "ФИО не введено, либо введено неверно!");
        }
        this.initials = initials;

    }

    void setPosition(String position) throws IllegalArgumentException {
        assert position != null;
        if (position.length() == 0) {
            throw new IllegalArgumentException(
                    "Должность не введена, либо введена неверно!");
        }
        this.position = position;
    }


    void setYear(String year) throws IllegalArgumentException {
        assert year != null;
        if (year.length() > 4) {
            throw new IllegalArgumentException(
                    "Год не введен, либо введен неверно!");
        }
        this.year = year;
    }

    int compareTo(Worker worker) {
        int result;
        result = (this.initials).compareTo(worker.initials);
        return result;
    }

    @Override
    public String toString() {
        return " ФИО: " + this.initials + " Должность: " + this.position + " Год: " + this.year;
    }

}

