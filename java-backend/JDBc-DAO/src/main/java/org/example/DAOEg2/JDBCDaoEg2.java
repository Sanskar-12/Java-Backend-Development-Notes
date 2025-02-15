package org.example.DAOEg2;

import org.example.DAOEg1.DataVariablesStorageLayer;
import org.example.DAOEg1.DatabaseInteractionLayer;

public class JDBCDaoEg2 {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        studentDao.addStudent(8,"Ishu"); // --> Method for Inerting Student

        DatabaseInteractionLayer databaseInteractionLayer = new DatabaseInteractionLayer();
        DataVariablesStorageLayer student = databaseInteractionLayer.getStudentName(8); // --> Method for fetching the student

        System.out.println(student.name);
    }
}
