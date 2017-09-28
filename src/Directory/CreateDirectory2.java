package Directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory2 {

    public static void main(String[] args) {

        Path path = Paths.get("/Users/zhamricheani/Desktop/test");
        //if directory exists?
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        } else {
            System.out.println("Already exist");
        }

    }

}
