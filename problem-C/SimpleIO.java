import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class SimpleIO {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the file path: (your code will ask you input again and again until you input right path)");
        String[] s = readFile(sc.next());
        for (int i = 0; i < s.length; i++) {
            String s1 = "";
            int cnt = 0;
            if (s[i] != null) {
                for (int j = 0; j < s[i].length(); j++) {
                    if (s[i].charAt(j) == ' ') {
                        if (s1.toLowerCase().equals("the")) {
                            cnt++;
                        }
                        s1 = "";
                    } else {
                        s1 = s1 + s[i].charAt(j);
                    }
                }
                if (s1.toLowerCase().equals("the")) {
                    cnt++;
                }
                System.out.println(s[i] + " [" + cnt + "]");
            }
        }
    }
    public static String[] readFile(String filename){
        try {
            String[] lines = new String[1000];
            File file = new File(filename);
            int countLines = 0;
            Scanner read = new Scanner(file);
            while(read.hasNextLine()){
                lines[countLines] = read.nextLine();
                countLines++;
            }
            read.close();
            return lines;
        } catch (FileNotFoundException e) {
            return readFile(sc.next());
        }
    }
}
