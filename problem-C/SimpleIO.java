import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class SimpleIO {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
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
                if (s1.equals("the") || s1.equals("THe") || s1.equals("THE") || s1.equals("thE") || s1.equals("tHE") || s1.equals("tHe")) {
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
            throw new RuntimeException(e.getMessage());
        }
    }
}
