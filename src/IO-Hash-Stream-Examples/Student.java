package de.tum.cit.ase;

import java.util.Objects;

class Student {
    private String name;
    private int semester;
    private double averageGrade;

    public Student(String name, int semester, double averageGrade) {
        this.name = name;
        this.semester = semester;
        this.averageGrade = averageGrade;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        // Hash based on a combination of attributes
        result = prime * result + Objects.hashCode(name);
        result = prime * result + semester;
        long temp = Double.doubleToLongBits(averageGrade);
        result = prime * result + (int) (temp ^ (temp >>> 32));

        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}

