package homework1.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        List<Korpusi> shenobebi = new ArrayList<>();

        Scanner scan = new Scanner(new File("C:\\Users\\Lenovo\\IdeaProjects\\davaleba_4_4\\src\\homework1\\java\\Monacemebi1.txt"));

        while (scan.hasNextLine()) {
            shenobebi.add(new Korpusi(scan.nextLine()));
        }

        scan = new Scanner(new File("C:\\Users\\Lenovo\\IdeaProjects\\davaleba_4_4\\src\\homework1\\java\\Monacemebi2"));

        while (scan.hasNextLine()) {
            String name = scan.next();
            String surname = scan.next();
            String adress = scan.nextLine().trim();
            for (var shenoba : shenobebi) {
                if(shenoba.getMisamarti().equals(adress)){
                    shenoba.addMosaxle(new Mosaxleoba (name,surname,adress));
                    break;
                }
            }
        }
        for (var shenoba : shenobebi) {
            System.out.println(shenoba);
        }

    }
}

