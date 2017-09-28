package Directory;

import java.io.File;

public class CreateDirectory1 {

    public static void main(String[] args) {
        File dir = new File("/Users/zhamricheani/Desktop/test");

        boolean successful = dir.mkdir();
        if (successful) {
            System.out.println("directory was created successfully");
        } else {
            System.out.println("failed to create the directory");
        }
    }
}
