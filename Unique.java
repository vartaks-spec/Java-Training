import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Unique {
    public static void main(String[] args)throws Exception{
        File file = new File("input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        StringBuilder check = new StringBuilder();
        while ((st = br.readLine()) != null)
            check.append(st);
        Set<Character> uniqueStr = new HashSet<Character>();
        for (int i = 0; i < check.length(); i++) {
            uniqueStr.add(check.charAt(i));
        }
        System.out.println(uniqueStr);
        try {
            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write(String.valueOf(uniqueStr));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }


}
