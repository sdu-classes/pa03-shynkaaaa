import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) {
        String[] s = readFile("C:\\Users\\shynk\\Desktop\\text.txt");
        for(int i = 0; i < s.length; i++){
            if(s[i] != null) System.out.println("[" + i + "]:" + " " + s[i]);
        }
    }
    public static String[] readFile(String fileName) {
        try {
            File file = new File(fileName);
            String[] lines = new String[1000];
            int cnt = 0;
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                lines[cnt] = sc.nextLine();
                cnt++;
            }
            sc.close();
            return lines;
        }
        catch(FileNotFoundException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
