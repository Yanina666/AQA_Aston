import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private String[] header;
    private int[][] data;

    public Main(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("./file.csv");
        if (file.exists()) {
            file.createNewFile();
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("Value 1; Value 2; Value 3");
        stringList.add("100; 200; 123");
        stringList.add("300; 400; 500");
        addStringToFile(stringList, file);

        stringList = readFileToStrings(file);
        Main appData = getAppData(stringList);
        for (int a = 0; a < 3; a++) {
            System.out.print(appData.header[a] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(appData.data[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void addStringToFile(List<String> stringList, File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String s : stringList) {
                writer.write(s);
                writer.newLine();
            }
        }
    }

    public static List<String> readFileToStrings(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s;
            List<String> stringList = new ArrayList<>();
            while ((s = reader.readLine()) != null) {
                stringList.add(s);
            }
            return stringList;
        }
    }

    public static Main getAppData(List<String> stringList) {

        String[] headers1 = stringList.get(0).split("; ");

        int[][] data1 = new int[2][3];
        for (int a = 0; a < 2; a++) {
            String[] data2 = stringList.get(a + 1).split("; ");
            for (int b = 0; b < 3; b++) {
                data1[a][b] = Integer.parseInt(data2[b]);
            }
        }
        return new Main(headers1, data1);
    }
}





//    public static void main(String[] args) throws IOException {
//        File file = new File("./file.csv");
//        if (file.exists()) {
//            file.createNewFile();
//        }
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Value 1; Value 2; Value 3");
//        stringList.add("100; 200; 123");
//        stringList.add("300; 400; 500");
//        addStringToFile(stringList, file);
//
//        stringList = readFileToStrings(file);
//        System.out.println(getAppData(stringList));
//    }
//
//    public static void addStringToFile(List<String> stringList, File file) throws IOException {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
//            for (String s : stringList) {
//                writer.write(s);
//                writer.newLine();
//            }
//        }
//    }
//
//        public static List<String> readFileToStrings(File file) throws IOException {
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String s;
//                List<String> stringList = new ArrayList<>();
//                while ((s = reader.readLine()) != null) {
//                    stringList.add(s);
//                }
//                return stringList;
//            }
//        }
//    public static Main getAppData (List<String> stringList) {
//        String headersString = stringList.get(0);
//        String[] headers = headersString.split(";");
//        int[][] data = new int[headers.length][stringList.size() - 1];
//        List<String[]> listOfArrays = new ArrayList<>(stringList.size() - 1);
//        for (int i = 1; i < stringList.size(); i++) {
//            String s = stringList.get(i).trim();
//            String[] values = s.split(";");
//            listOfArrays.add(values);
//        }
//        for (int i = 0; i < listOfArrays.size(); i++) {
//            String[] values = listOfArrays.get(i);
//            for (int j = 0; j < values.length; j++) {
//                data[j][i] = Integer.parseInt(values[j].trim());
//                System.out.println(listOfArrays.get(i).toString()+ "" + values[j].toString());
//            }
//        }
//        return new Main(headers, data);
//    }
//}
//
