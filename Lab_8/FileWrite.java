package Lab_8;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    private File file;

    public FileWrite(){
        this.file = new File("src/Lab_8/Lab_8.txt");
    }

    public void addText(String text) {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.append(text);

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        FileWrite fw = new FileWrite();
        String t;

        Scanner input = new Scanner(System.in);
        t = input.nextLine();

        fw.addText(t);
    }
}