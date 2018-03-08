import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class NimedeLühendamine {
    public static void main(String[] args) throws Exception {
        printPersons(readPerson("nimed.txt"));
    }

    public static ArrayList<String> readPerson(String fail) throws Exception {
        ArrayList<String> output = new ArrayList<String>();
        File file = new File(fail);
        if (!file.exists()) {
            return null;
        } else {
            Scanner sc = new Scanner(file, "UTF-8");
            while (sc.hasNextLine()) {
                output.add(sc.nextLine());
            }
        }
        return output;
    }

    public static void printPersons(ArrayList<String> sisend) {
        if (sisend != null) {
            for (int i = 0; i < sisend.size(); i++) {
                String[] line = sisend.get(i).split(" ");
                System.out.print(line[line.length - 1] + " ");
                for (int j = 0; j < line.length - 1; j++) {
                    if (line[j].indexOf('-') != -1) {
                        String[] sidekriipsuga = line[j].split("-");
                        System.out.print(sidekriipsuga[0].charAt(0) + "-");
                        System.out.print(sidekriipsuga[1].charAt(0) + ". ");
                    } else {
                        System.out.print(line[j].charAt(0) + ". ");
                    }
                }
                System.out.println();
            }
        }
    }
}

