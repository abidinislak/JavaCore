package inoutOutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CustomExcercise {

    public static void main(String[] args) {


        File test = new File("/home/relax/Desktop/practice/practiceFile");


        if (test.exists()) {


            try {
                Stream<String> lines = Files.lines(Paths.get("/home/relax/Desktop/practice/practiceFile"));
                lines.forEach(line -> {

                    String[] person = line.split("/");

                    System.err.println("new persone name : " + person[0] + "and surname is " + person[1] + "and location is : " + person[2]);


                });
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
