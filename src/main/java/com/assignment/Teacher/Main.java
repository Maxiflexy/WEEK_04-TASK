package com.assignment.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "/Users/gamp/Desktop/teacher-data.csv.csv";
        List<TeacherModel> teachers = new ArrayList<>();
        CSVFileReaderForTeacher.readFromCSVFile(teachers, filePath);
        CSVFileWriterForTeacher.writeToNewCSVFile(teachers);


    }
}
