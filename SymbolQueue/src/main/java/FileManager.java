import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public interface FileManager {
    static String readFile(String src){
        StringBuilder content = new StringBuilder();
        try {
            BufferedReader reader =
                    new BufferedReader(
                        new FileReader(src)
                    );
            String line;
            while((line = reader.readLine()) != null){
                content.append(line).append("\n");
            }
            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return content.toString();
    }

    static void writeFile(String src, String content){
        try {
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(src)
                    );
            writer.write(content);
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    static boolean createFile(String src){
        AtomicBoolean isSuccessful = new AtomicBoolean(false);
        List<String> tokens = Arrays.asList(src.split("[/]"));
        final StringBuilder[] parts = {new StringBuilder()};
        tokens
                .forEach(token -> {
                    if(token.equals(tokens.get(tokens.size() - 1))){
                        File file = new File(parts[0].toString() + token);
                        try {
                            file.createNewFile();
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                        isSuccessful.set(true);
                    } else {
                        parts[0].append(token).append("/");
                        File directory = new File(String.valueOf(parts[0]));
                        directory.mkdir();
                    }
                });
        return isSuccessful.get();
    }
}
