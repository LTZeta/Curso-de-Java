package exercises.CollectionFrameworks;

import java.util.Map;

public class GradeBook {


    public static void main(String[] args) {

        TestResults testResults = new TestResults();

        Map<String, Integer> originalGrades = testResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = testResults.getMakeUpGrades();

        System.out.println("Final grades:");
        originalGrades.forEach((key, value) -> {

            if (value < makeUpGrades.get(key)){
                originalGrades.replace(key, value, makeUpGrades.get(key));
            }

            System.out.println("Student: " + key + ", Grade:" + originalGrades.get(key));
        });

    }
}