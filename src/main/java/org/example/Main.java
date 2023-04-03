package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Quizzing App, Please select your preferred unit");
//      Creating a list of categories to choose from
        Scanner scanner = new Scanner(System.in);
        Dictionary<Integer, String> dict = new Hashtable<>();
        dict.put(1, "maths");
        dict.put(2, "English");
        dict.put(3, "Science");
        dict.put(4, "Swahili");

//      Creating an empty list to take in the keys of the dictionary to be sorted and looping through them
        List<Integer> sortedKey = new ArrayList<>();
        Enumeration<Integer> keys = dict.keys();
        while (keys.hasMoreElements()) {
            sortedKey.add(keys.nextElement());
        }
        Collections.sort(sortedKey);
//      Looping through the sorted keys and assigning it its value
        for (Integer key : sortedKey) {
            String value = dict.get(key);
            System.out.println(key + ":" + value);
        }
        // Define the questions and answers for each unit
        HashMap<String, List<Question>> units = new HashMap<>();
//          Maths Questions
        List<Question> mathsQuestions = new ArrayList<>();
        mathsQuestions.add(new Question("What is 2+2?", Arrays.asList(1, 2, 3, 4), 4));
        mathsQuestions.add(new Question("What is the square root of 16?", Arrays.asList(2, 4, 6, 8), 1));
        units.put("maths", mathsQuestions);

//        English Questions
        List<Question> englishQuestions = new ArrayList<>();
        englishQuestions.add(new Question("What is the capital of the United Kingdom?", Arrays.asList("Paris", "New York", "London", "Berlin"), 2));
        englishQuestions.add(new Question("Who wrote the novel 'Pride and Prejudice'?", Arrays.asList("Jane Austen", "George Eliot", "Virginia Woolf", "Emily Bronte"), 0));
        units.put("English", englishQuestions);

//          Getting the user input
        int userInput = scanner.nextInt();

//        Checking if the user input is valid
        String unit = dict.get(userInput);

        if (unit != null && units.containsKey(unit)) {
//              Defining the user's score
            int userScore = 0;
//            Getting the list of questions for a selected unit
            List<Question> questions = units.get(unit);

//            Looping through the questions and ask each one of them
            for (int i = 0; i < questions.size(); i++) {
                Question question = questions.get(i);
                System.out.println(question.getQuestion());

//            Showing the list of all the possible answers
                List<Object> answers = question.getAnswers();
                for (int k = 0; k < answers.size(); k++) {
                    System.out.println((k) + ":" + answers.get(k));
                }
//                Getting the user's answer
                Object userAnswer = scanner.nextInt();

//                Checking if the answer is correct
                Object correctAnswer = question.getCorrectAnswer();
                if (userAnswer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                    userScore++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + answers.get((Integer) correctAnswer));
                }
            }
            System.out.println("Your score is: " + userScore + "/" + questions.size());
        } else {
            System.out.println("Invalid input.");
        }


    }

}