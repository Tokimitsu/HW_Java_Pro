package _18_08_Summary;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("")))) {

            String header = reader.readLine();

            List<String[]> dataRows = new ArrayList<>();

            while (reader.ready()) {
                String dataLine = reader.readLine();
                if (dataLine.isEmpty()) {
                    break;
                }
                String[] dataParts = dataLine.split(",");

                dataRows.add(dataParts);
            }

            System.out.println("Header = " + header);
            for (String[] dataRow : dataRows) {
                System.out.println("Data row = " + Arrays.toString(dataRow));
            }
        }
    }



    // Работа с файлами?

    // Дизайн ООП
    // На вход дан CSV файл. Требуется написать модуль, который индексирует этот файл и
    // предоставляет метод для поиска индекса по значению
    // RowIndex find(fieldName: String, value: String), где RowIndex = Integer
    //



}