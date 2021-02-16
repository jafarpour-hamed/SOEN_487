package Client;

import com.soen487.t05.client.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws IOException, SOAPException_Exception {
        WelcomeImplService service=new WelcomeImplService();
        Welcome port=service.getWelcomePort();
        String result= null;
        String mime="image/jpeg";
        try {
            result = port.getWelcomeMsg("Ali");
            System.out.println(result);
            port.addPerson(1,"Ali",30);
            port.addPerson(2,"Nick",24);
            port.addPerson(3,"Hamed",26);
            port.addPerson(4,"Kosta",28);
        } catch (MissingName_Exception e) {
            System.out.println("Your name is required.");
        }
        for (Person person : port.getPersonArray())
            System.out.print(person.getId() + " "+person.getName()+" "+person.getAge()+"\n");

        byte[] array = Files.readAllBytes(Paths.get("C:\\MyPics\\1.jpg"));
        try {
            port.uploadImage(array,mime);
            System.out.println("File Uploaded");
        } catch (IOException_Exception e) {
            e.printStackTrace();
        }
        try {
            byte[] downloadImage= new byte[0];
            downloadImage = port.downloadImage();
            FileOutputStream fileOutput = new FileOutputStream(new File("C:\\MyPics\\DownloadedImage.jpg"));
            fileOutput.write(downloadImage);
            System.out.println("File Downloaded In The Specified Path");
            fileOutput.close();
        } catch (IOException_Exception e) {
            e.printStackTrace();
        }
    }
}
