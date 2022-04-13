import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        AppData appData = new AppData("Value1,Value2,Value3");
        appData.setData(new int[][]{{100, 200, 300}, {400, 500, 600}, {700, 800, 900}});
        FileWriter fileWriterHeader = new FileWriter("file1.csv", false);
        fileWriterHeader.write(appData.getHeaderString());
        fileWriterHeader.write(appData.stringData());



        AppData appDataRead = new AppData(new FileReader("file1.csv"));
        appDataRead.readAll();
        System.out.println(Arrays.toString(appDataRead.getHeader()));
        AppData.show2dArray(appDataRead.getData());
    }

}

