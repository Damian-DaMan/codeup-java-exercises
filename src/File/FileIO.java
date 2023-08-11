//package File;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class FileIO {
//    public static void main(String[] args) {
//        // =========== Making the path to this object.
//        Path FileIO = Paths.get("src/File//FileIO.java");
//        System.out.println(FileIO);
//        // ============== File Methods
//        System.out.println(Files.exists(FileIO));
//        System.out.println(Files.exists(Paths.get("bob.txt")));
//
//        String directory = "data";
//        String fileName = "info.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, fileName);
//
//        System.out.println(dataFile);
//
//        if(!Files.exists(dataDirectory)){
//            try {
//                Files.createDirectories(dataDirectory);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    if(!Files.exists(dataFile)) {
//        try {
//            Files.createFile(dataFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
