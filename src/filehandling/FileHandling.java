package filehandling;

import javafx.scene.transform.Scale;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {

 /*       FileOutputStream outputStream=
                new FileOutputStream("/home/melayer-01/java22July.txt");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  your msg : ");
        byte[] bytes=scanner.nextLine().getBytes();
        outputStream.write(bytes);
        outputStream.close();
*/

        FileInputStream inputStream=
                new FileInputStream("/home/melayer-01/Documents/java22July.txt");
        int i=0;
        while((i=inputStream.read())!=-1){
            System.out.print((char)i);
        }


    }

}
