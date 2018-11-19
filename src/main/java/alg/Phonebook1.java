package ru.zotkina.tasks.qen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Objects;

public class Phonebook1 {
    private static String FILE_NAME = "Phone book.txt";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while (!(line = bufferedReader.readLine()).equals("exit")) {
                String finalLine = line;
                br.lines().forEach(s -> {
                    if (Objects.equals(s.toUpperCase(), finalLine.toUpperCase())) {
                        try {
                            throw new MyException("Элемент присутствует в списке");

                        } catch (MyException e) {
                            e.printStackTrace();
                        }
                        System.exit(0);
                    }
                });
                fileWriter.write(line + "\n");
                fileWriter.flush();
            }
            fileWriter.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}