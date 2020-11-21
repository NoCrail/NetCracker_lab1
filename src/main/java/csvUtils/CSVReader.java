package csvUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class CSVReader {
    private final File file;

    public CSVReader(File file) {
        this.file = file;
    }

    public static File getFileFromResource(String fileName) throws URISyntaxException {
        ClassLoader classLoader = CSVReader.class.getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null)
            throw new IllegalArgumentException("File not found " + fileName);
        else
            return new File(resource.toURI());
    }


    public String[] readLines() {
        String[] lines = new String[10];
        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (i == lines.length)
                    lines = expand(lines);

                lines[i++] = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] linesTrim = new String[i];
        System.arraycopy(lines, 0, linesTrim, 0, i);
        return linesTrim;
    }

    private String[] expand(String[] data) {
        String[] tmp = data.clone();
        int size = tmp.length;
        data = new String[tmp.length << 1];
        System.arraycopy(tmp, 0, data, 0, size);

        return data;
    }
}